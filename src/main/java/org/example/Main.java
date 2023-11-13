package org.example;

import org.example.service.ScannerSber;

public class Main {
    public static void main(String[] args) {
        ScannerSber scannerSber = new ScannerSber().simpleReadFile("demoCity.csv").print();
    }
}