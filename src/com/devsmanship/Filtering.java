package com.devsmanship;

import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

    public static List<CarModel> filterYear(List<CarModel> cars, int year) {
        return cars.stream()
            .filter(c -> c.getYear() > year)
            .collect(Collectors.toList());
    }
    public static List<CarModel> filterPrice(List<CarModel> cars, double price) {
        return cars.stream()
            .filter(c -> c.getPrice() > price)
            .collect(Collectors.toList());
    }
}
