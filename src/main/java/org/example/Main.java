package org.example;

import org.example.model.City;
import org.example.service.ScannerCity;
import org.example.service.SortedCity;
import org.example.util.PrintCity;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "demoCity.csv";
        List<City> cityListScanner = new ScannerCity(fileName).readFile();
        List<City> listName = new SortedCity().sortedForName(cityListScanner);
        List<City> listDistrict = new SortedCity().sortedForDistrict(cityListScanner);

        // Test 1 сканер файла
//        PrintCity.print(cityListScanner);

        // Test 2 сортировка обьектов по полям
//        PrintCity.print(listName);
//        PrintCity.print(listDistrict);
    }
}