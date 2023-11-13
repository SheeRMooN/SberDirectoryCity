package org.example.util;

import org.example.model.City;

import java.util.List;

public class PrintCity {
    public static void print(List<City> cityList){
        for (City city: cityList){
            System.out.println(city);
        }
    }
}
