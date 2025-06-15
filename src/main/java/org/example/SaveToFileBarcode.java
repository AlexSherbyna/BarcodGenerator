package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveToFileBarcode {

    protected static void writeSerialNumberToTextFile(ArrayList<String> arrayList, String partName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/TextBarcode/" +partName +".txt"));

        for (String ar: arrayList)
            bufferedWriter.write(ar +"\n");
        bufferedWriter.close();
    }
}
