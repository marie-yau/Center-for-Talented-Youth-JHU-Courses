
public class Animal extends Concept {
	private String name;
        
	// constructor
	public Animal(String n){
		setName(n);
	}
        
        /* overiden methods
        precondition: method that is being overiden must exist
        */	
	@Override
	public void playSound() {
		System.out.println("Animal sound");
	}

	@Override
	public void resizeObject() {
		System.out.println("Resizing an animal");
	}

	@Override
	public void rotateObject() {
		System.out.println("Rotating an animal");
	}

	@Override
	public void drawObject() {
		System.out.println("Drawing an animal");
	}

        /* getter and setter
        precondition: name must be initialized
        */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
