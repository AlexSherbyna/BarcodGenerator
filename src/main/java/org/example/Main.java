package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> barcodeList = ListNumbersService.createSerialNumbersList("fg",9,3);
        SerialNumberFileWriter.SerialNumberFileWriter(barcodeList);
        BarcodeService.createSerialNumberToPDF(barcodeList);
    }
}