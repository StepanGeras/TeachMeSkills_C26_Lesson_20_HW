package com.teachmeskills.lesson20.task2.fixed_car;

import com.teachmeskills.lesson20.task2.moving_car.MovingCar;

public class FixedCar implements Runnable{

    private MovingCar car;
    private int count;

    public FixedCar(MovingCar car) {
        this.car = car;
    }

    @Override
    public void run() {
        while (count < 10) {
            count++;
            car.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
