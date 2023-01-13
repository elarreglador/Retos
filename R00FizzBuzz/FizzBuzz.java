/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos.R00FizzBuzz;

/**
 *
 * @author arreglador
 */
public class FizzBuzz {
    public static void main (String[] args){
        for (int i=0; i<101;i++){
            System.out.println(FizzBuzz(i));
        }
    }
    
    public static String FizzBuzz(int num){
        if ((num % 3 == 0)&&(num%5==0)) {
            return "fizzbuzz";
        } else if (num % 3 == 0){
            return "fizz";
        }else if (num%5==0){
            return "buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
