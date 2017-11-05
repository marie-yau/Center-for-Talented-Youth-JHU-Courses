public class MyPublisher extends Publisher{
	private int count;
	
	public MyPublisher( int mx ){
		super( mx );
		count = 0;
	}
	
	public void increment(){
		count++;
		if ( count >= 3 )
			notifySubscribers();
	}
}