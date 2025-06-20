package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> barcodeList = ListNumbersService.createSerialNumbersList("fg",999,3);
        WriteSerialNumberToTextFile.writeSerialNumberToTextFile(barcodeList);
        BarcodeService.createSerialNumberToPDF(barcodeList);
    }
}