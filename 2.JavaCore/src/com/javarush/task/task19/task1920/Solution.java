package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        try(FileReader fileReader = new FileReader(args[0])) {

            Map<String, Double> map = new TreeMap<>();
            Double max = 0d;
            try(BufferedReader reader = new BufferedReader(fileReader)) {
                while(reader.ready()) {
                    String[] parse = reader.readLine().split(" ");
                    String key = parse[0];
                    Double value = Double.parseDouble(parse[1]);

                    if (!map.containsKey(key))
                        map.put(key, value);
                    else
                        map.put(key, map.get(key) + value);

                    if(map.get(key)>max)
                        max = map.get(key);
                }
            }
            TreeSet treeSet = new TreeSet<>();
            for(Map.Entry e : map.entrySet()){
                if(e.getValue().equals(max))
                    treeSet.add(e.getKey());
            }
            for(Object name : treeSet){
                System.out.println(name);
            }
        }

    }
}
