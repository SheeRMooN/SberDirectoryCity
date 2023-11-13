package org.example.util;

import org.example.model.City;

import java.util.List;
import java.util.Map;

public class PrintCity {
    public static void print(List<City> cityList){
        for (City city: cityList){
            System.out.println(city);
        }
    }
    public static void printMap(Map<String,Integer> map){
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
    public static void printMapRegion(Map<Integer,Long> map){
        for (Map.Entry<Integer,Long> entry: map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
