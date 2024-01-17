package com.teachmeskills.lesson20.task2;

import com.teachmeskills.lesson20.task2.broke_car.BrokeCar;
import com.teachmeskills.lesson20.task2.fixed_car.FixedCar;
import com.teachmeskills.lesson20.task2.moving_car.MovingCar;

public class Runner {

    public static void main(String[] args) {

        MovingCar movingCar = new MovingCar();

        BrokeCar brokeCar = new BrokeCar(movingCar);
        FixedCar fixedCar = new FixedCar(movingCar);

        new Thread(brokeCar).start();
        new Thread(fixedCar).start();

    }

}
