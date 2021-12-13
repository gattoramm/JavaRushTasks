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
                user1.setBirthDate(new GregorianCalendar(2000, Calendar.MARCH, 1).getTime());
                user1.setMale(true);
                user1.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user1);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object -
            //проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

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

        public void save(OutputStream outputStream){
            //implement this method - реализуйте этот метод
            try(PrintWriter printWriter = new PrintWriter(outputStream, true)) {
                if(!this.users.isEmpty())
                    for(User currentUser : this.users) {
                        printWriter.println(currentUser.getFirstName());
                        printWriter.println(currentUser.getLastName());
                        printWriter.println(currentUser.getBirthDate().getTime());
                        printWriter.println(Boolean.parseBoolean(String.valueOf(currentUser.isMale())));
                        printWriter.println(currentUser.getCountry());
                    }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
                while(bufferedReader.ready()) {
                    User restoreUser = new User();
                    restoreUser.setFirstName(bufferedReader.readLine());
                    restoreUser.setLastName(bufferedReader.readLine());
                    restoreUser.setBirthDate(new Date(Long.parseLong(bufferedReader.readLine())));
                    restoreUser.setMale(Boolean.parseBoolean(bufferedReader.readLine()));
                    restoreUser.setCountry(User.Country.valueOf(bufferedReader.readLine()));
                    this.users.add(restoreUser);
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
