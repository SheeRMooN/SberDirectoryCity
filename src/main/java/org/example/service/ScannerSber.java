package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.model.City;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class ScannerSber {

    private List<City> cityList = new LinkedList<>();
    public ScannerSber simpleReadFile(String fileName){


        try(Scanner scanner = new Scanner(new File(getAbcPath(fileName)));) {
            while (scanner.hasNext()){
                String line = new String(scanner.nextLine());
                City city = deserializationCity(line);
                cityList.add(city);
            }
        }catch (Exception e){
            log.error("Какаято логика обработки эксепшинов", e);
        }
        return this;
    }
    private City deserializationCity(String line){
        String[] array = line.split(";");
        return City.builder()
                .name(array[1])
                .region(array[2])
                .district(array[3])
                .population(Long.parseLong(array[4]))
                .foundation(array.length == 6 ? array[5] : "")
                .build();
    }
    private String getAbcPath(String fileName){
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResource(fileName).getPath();
    }
    public  ScannerSber print(){

        for (City city: cityList){
            System.out.println(city);
        }
        return this;
    }
    public List<City> getCityList(){
        return this.cityList;
    }
}
