package org.example.service;

import org.example.model.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxPeopleService {
    public Map<Integer,Long> getMaxPeople(List<City> list){
        List<City> cities = new ArrayList<>(list);
        int index = 0;
        long value = 0;

        for (int i = 0; i < cities.size();i++){
            Long population = cities.get(i).getPopulation();
            if (population > value){
                value = population;
                index = i;
            }
        }

        Map<Integer,Long> map = new HashMap<>();
        map.put(index,(long) value);
        return map;
    }
}
