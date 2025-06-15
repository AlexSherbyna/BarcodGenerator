package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayListBarcode = CreateCountBarcode.getArrayList();

        CreateCountBarcode.barcodeService("gf",999,3);

        SaveToFileBarcode.writeSerialNumberToTextFile(arrayListBarcode,CreateCountBarcode.getFileName());

        BarcodeGenerator.createSerialNumberPDF(arrayListBarcode);
    }


}