package com.karmerdero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList <T extends Number>{
    private final List<T> arrayList;

    public MyList() {
        arrayList = new ArrayList<>();
    }

    public void add(T el){
        arrayList.add(el);
    }

    public T largest() {
        arrayList.sort(Collections.reverseOrder());
        return arrayList
                .stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("List is empty"));
    }

    public T smallest() {
        return arrayList
                .stream()
                .sorted()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("List is empty"));
    }
}