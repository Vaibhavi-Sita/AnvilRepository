package main.java.Basics;

import java.util.ArrayList;

public class TaskManager {
    // Tasks Manager is a data structure of tasks

    private ArrayList<Thread> tasks = new ArrayList<>();

    public void acceptTask(Runnable task) {
        // it accepts tasks and adds it to the queue

        tasks.add(new Thread(task));
    }

    private void startAllTasks(){
        // it starts them - calls the start method on the thread
        // asking the thread to begin execution

        tasks.stream().forEach(Thread::start);
    }

    private void waitForAllToComplete(){
        // waits for each thread to complete
        tasks.stream().forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        });

    }

    private void removeAllTasks(){
        // takes all the cuurent tasks in queue and throws them in trash
        tasks = new ArrayList<>();
    }

    public void completeAllTasks(){
        startAllTasks();
        waitForAllToComplete();
        removeAllTasks();
    }

    public void cyclicAssignment(
            final int testCases,
            final int noOfThreads,
            final int[] inputNumber,
            Solve solver,
            Boolean[] results)
    {
    // assigning tasks in a cyclic fashion
    // basically first task goes to the first thread
    // second task goes to the second thread... no of threads
    // takes the remainder of tasks by no of threads allowed to use
    // ex: 5th task will go to first thread if no of threads are 4
        for (int thread = 0; thread < noOfThreads; thread++){
            final int threadIndex = thread;
            acceptTask(() ->
            {
                for (int i = threadIndex; i< testCases; i = i + noOfThreads){
                    results[i] = solver.solve(inputNumber[i]);
                }
            });
        }
    }

}
