package org.example.service;

import org.example.model.City;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedCity {

    /**
     * Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра
     */
    public List<City> sortedForName(List<City> cityList) {
        return cityList.stream()
                .sorted(Comparator.comparing(City::getName, String::compareToIgnoreCase))
                .collect(Collectors.toList());

    }

    /**
     * Сортировка списка городов по федеральному округу и наименованию города внутри каждого федерального округа
     * в алфавитном порядке по убыванию с учетом регистра
     */
    public List<City> sortedForDistrict(List<City> cityList) {
        return cityList.stream()
                .sorted(
                        Comparator.comparing(City::getDistrict)
                                .thenComparing(City::getName)
                )
                .collect(Collectors.toList());
    }

}
