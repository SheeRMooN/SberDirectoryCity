package org.example.service;

import org.example.model.City;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityInRegionService {
    public Map<String,Integer> getRegionCity(List<City> cityList){
        Map<String,Integer> result = new HashMap<>();

        for (City city: cityList){
            String region = city.getRegion();
            if (result.containsKey(region)){
                result.put(region,result.get(region) + 1);
            }else {
                result.put(region,1);
            }
        }
        return result;
    }

}
