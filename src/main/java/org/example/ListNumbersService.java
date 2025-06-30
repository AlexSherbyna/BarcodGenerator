package org.example;

import java.util.ArrayList;

public class ListNumbersService {

    protected static ArrayList<String> createSerialNumbersList(String partName, int startNumber, int countNumbers) {
        ArrayList<String> arrayList =  new ArrayList<>();

        for (int i = 0; i < countNumbers; i++) {
            String str = partName + (startNumber + i);
            arrayList.addLast(str);
        }
        return arrayList;
    }

}
