package BuilderPattern;


public class Task {
    private final long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    
    
    public Task(long id) {
        this.id = id;
    }

    public Task(long id, String summary, String description, boolean done) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;

    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String res = this.id + " " + this.summary + " " + this.description + " " + this.done;
		return res.toString();
	}
    
    
    
}