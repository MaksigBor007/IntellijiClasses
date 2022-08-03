package com.syntax.review12;

import org.apache.poi.poifs.filesystem.Entry;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class MapDemo2 {

    public static void main(String[] args) {
        Map<String,Person1> personMap= new HashMap<>();
        personMap.put("1",new Person1("1","Jason",25,"Programmer"));
        personMap.put("2",new Person1("2","James",26,"SDET"));
        personMap.put("3",new Person1("3","Mike",28,"PO"));
        personMap.put("4",new Person1("4","Adam",22,"QA Manager"));
        personMap.put("5",new Person1("5","Ali",21,"Architect"));

        Set<Map.Entry<String,Person1>> entries=personMap.entrySet();
        entries.removeIf(entry->entry.getKey().equals("4") || entry.getValue().getAge()>22);
        System.out.println(personMap);
    }
}
