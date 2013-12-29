package Ecore;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import PetrinetDSL.*;
import PetrinetDSL.impl.*;

public class WebToEcoreFactoryImpl implements WebToEcoreFactory {
	
	private static WebToEcoreFactoryImpl instance = null; 
	private PetrinetDSLFactory factory = null;
	private String name; 
	
	private WebToEcoreFactoryImpl() {
		// Initialize the model
	    PetrinetDSLPackageImpl.init();
		
	    // Retrieve the default factory singleton
		this.factory = PetrinetDSLFactory.eINSTANCE;
		this.name = "PetrinetDSL";
	}
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebToEcoreFactory getInstance() {
		if (instance == null) {
            instance = new WebToEcoreFactoryImpl();
        }
        return instance;
	}

	private Petrinet getPetrinet(Resource resource){
		Petrinet diagram = null;
	    if ( resource.getContents().isEmpty() ){
	    	diagram = this.factory.createPetrinet();
	    }else{
	    	diagram= (Petrinet) resource.getContents().get(0);
	    }
	    return diagram;
	}
	
	private Resource getResource(){
	    // Register the XMI resource factory for the .petrinet extension
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("dsl", new XMIResourceFactoryImpl());
	    ResourceSet resSet = new ResourceSetImpl();
	    Resource resource = null;
	    try{
	    	 resource = resSet.getResource(URI.createURI("diagram.dsl"),true);
	    }catch(Exception e){
	    	 resource = resSet.createResource(URI.createURI("diagram.dsl"));
	    }
	    return resource;
	}
	
	
	/* (non-Javadoc)
	 * @see Ecore.WebToEcoryFactory#createEObject(int)
	 */
	@Override
	public void createEObject( String domainObj ){		    
	    Resource resource = this.getResource();
	    if ( resource != null ){
		    try {		    	  
			      Petrinet diagram = this.getPetrinet(resource);
			      if ( diagram != null ){
				      Method method = this.factory.getClass().getMethod("create"+domainObj);
				      EObject eObj = (EObject) method.invoke(this.factory);
				      diagram.getMapelements().add((Petrinet) eObj);
				      
			    	  resource.getContents().add(diagram);
			    	  resource.save(Collections.EMPTY_MAP);
			      }
		    	  
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	    }
	}
	
	/*connection*/
	/* (non-Javadoc)
	 * @see Ecore.WebToEcoryFactory#createEObject(int, int, int)
	 */
	@Override
	public void createEObject( String domainObj, String fromObj, String toObj, int fromID, int toID ){
	    Resource resource = this.getResource();
	    if ( resource != null ){
		    try {		    	  
			      Petrinet diagram = this.getPetrinet(resource);
			      if ( diagram != null ){
				      
			    	  Method method = this.factory.getClass().getMethod("create"+domainObj);
			    	  			    	  
			    	  Class<?> domainObjClazz = Class.forName(this.name+"."+domainObj);
			    	  Object eObj = doMethod(method, method.getReturnType());
			    	  domainObjClazz.cast(eObj);
			    	  
			    	  Class<?> fromObjClazz = Class.forName(this.name+"."+fromObj);
				      Object fromEObj = (Petrinet) diagram.getMapelements().get(fromID);
				      fromObjClazz.cast(fromEObj);
				      
			    	  Class<?> toObjClazz = Class.forName(this.name+"."+toObj);
				      Object toEObj = (Petrinet) diagram.getMapelements().get(toID);
				      toObjClazz.cast(toEObj);
				      				      
				      Method methodSetFrom = eObj.getClass().getMethod("setFrom"+fromObj, fromObjClazz);
				      methodSetFrom.invoke(eObj, fromEObj);
				      Method methodSetTo = eObj.getClass().getMethod("setTo"+toObj, toObjClazz);
				      methodSetTo.invoke(eObj, toEObj);

				      ((Petrinet) fromEObj).getMapelements().add((Petrinet) eObj);
				      
			    	  resource.getContents().add(diagram);
			    	  resource.save(Collections.EMPTY_MAP);
			      }
		    	  
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	    }
	}
	
	/*compartment*/
	/* (non-Javadoc)
	 * @see Ecore.WebToEcoryFactory#createEObject(int, int)
	 */
	@Override
	public void createEObject( String domainObj, String parentObj, int parentID ){
	    Resource resource = this.getResource();
	    if ( resource != null ){
		    try {		    	  
			      Petrinet diagram = this.getPetrinet(resource);
			      if ( diagram != null ){
				      
			    	  Method method = this.factory.getClass().getMethod("create"+domainObj);
			    	  			    	  
			    	  Class<?> domainObjClazz = Class.forName(this.name+"."+domainObj);
			    	  Object eObj = doMethod(method, method.getReturnType());
			    	  domainObjClazz.cast(eObj);
			    	  
			    	  Class<?> parentObjClazz = Class.forName(this.name+"."+parentObj);
				      Object parentEObj = (Petrinet) diagram.getMapelements().get(parentID);
				      parentObjClazz.cast(parentEObj);
				      
				      ((Petrinet) parentEObj).getMapelements().add((Petrinet) eObj);
				      
			    	  resource.getContents().add(diagram);
			    	  resource.save(Collections.EMPTY_MAP);
			      }
		    	  
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	    }
	}
	
	/* 1) single object 
	 * 2) object as source with connections (connections will removed too)*
	 * 3) compartment removes all childshapes
	 * 4) object as target -> connections should be removed seperately
	 */
	/* (non-Javadoc)
	 * @see Ecore.WebToEcoryFactory#removeEObject(int)
	 */
	@Override
	public void removeEObject( String domainObj, int ID ){
	    Resource resource = this.getResource();
	    if ( resource != null ){
		    try {		    	  
			      Petrinet diagram = this.getPetrinet(resource);
			      if ( diagram != null ){
			      	  Class<?> eObjClazz = Class.forName(this.name+"."+domainObj);
				      Object eObj = (Petrinet) diagram.getMapelements().get(ID);
				      eObjClazz.cast(eObj);
				      
					  EcoreUtil.delete((EObject) eObj);
				      
			    	  resource.getContents().add(diagram);
			    	  resource.save(Collections.EMPTY_MAP);
			      }
		    	  
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	    }
	}
	
	/* connection */
	/* (non-Javadoc)
	 * @see Ecore.WebToEcoryFactory#removeEObject(int, int)
	 */
	@Override
	public void removeEObject(String domainObj, String fromObj, String toObj, int fromID, int toID){
	    Resource resource = this.getResource();
	    if ( resource != null ){
		    try {		    	  
			      Petrinet diagram = this.getPetrinet(resource);
			      if ( diagram != null ){
				      
			      	  Class<?> fromObjClazz = Class.forName(this.name+"."+fromObj);
				      Object fromEObj = (Petrinet) diagram.getMapelements().get(fromID);
				      fromObjClazz.cast(fromEObj);
				      
				      Class<?> toObjClazz = Class.forName(this.name+"."+toObj);
				      Object toEObj = (Petrinet) diagram.getMapelements().get(toID);
				      toObjClazz.cast(toEObj);
				      
			    	  Iterator<Petrinet> it = ((Petrinet) fromEObj).getMapelements().iterator();

			    	  while(it.hasNext()){
			    		  Object o = it.next();
			    		  if ( o.getClass().getName().equals(this.name+".impl."+domainObj+"Impl")){
						      Method methodGetFrom = o.getClass().getMethod("getFrom"+fromObj);
						      Method methodGetTo = o.getClass().getMethod("getTo"+toObj);
						      
						      Object from = methodGetFrom.invoke(o);
						      Object to = methodGetTo.invoke(o);
						      
						      if ( from.equals(fromEObj) && to.equals(toEObj) ){
						    	  EcoreUtil.delete((EObject) o);
								  break;
						      }
			    		  }			    			  			    		  
			    	  }
			    	  
			    	  resource.getContents().add(diagram);
			    	  resource.save(Collections.EMPTY_MAP);
			      }
		    	  
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	    }
	}
	
	/* object within compartment */
	/* (non-Javadoc)
	 * @see Ecore.WebToEcoryFactory#removeEObject(int, int)
	 */
	@Override
	public void removeEObject( String domainObj, int ID, String parentObj, int parentID ){
	    Resource resource = this.getResource();
	    if ( resource != null ){
		    try {		    	  
			      Petrinet diagram = this.getPetrinet(resource);
			      if ( diagram != null ){
				      
			      	  Class<?> parentObjClazz = Class.forName("PetrinetDSL."+parentObj);
				      Object parentEObj = (Petrinet) diagram.getMapelements().get(parentID);
				      parentObjClazz.cast(parentEObj);
				      
				      Class<?> eObjClazz = Class.forName("PetrinetDSL."+domainObj);
				      Object eObj = ((Petrinet) parentEObj).getMapelements().get(ID);
				      eObjClazz.cast(eObj);
				      
					  EcoreUtil.delete((EObject) eObj);
				      
			    	  resource.getContents().add(diagram);
			    	  resource.save(Collections.EMPTY_MAP);
			      }
		    	  
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	    }
	}
	
	@SuppressWarnings("unchecked")
	private <T> T doMethod(Method m, Class<T> returnType) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	    Object obj1 = m.getDeclaringClass().getConstructor().newInstance();
	    return (T) m.invoke(obj1);
	}
	
}
