
public class MySubscriber extends Subscriber{
	private int id;
	
	public MySubscriber(int id){
		this.id=id;
	}
	
	public void update(){
		System.out.println("Subscriber "+id+" has been notified");
	}
}
