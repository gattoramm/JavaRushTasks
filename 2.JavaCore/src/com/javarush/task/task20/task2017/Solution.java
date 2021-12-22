package com.javarush.task.task20.task2017;

import java.io.*;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) throws IOException {
        //private void writeObject(ObjectOutputStream out) throws IOException
        //private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream("")) {

        }
        return null;
    }

    public class A implements Serializable{
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
