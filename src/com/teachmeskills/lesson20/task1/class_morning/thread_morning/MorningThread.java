package com.teachmeskills.lesson20.task1.class_morning.thread_morning;

public class MorningThread extends Thread{

    private String workMorning;

    public MorningThread(String workMorning) {
        this.workMorning = workMorning;
    }

    public void run() {

        System.out.println(getWorkMorning());

    }



    public String getWorkMorning() {
        return workMorning;
    }


}
