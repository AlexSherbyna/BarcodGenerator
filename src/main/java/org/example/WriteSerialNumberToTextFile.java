package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteSerialNumberToTextFile {
    static BufferedWriter bufferedWriter;

    protected static void writeSerialNumberToTextFile(ArrayList<String> barcodeList) throws IOException {
        String nameFile = barcodeList.getFirst().toUpperCase() +"-" + barcodeList.getLast().toUpperCase();

        bufferedWriter = new BufferedWriter(new FileWriter("src/barcodeList/" +nameFile +".txt"));

        for (String ar: barcodeList)
            bufferedWriter.write(ar +"\n");
        bufferedWriter.close();
    }
}
