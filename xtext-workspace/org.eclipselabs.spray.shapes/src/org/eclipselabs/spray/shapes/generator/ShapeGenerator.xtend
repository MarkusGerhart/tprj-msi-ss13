/*
 * generated by Xtext
 */
package org.eclipselabs.spray.shapes.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipselabs.spray.shapes.shape.ShapeDefinition
import org.eclipselabs.spray.shapes.shape.Shape
import org.eclipselabs.spray.shapes.shape.Line
import org.eclipselabs.spray.shapes.shape.RoundedRectangle
import org.eclipselabs.spray.shapes.shape.Polyline
import org.eclipselabs.spray.shapes.shape.Rectangle
import org.eclipselabs.spray.shapes.shape.Polygon
import org.eclipselabs.spray.shapes.shape.Ellipse
import org.eclipselabs.spray.shapes.shape.Text
import org.eclipselabs.spray.shapes.shape.AnchorPredefinied
import org.eclipselabs.spray.shapes.shape.AnchorManual
import org.eclipselabs.spray.shapes.shape.AnchorRelativePosition
import org.eclipselabs.spray.shapes.shape.AnchorFixPointPosition
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator
import org.eclipselabs.spray.shapes.shape.ShapeContainerElement
import org.eclipselabs.spray.shapes.shape.ConnectionDefinition
import org.eclipselabs.spray.shapes.shape.CDLine
import org.eclipselabs.spray.shapes.shape.CDPolyline
import org.eclipselabs.spray.shapes.shape.CDText
import org.eclipselabs.spray.shapes.shape.CDRectangle
import org.eclipselabs.spray.shapes.shape.CDRoundedRectangle
import org.eclipselabs.spray.shapes.shape.CDPolygon
import org.eclipselabs.spray.shapes.shape.CDEllipse

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ShapeGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val e = resource.allContents.toIterable.filter(ShapeContainerElement);
		fsa.generateFile('genshapes.js', e.compile)
	}
	
	def compile(Iterable<ShapeContainerElement> shapeContainers) '''
		var shapedefs = [
		«FOR s : shapeContainers»
			«IF s.eClass.name == "ShapeDefinition"»
				«outerShape(s as ShapeDefinition)»,
			«ENDIF»
			«IF s.eClass.name == "ConnectionDefinition"»
				«outerShape(s as ConnectionDefinition)»,
			«ENDIF»
		«ENDFOR»
		]
	'''
	
	def outerShape(ConnectionDefinition d) '''
	{
		name: "«d.name»",
		connectionType: "«d.connectionStyle»",
		placings: [
			«FOR p : d.placing»
				{
					«IF p.offset != null»
					offset: «p.offset»,
					«ENDIF»
					«IF p.distance > 0»
					distance: «p.distance»,
					«ENDIF»
					«IF p.angle > 0»
					angle: «p.angle»,
					«ENDIF»
					«IF p.shapeCon.eClass.name == "CDLine"»
					shape: «innerShape(p.shapeCon as CDLine)»,
					«ENDIF»
					«IF p.shapeCon.eClass.name == "CDPolyline"»
					shape: «innerShape(p.shapeCon as CDPolyline)»,
					«ENDIF»
					«IF p.shapeCon.eClass.name == "CDRectangle"»
					shape: «innerShape(p.shapeCon as CDRectangle)»,
					«ENDIF»
					«IF p.shapeCon.eClass.name == "CDRoundedRectangle"»
					shape: «innerShape(p.shapeCon as CDRoundedRectangle)»,
					«ENDIF»
					«IF p.shapeCon.eClass.name == "CDPolygon"»
					shape: «innerShape(p.shapeCon as CDPolygon)»,
					«ENDIF»
					«IF p.shapeCon.eClass.name == "CDEllipse"»
					shape: «innerShape(p.shapeCon as CDEllipse)»,
					«ENDIF»
					«IF p.shapeCon.eClass.name == "CDText"»
					shape: «innerShape(p.shapeCon as CDText)»,
					«ENDIF»
				},
			«ENDFOR»
		]
	}
	'''
	
	def innerShape(CDLine d) '''
	{
		name: "Line",
		params: {
			points: [
				«FOR point: d.layout.point»
				{
					x: «new Integer(point.xcor)»,
					y: «new Integer(point.ycor)»,
					curveBefore: «point.curveBefore»,
					curveAfter: «point.curveAfter»
				},
				«ENDFOR»
			]
		}
	}
	'''
	
	def innerShape(CDPolyline d) '''
	{
		name: "Polyline",
		params: {
			points: [
				«FOR point: d.layout.point»
				{
					x: «new Integer(point.xcor)»,
					y: «new Integer(point.ycor)»,
					curveBefore: «point.curveBefore»,
					curveAfter: «point.curveAfter»
				},
				«ENDFOR»
			]
		}
	}
	'''
	
	def innerShape(CDText d) '''
	{
		name: "Text",
		params: {
			«IF d.layout.common.xcor != 0 && d.layout.common.ycor != 0»
			position: {x: «d.layout.common.xcor», y: «d.layout.common.ycor»},
			«ENDIF»
			size: {width: «d.layout.common.width», height: «d.layout.common.heigth»},
			align: {
				horizontal: "«d.layout.HAlign»",
				vertical: "«d.layout.VAlign»"
			},
		}
	}
	'''

	def innerShape(CDRectangle d) '''
	{
		name: "Rectangle",
		params: {
			«IF d.layout.common.xcor != 0 && d.layout.common.ycor != 0»
			position: {x: «d.layout.common.xcor», y: «d.layout.common.ycor»},
			«ENDIF»
			size: {width: «d.layout.common.width», height: «d.layout.common.heigth»},
		},
	}
	'''

	def innerShape(CDRoundedRectangle d) '''
	{
		name: "RoundedRectangle",
		params: {
			«IF d.layout.common.xcor != 0 && d.layout.common.ycor != 0»
			position: {x: «d.layout.common.xcor», y: «d.layout.common.ycor»},
			«ENDIF»
			size: {width: «d.layout.common.width», height: «d.layout.common.heigth»},
			curve: {width: «d.layout.curveWidth», height: «d.layout.curveHeight»},
			radius: «(d.layout.curveWidth + d.layout.curveHeight) / 2.0»
		},
	}
	'''

	def innerShape(CDPolygon d) '''
	{
		name: "Polygon",
		params: {
			points: [
				«FOR point: d.layout.point»
				{
					x: «new Integer(point.xcor)»,
					y: «new Integer(point.ycor)»,
					curveBefore: «point.curveBefore»,
					curveAfter: «point.curveAfter»
				},
				«ENDFOR»
			]
		},
	}
	'''

	def innerShape(CDEllipse d) '''
	{
		name: "Ellipse",
		params: {
			«IF d.layout.common.xcor != 0 && d.layout.common.ycor != 0»
			position: {x: «d.layout.common.xcor», y: «d.layout.common.ycor»},
			«ENDIF»
			size: {width: «d.layout.common.width», height: «d.layout.common.heigth»},
		},
	}
	'''
	
	def outerShape(ShapeDefinition d) '''
	{
		name: "«d.name»",
		«val boundingbox = new ShapeSizeCalculator().getContainerSize(d)»
		«IF d.shapeLayout.minwidth > 0 || d.shapeLayout.minheight > 0
			|| d.shapeLayout.maxwidth > 0 || d.shapeLayout.maxheight > 0
			|| d.shapeLayout.stretchH != null || d.shapeLayout.stretchV != null
			|| d.shapeLayout.proportional != null
			|| boundingbox.width > 0 || boundingbox.heigth > 0
		»
		params: {
			«IF boundingbox.width > 0 && boundingbox.heigth > 0»
			size: {witdh: «boundingbox.width», height: «boundingbox.heigth»},
			«ENDIF»
			«IF d.shapeLayout.minwidth > 0»
			minWidth: «d.shapeLayout.minwidth»,
			«ENDIF»
			«IF d.shapeLayout.minheight > 0»
			minHeight: «d.shapeLayout.minheight»,
			«ENDIF»
			«IF d.shapeLayout.maxwidth > 0»
			maxWidth: «d.shapeLayout.maxwidth»,
			«ENDIF»
			«IF d.shapeLayout.maxheight > 0»
			maxHeight: «d.shapeLayout.maxheight»,
			«ENDIF»
			«IF d.shapeLayout.stretchH != null»
			stretchH: «d.shapeLayout.stretchH»,
			«ENDIF»
			«IF d.shapeLayout.stretchV != null»
			stretchV: «d.shapeLayout.stretchV»,
			«ENDIF»
			«IF d.shapeLayout.proportional != null»
			proportional: «d.shapeLayout.proportional»
			«ENDIF»
		},
		«ENDIF»
		«IF d.anchor != null»
		anchors: [
				«IF d.anchor.type.eClass.name == "AnchorPredefinied"»
					{type: "«(d.anchor.type as AnchorPredefinied).value»"},
				«ELSE»
					«val anchor = d.anchor.type as AnchorManual»
					«FOR manualAnchor: anchor.position»
						«IF manualAnchor.pos.eClass.name == "AnchorRelativePosition"»
							«val relativeAnchor = manualAnchor.pos as AnchorRelativePosition»
							{type: "relative", x: «relativeAnchor.xoffset», y: «relativeAnchor.yoffset»},
						«ELSE»
							«val fixpointAnchor = manualAnchor.pos as AnchorFixPointPosition»
							{type: "fixpoint", x: «fixpointAnchor.xcor», y: «fixpointAnchor.ycor»},
						«ENDIF»
					«ENDFOR»
				«ENDIF»
		],
		«ENDIF»
		«IF d.shape.length > 0 »
		shapes: [
			«FOR s: d.shape»
				«switchShape(s)»,
			«ENDFOR»
		]
		«ENDIF»
	}
	'''
	
	def switchShape(Shape s) {
		switch s {
			case s.eClass.name == "Line" : innerShape(s.eClass.name, (s as Line))
			case s.eClass.name == "Polyline" : innerShape(s.eClass.name, (s as Polyline))
			case s.eClass.name == "Rectangle" : innerShape(s.eClass.name, (s as Rectangle))
			case s.eClass.name == "RoundedRectangle" : innerShape(s.eClass.name, (s as RoundedRectangle))
			case s.eClass.name == "Polygon" : innerShape(s.eClass.name, (s as Polygon))
			case s.eClass.name == "Ellipse" : innerShape(s.eClass.name, (s as Ellipse))
			case s.eClass.name == "Text" : innerShape(s.eClass.name, (s as Text))
			default : "undefined"
		}
	}

	def innerShape(String name, Line d) '''
	{
		name: "«name»",
		params: {
			points: [
				«FOR point: d.layout.point»
				{
					x: «new Integer(point.xcor)»,
					y: «new Integer(point.ycor)»,
					curveBefore: «point.curveBefore»,
					curveAfter: «point.curveAfter»
				},
				«ENDFOR»
			]
		}
	}
	'''

	def innerShape(String name, Polyline d) '''
	{
		name: "«name»",
		params: {
			points: [
				«FOR point: d.layout.point»
				{
					x: «new Integer(point.xcor)»,
					y: «new Integer(point.ycor)»,
					curveBefore: «point.curveBefore»,
					curveAfter: «point.curveAfter»
				},
				«ENDFOR»
			]
		}
	}
	'''

	def innerShape(String name, Text d) '''
	{
		name: "«name»",
		params: {
			«IF d.layout.common.xcor != 0 && d.layout.common.ycor != 0»
			position: {x: «d.layout.common.xcor», y: «d.layout.common.ycor»},
			«ENDIF»
			size: {width: «d.layout.common.width», height: «d.layout.common.heigth»},
			align: {
				horizontal: "«d.layout.HAlign»",
				vertical: "«d.layout.VAlign»"
			},
		}
	}
	'''

	def innerShape(String name, Rectangle d) '''
	{
		name: "«name»",
		params: {
			«IF d.compartmentInfo != null»
			compartment: {
				layout: "«d.compartmentInfo.compartmentLayout»",
				invisible: «d.compartmentInfo.invisible»,
				«IF d.compartmentInfo.spacing > 0»
				spacing: «d.compartmentInfo.spacing»,
				«ENDIF»
				«IF d.compartmentInfo.margin > 0»
				margin: «d.compartmentInfo.margin»,
				«ENDIF»
				«IF d.compartmentInfo.stretchH != null»
				stretchH: «d.compartmentInfo.stretchH»,
				«ENDIF»
				«IF d.compartmentInfo.stretchV != null»
				stretchV: «d.compartmentInfo.stretchV»,
				«ENDIF»
			},
			«ENDIF»
			«IF d.layout.common.xcor != 0 && d.layout.common.ycor != 0»
			position: {x: «d.layout.common.xcor», y: «d.layout.common.ycor»},
			«ENDIF»
			size: {width: «d.layout.common.width», height: «d.layout.common.heigth»},
		},
		«IF d.shape.length > 0 »
		shapes: [
			«FOR s: d.shape»
				«switchShape(s)»,
			«ENDFOR»
		]
		«ENDIF»
	}
	'''

	def innerShape(String name, RoundedRectangle d) '''
	{
		name: "«name»",
		params: {
			«IF d.layout.common.xcor != 0 && d.layout.common.ycor != 0»
			position: {x: «d.layout.common.xcor», y: «d.layout.common.ycor»},
			«ENDIF»
			size: {width: «d.layout.common.width», height: «d.layout.common.heigth»},
			curve: {width: «d.layout.curveWidth», height: «d.layout.curveHeight»},
			radius: «(d.layout.curveWidth + d.layout.curveHeight) / 2.0»
		},
		«IF d.shape.length > 0 »
		shapes: [
			«FOR s: d.shape»
				«switchShape(s)»,
			«ENDFOR»
		]
		«ENDIF»
	}
	'''

	def innerShape(String name, Polygon d) '''
	{
		name: "«name»",
		params: {
			points: [
				«FOR point: d.layout.point»
				{
					x: «new Integer(point.xcor)»,
					y: «new Integer(point.ycor)»,
					curveBefore: «point.curveBefore»,
					curveAfter: «point.curveAfter»
				},
				«ENDFOR»
			]
		},
		«IF d.shape.length > 0 »
		shapes: [
			«FOR s: d.shape»
				«switchShape(s)»,
			«ENDFOR»
		]
		«ENDIF»
	}
	'''

	def innerShape(String name, Ellipse d) '''
	{
		name: "«name»",
		params: {
			«IF d.compartmentInfo != null»
			compartment: {
				layout: "«d.compartmentInfo.compartmentLayout»",
				invisible: «d.compartmentInfo.invisible»,
				«IF d.compartmentInfo.spacing > 0»
				spacing: «d.compartmentInfo.spacing»,
				«ENDIF»
				«IF d.compartmentInfo.margin > 0»
				margin: «d.compartmentInfo.margin»,
				«ENDIF»
				«IF d.compartmentInfo.stretchH != null»
				stretchH: «d.compartmentInfo.stretchH»,
				«ENDIF»
				«IF d.compartmentInfo.stretchV != null»
				stretchV: «d.compartmentInfo.stretchV»,
				«ENDIF»
			},
			«ENDIF»
			«IF d.layout.common.xcor != 0 && d.layout.common.ycor != 0»
			position: {x: «d.layout.common.xcor», y: «d.layout.common.ycor»},
			«ENDIF»
			size: {width: «d.layout.common.width», height: «d.layout.common.heigth»},
		},
		«IF d.shape.length > 0 »
		shapes: [
			«FOR s: d.shape»
				«switchShape(s)»,
			«ENDFOR»
		]
		«ENDIF»
	}
	'''

}
