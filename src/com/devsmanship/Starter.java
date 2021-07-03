package com.devsmanship;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Starter {

    public void start() throws IOException {
        List<String> l = ImportCars.file;
        List<Car> mapped = Utils.map(l);
        List<Car> filtered = Filtering.filter(mapped,2000, 0, true);
        CarService.printReport(filtered, false);
    }
}
