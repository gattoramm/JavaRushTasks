package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/

public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human(
                    "Ivanov",
                    new Asset("home", 999_999.99),
                    new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            System.out.println(somePerson.name);
            for(Asset list: somePerson.assets) {
                System.out.println(list.getName());
                System.out.println(list.getPrice());
            }

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream){
            //implement this method - реализуйте этот метод
            try(PrintWriter printWriter = new PrintWriter(outputStream, true)) {
                printWriter.println(this.name);

                if(!this.assets.isEmpty())
                    printWriter.println(this.assets);
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
                //Asset asset = new Asset();
                this.name = bufferedReader.readLine();
                String stringOfAssets = bufferedReader.readLine().replace(" ","");
                stringOfAssets = stringOfAssets.substring(1, stringOfAssets.length() - 1);

                List listOfAssets = List.of(stringOfAssets.split(","));

                System.out.println(listOfAssets.getClass());
                System.out.println(listOfAssets.get(0).getClass());
                System.out.println(listOfAssets.get(1).getClass());
                System.out.println("----------");
                Asset xxx = (Asset) listOfAssets.get(0);
                System.out.println(xxx.getClass());
//                System.out.println(xxx.getName());
//                System.out.println(xxx.getPrice());


                System.out.println("----------");
                for(Object list : listOfAssets) {
                    System.out.println(list.getClass());
                    System.out.println(listOfAssets.get(0));
                    System.out.println(listOfAssets.get(1));
                    System.out.println("----------");
                    /*(Asset)list;
                    this.assets.add(new Asset(list[0], list[1]));
                    (Asset)list.ge
                    assets.add((Asset) list);*/
                }
                System.out.println();
            }
        }
    }
}
