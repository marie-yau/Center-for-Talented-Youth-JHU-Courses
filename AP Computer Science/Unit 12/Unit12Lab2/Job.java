
public class Job {
	private int id, duration;
        
        // constructor
	public Job(int id, int duration) {
		setId(id);
		setDuration(duration);
	}
        
        // getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
        }
}
