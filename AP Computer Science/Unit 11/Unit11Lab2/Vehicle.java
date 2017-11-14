
public class Vehicle extends Concept {
	private String name;
	private int age;
	
        // constructor
	public Vehicle(String n, int a){
		setName(n);
		setAge(a);
	}
	
        /* overiden methods
        precondition: method that is being overiden must exist
        */
	@Override
	public void playSound() {
		System.out.println("Vehicle sound");
	}

	@Override
	public void resizeObject() {
		System.out.println("Resizing a vehicle");
	}

	@Override
	public void rotateObject() {
		System.out.println("Rotating a vehicle");
	}
        
	@Override
	public void drawObject() {
		System.out.println("Drawing a vehicle");
	}
        
        /* getters and setters
        precondition: name, age must be initiliazed
        */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
