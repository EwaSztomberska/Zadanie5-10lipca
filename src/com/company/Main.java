package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        for(int i = 2; i < number; i ++){
          if(isPrimeNumber(i)){
              System.out.println(i);
              }
              }
          }
        public static boolean isPrimeNumber(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}


