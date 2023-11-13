package org.example;

import org.example.model.City;
import org.example.service.ScannerSber;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ScannerSber scannerSber = new ScannerSber();
        scannerSber.simpleReadFile("demoCity.csv");
//        scannerSber.deserializationCity("demoCity.csv");
    }
}