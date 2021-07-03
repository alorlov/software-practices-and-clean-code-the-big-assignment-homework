package com.devsmanship;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarService {

    public void save() throws IOException {
        List<String> carLines = ImportCars.carLines;
        List<Car> mappedCars = Utils.map(carLines);

        List<Car> filteredCars = Filtering.filter(mappedCars, 0, 1000, false);

        boolean enoughCount = filteredCars.size() > 1
        boolean correctFirstCarPrice = filteredCars.get(0).getPrice() > 2000
        boolean correctSecondCarModel = filteredCars.get(1).getModel().equals("AUDI")

        if(enoughCount && correctFirstCarPrice && correctSecondCarModel) {
            new carRepository().save(filteredCars);
        }
    }
	
    public static void printFirstReport(List<Car> cars) {
        // print header
        System.out.println("===================");
        System.out.println("= Standard Report =");
        System.out.println("===================");
        System.out.println();

        // print cars
        for(Car car : cars) {
            System.out.println(String.format("Model: %s", car.getModel()));
            System.out.println(String.format("Year: %s", car.getYear()));
            System.out.println(String.format("Price: %s", car.getPrice()));
            System.out.println(String.format("Color: %s", car.getColor()));
            System.out.println(String.format("Number Of Doors: %s", car.getNumberOfDoors()));
            System.out.println();
        }

        printFooter(cars)


    printSecondReport(cars)
        // print header
        System.out.println("=====================");
        System.out.println("= Only Model Report =");
        System.out.println("=====================");
        System.out.println();

        // print cars
        for(Car car : cars) {
            System.out.println(String.format("Model: %s", car.getModel()));
            System.out.println();
        }

        printFooter(cars)
    }

    private printFooter(cars) {
        System.out.println();
        System.out.println(String.format("Printed %s cars", cars.size()));
        System.out.println("=================");
        System.out.println("= End of Report =");
        System.out.println("=================");
    }
}
