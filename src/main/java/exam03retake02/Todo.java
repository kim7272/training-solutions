package exam03retake02;

public class Todo implements  Comparable<Todo> {

    private String text;
    private int priority;
    private State state;

    @Override
    public int compareTo(Todo o) {
        return this.priority - o.priority;
    }

    @Override
    public String toString() {
        return  "{" +
                "text='" + text + '\'' +
                ", priority=" + priority +
                ", state=" + state +
                '}';
    }



    public Todo(String text, int priority) {
        if (priority < 1 || priority > 5){
            throw new IllegalArgumentException("Invalid parameter!");
        }
        this.text = text;
        this.priority = priority;
        this.state = State.NON_COMPLETED;
    }

    public void complete(){
        this.state = State.COMPLETED;
    }

    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }

    public State getState() {
        return state;
    }
}


