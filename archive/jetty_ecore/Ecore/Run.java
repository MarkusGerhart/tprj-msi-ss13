package Ecore;

public class Run {

	public static void main(String[] args) {
		//Test
		WebToEcoreFactory factory = WebToEcoreFactoryImpl.getInstance();
		factory.createEObject("Place");
		factory.createEObject("Transition");
		factory.createEObject("Transition");
		factory.createEObject("PTEdge", "Place", "Transition", 0, 1);
		factory.createEObject("PTEdge", "Place", "Transition", 0, 2);
		factory.removeEObject("Transition",2);
	}

}
