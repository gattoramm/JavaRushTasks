package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> listOfFilenames = new ArrayList();

        File folder = new File(root);

        for (File file : folder.listFiles()) {
            if (file.isFile())
                listOfFilenames.add(file.getParent());
            else
                if (file.list().length != 0)
                    listOfFilenames.add(file.list()[0]);
        }
        return listOfFilenames;
    }

    public static void main(String[] args) throws IOException {
        List<String> list = getFileTree("e:\\Study\\programming\\ddd\\");
        for (String item : list)
            System.out.println(item);
    }
}
