
public class TestPattern {
	public static void main( String [] args ){
	// Create Publisher & Subscriber objects
	MySubscriber aSubscriber1 = new MySubscriber(1);
	MySubscriber aSubscriber2 = new MySubscriber(2);
	MySubscriber aSubscriber3 = new MySubscriber(3);
	MyPublisher aPublisher = new MyPublisher( 3 );
	// Register a Subscriber
	aPublisher.register( aSubscriber1 );
	aPublisher.register( aSubscriber2 );
	aPublisher.register( aSubscriber3 );
	// Increment Publisher object to cause state changes
	aPublisher.increment();
	aPublisher.increment();
	aPublisher.increment();
	aPublisher.increment();
	}
}
