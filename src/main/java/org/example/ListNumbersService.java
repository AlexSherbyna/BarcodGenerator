package org.example;

import java.util.ArrayList;

public class ListNumbersService {

    static ArrayList<String> arrayList =  new ArrayList<>();


    protected static ArrayList<String> createSerialNumbersList(String partName, int startNumber, int countNumbers) {

        for (int i = 0; i < countNumbers; i++) {
            String str = partName + (startNumber + i);
            arrayList.addLast(str);
            System.out.println(str);
        }
        return arrayList;
    }

}
