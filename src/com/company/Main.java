package com.company;

public class Main {

    public static void main(String[] args) {
        int deposit = 100;
        int amount = 1501; // Zdesy podstavlyaem lyuboe tseloe chislo
        int sum = (amount + deposit);
        int bonus = ((amount) * 1 / 100);
        if (amount > 1000) {
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }
    }
}
