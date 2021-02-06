package BuilderPattern;

public class TaskBuilder {

    private final long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;

    public TaskBuilder(long id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	public TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    public Task build() {
        return new Task(id,summary, description,done);
    }
}
