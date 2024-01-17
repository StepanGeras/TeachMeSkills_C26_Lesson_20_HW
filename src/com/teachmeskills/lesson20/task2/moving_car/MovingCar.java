package com.teachmeskills.lesson20.task2.moving_car;

import static com.teachmeskills.lesson20.task2.constant.IConstant.MAX_CAR;

public class MovingCar {

    private int car = 0;

    public synchronized void get(){
        while(car < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        car--;
        System.out.println("The car is ready");
        System.out.println("Cars at the service station " + car);

        notify();
    }

    public synchronized void put(){
        while (car >= MAX_CAR){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        car++;
        System.out.println("The car was moved for service");
        System.out.println("Cars at the service station " + car);

        notify();
    }

}
