package org.example;

import org.example.model.City;
import org.example.service.CityInRegionService;
import org.example.service.MaxPeopleService;
import org.example.service.ScannerCityService;
import org.example.service.SortedCityService;
import org.example.util.PrintCity;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "demoCity.csv";
        List<City> cityListScanner = new ScannerCityService(fileName).readFile();
        List<City> listName = new SortedCityService().sortedForName(cityListScanner);
        List<City> listDistrict = new SortedCityService().sortedForDistrict(cityListScanner);
        Map<Integer, Long> maxPeople = new MaxPeopleService().getMaxPeople(cityListScanner);
        Map<String, Integer> regionCity = new CityInRegionService().getRegionCity(cityListScanner);

        // Test 1 сканер файла
//        PrintCity.print(cityListScanner);

        // Test 2 сортировка обьектов по полям
//        PrintCity.print(listName);
//        PrintCity.print(listDistrict);
        // Test 3
//        PrintCity.printMapRegion(maxPeople);
        // Test 4
        PrintCity.printMap(regionCity);
    }
}