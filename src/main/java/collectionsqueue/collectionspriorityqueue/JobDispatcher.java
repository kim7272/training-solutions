package collectionsqueue.collectionspriorityqueue;

import collectionsqueue.job.Job;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import collectionsqueue.job.NoJobException;

public class JobDispatcher {




   public Queue<Job> addJob(Job ... jobs){

       return new PriorityQueue<>(Arrays.asList(jobs));
   }

    public Job dispatchNextJob(Queue<Job> jobs) {

        if (jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.poll();
    }
}

