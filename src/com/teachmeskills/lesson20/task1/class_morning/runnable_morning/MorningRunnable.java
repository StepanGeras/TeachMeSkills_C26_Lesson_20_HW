package com.teachmeskills.lesson20.task1.class_morning.runnable_morning;

public class MorningRunnable implements Runnable {

    Thread thread;
    private final String workMorning;

    public MorningRunnable(String workMorning, int priority) {
        this.workMorning = workMorning;
        thread = new Thread(this);
        thread.setPriority(priority);
        thread.start();

    }

    public void run() {

        System.out.println((getWorkMorning()));

    }

    public String getWorkMorning() {
        return workMorning;
    }

}
