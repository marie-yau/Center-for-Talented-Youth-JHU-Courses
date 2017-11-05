public class Publisher{
	private Subscriber [] subscriberList;
	private int maximumSubscribers;
	private int nextIndex;
	
	public Publisher( int max ){
		maximumSubscribers = max;
		subscriberList = new Subscriber[ maximumSubscribers ];
		nextIndex = 0;
	}
	
	public void register( Subscriber s ){
		if ( nextIndex < maximumSubscribers )
			subscriberList[ nextIndex++ ] = s;
		else
			System.out.println( "ERROR: Subscriber List is full" );
	}
	
	public void notifySubscribers(){
		for ( int i = 0; i < nextIndex; i++ )
			subscriberList[ i ].update();
	}
}
