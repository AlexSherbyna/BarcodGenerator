package org.example;

import java.util.ArrayList;

public class CreateCountBarcode {

    static String fileName;
    static ArrayList<String> numberList =  new ArrayList<>();

    protected  static void barcodeService(String partName, int startPartNumber, int counterNumber) {

        for (int i = 0; i < counterNumber; i++) {
            String str = partName + (startPartNumber + i);
            numberList.addLast(str);
            System.out.println(str);
        }
    }

    protected static String getFileName() {
        return fileName;
    }

    protected static ArrayList<String> getArrayList() {
        return  numberList;
    }
}
