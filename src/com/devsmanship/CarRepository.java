package com.devsmanship;

import java.util.List;

public class CarRepository {

    public void save(List<CarModel> cars) {
        System.out.println(cars.size() + " cars saved.");

        CarService.printReport(cars, true);
        // TODO: implement.
        // We won't implement it to keep the project simple
    }
}
