package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
            System.out.println("________№2 задача________");
            System.out.println("_________Рандом___________");
            System.out.println(backHome(getRandomAge(), getRandomOutsidtemperature()));
            System.out.println("________№1 задача_________");
            System.out.println(backHome(5, 2));
            System.out.println(backHome(22, 222));
            System.out.println(backHome(75,2));
            System.out.println(backHome(5, 55));
            System.out.println(backHome(55, 66));

        }
        public static boolean backHome  (int age, int outsideTemperature){


            String a = "Можно идти гулять";
            String b = "Оставайтесь дома";
            if (age >= 20 && outsideTemperature >= -20 && age <= 30){
                System.out.println(a);
            }else if (age > 20 && outsideTemperature >0 && outsideTemperature <= 28){
                System.out.println(a);
            }else if (age >= 45 && outsideTemperature >= -10 && outsideTemperature <= 25){
                System.out.println(a);
            }else {
                System.out.println(b);
            }


            return true;





        }
        public static int getRandomAge(){
            Random random = new Random();
            int min = 5;
            int max = 100;
            int diff = max - min;
            return random.nextInt(diff + 1) + min ;
        }
        public static int getRandomOutsidtemperature(){
            Random random = new Random();
            int min = 5;
            int max = 100;
            int diff = max - min;
            return random.nextInt(diff + 1) + min ;
    }
}
