package interfaces.simplethread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements  Runnable {

    @Override
    public void run() {
        while (this.nextStep() == true)
            this.nextStep();
    }

    private List<String> tasks = new ArrayList<>();

    public List<String> getTasks() {
        return tasks;
    }

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    private boolean nextStep() {
        if (tasks.size() != 0) {
            tasks.remove(tasks.size() - 1);
            if (tasks.size() != 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
     }
}


