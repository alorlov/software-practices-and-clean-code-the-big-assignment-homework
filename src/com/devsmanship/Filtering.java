package com.devsmanship;

import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

    public static List<Car> filterYear(List<Car> cars, int year) {
        return cars.stream()
            .filter(c -> c.getYear() > year)
            .collect(Collectors.toList());
    }
    public static List<Car> filterPrice(List<Car> cars, double price) {
        return cars.stream()
            .filter(c -> c.getPrice() > price)
            .collect(Collectors.toList());
    }
}
