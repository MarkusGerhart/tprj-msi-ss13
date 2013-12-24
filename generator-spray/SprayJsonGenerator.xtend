package org.eclipselabs.spray.generator.graphiti

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.mm.spray.CreateBehavior

class SprayJsonGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val e = resource.allContents.toIterable.filter(MetaClass);
		fsa.generateFile('genspray.js', e.compile)
	}

	def compile(Iterable<MetaClass> mcs) '''
	var classdefs = [
		«FOR mc : mcs»
		{
			name: "«mc.type.name»",
			«IF mc.representedBy.eClass.name == "ConnectionInSpray"»
				«val connection = mc.representedBy as ConnectionInSpray»
				connection: "«connection.connection.dslConnection.name»",
				from: "«connection.from.EReferenceType.name»",
				to: "«connection.to.EReferenceType.name»",
			«ELSE»
				«val shape = mc.representedBy as ShapeFromDsl»
				shape: "«shape.shape.dslShape.name»",
			«ENDIF»
			«FOR behavior : mc.behaviors»
				«IF behavior.eClass.name == "CreateBehavior"»
					palette: "«(behavior as CreateBehavior).paletteCompartment»",
				«ENDIF»
			«ENDFOR»
		},
		«ENDFOR»
	]
	'''

}