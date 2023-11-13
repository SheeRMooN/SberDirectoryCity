package org.example;

import org.example.model.City;
import org.example.service.MaxPeopleService;
import org.example.service.ScannerCityService;
import org.example.service.SortedCityService;
import org.example.util.PrintCity;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "demoCity.csv";
        List<City> cityListScanner = new ScannerCityService(fileName).readFile();
        List<City> listName = new SortedCityService().sortedForName(cityListScanner);
        List<City> listDistrict = new SortedCityService().sortedForDistrict(cityListScanner);

        // Test 1 сканер файла
//        PrintCity.print(cityListScanner);

        // Test 2 сортировка обьектов по полям
//        PrintCity.print(listName);
//        PrintCity.print(listDistrict);
        // Test 3
        new MaxPeopleService().getMaxPeople(cityListScanner);
    }
}