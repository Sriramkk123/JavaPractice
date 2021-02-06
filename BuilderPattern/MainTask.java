package BuilderPattern;

public class MainTask {
	public static void main(String[] args) {
        Task task = new TaskBuilder(1).setDescription("Hello").setSummary("Test").build();
        System.out.println(task);
    }
}
