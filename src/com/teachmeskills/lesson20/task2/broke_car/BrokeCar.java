package com.teachmeskills.lesson20.task2.broke_car;

import com.teachmeskills.lesson20.task2.moving_car.MovingCar;

public class BrokeCar implements Runnable {

    private MovingCar car;
    private int count = 0;

    public BrokeCar(MovingCar car) {
        this.car = car;
    }

    @Override
    public void run() {

        while (count < 10){
            count++;
            car.put();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
