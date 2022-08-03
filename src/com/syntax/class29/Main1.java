package com.syntax.class29;
import java.util.*;
import java.util.Map.Entry;

class Main {
    public static void main(String[]args){
        List<Map<String,Object>> dataList=new ArrayList<Map<String,Object>>();
        HashMap<String,Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10);
        dataList.add(appleMap);
        HashMap<String,Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price","21.99");
        orangeMap.put("Quantity","10");
        dataList.add(orangeMap);
        double total=0;
        double price=0;
        double quantity=0;
        for(Map<String,Object>datalists:dataList){
            for(Entry<String,Object> entry:datalists.entrySet()){
              if (entry.getKey().equals("Price")){
                  price=Double.parseDouble(entry.getValue().toString());

              }else if(entry.getKey().equals("Quantity")) {
                       quantity=Double.parseDouble(entry.getValue().toString());

              }
              String key= entry.getKey();;
              Object value=entry.getValue();
                System.out.println(key+" "+value);
            }
total+=price*quantity;
            System.out.println("Subtotal: "+(price*quantity));
            System.out.println();
            System.out.println();
        }
        System.out.println("Your Purchase total: "+total);


    }
}