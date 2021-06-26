package com.devsmanship;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<CarModel> map(List<String> carLines) {
        List<CarModel> carList = new ArrayList<>();

        for(String carLine : carLines) {
            String[] info = carLine.split(",");

            CarModel car = new CarModel();
            car.setModel(info[0]);
            car.setYear(Integer.parseInt(info[1]));
            car.setPrice(Double.parseDouble(info[2]));
            car.setColor(info[3]);
            car.setDoors(Integer.parseInt(info[4]));
            carList.add(car);
        }

        return carList;
    }
}
