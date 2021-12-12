package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.*;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust
        //outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте
        // outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here -
            //инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
                user1.setFirstName("Ivanov");
                user1.setLastName("Ivan");
                user1.setBirthDate(new Date(2000, 2, 13));
                user1.setMale(true);
                user1.setCountry(User.Country.RUSSIA);
            User user2 = new User();
                user2.setFirstName("Ivanova");
                user2.setLastName("Irina");
                user2.setBirthDate(new Date(2000, 5, 3));
                user2.setMale(false);
                user2.setCountry(User.Country.UKRAINE);

            javaRush.users.add(user1);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object -
            //проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try(PrintWriter printWriter = new PrintWriter(outputStream, true)) {
                if(!this.users.isEmpty())
                    printWriter.println(this.users);
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
                if(bufferedReader.ready()) {
                    String readLineObject = bufferedReader.readLine();
                    User user = new User();
                    System.out.println(readLineObject.getClass());
                    System.out.println();
                    System.out.println();
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
