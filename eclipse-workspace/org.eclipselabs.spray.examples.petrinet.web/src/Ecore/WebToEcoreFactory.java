package Ecore;

public interface WebToEcoreFactory {
	
	public abstract void createEObject(String domainObj);

	/*connection*/
	public abstract void createEObject(String domainObj, String fromObj, String toObj, int fromID, int toID);

	/*compartment*/
	public abstract void createEObject(String domainObj, String parentObj, int parentID);

	/* 1) single object 
	 * 2) object as source with connections (connections will removed too)*
	 * 3) compartment removes all childshapes
	 * 4) object as target -> connections should be removed seperately from webclient!
	 */
	public abstract void removeEObject(String domainObj, int ID);

	/* connection */
	public abstract void removeEObject(String domainObj, String fromObj, String toObj, int fromID, int toID);
	
	/* object within compartment */
	public abstract void removeEObject(String domainObj, int ID, String parentObj, int parentID );

}