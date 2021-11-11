package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemp(23,31));
    }

    public static String ageAndTemp(int age, int temp) {
        if (age >= 20 || age <= 45) {
            if (temp >= -20 || temp <= 30) {
                System.out.println("можно идти гулять");
            } else if (age < 20) {
                if (temp >= 0 || temp <= 28) {
                    System.out.println("можно идти гулять");
                }
            } else if (age >= 45) {
                if (temp >= -10 || temp <= 25) {
                    System.out.println("можно идти гулть");
                }
            } else {
                System.out.println("оставайтесь дома");
            }
        }
        return "Age" + age + ", Temp" + temp;
    }
}
