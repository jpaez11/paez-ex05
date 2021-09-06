package exercise05.solution05;


import java.util.Scanner;

public class solution05 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the first number?");
        int firstNumber = myObj.nextInt();
        System.out.println("What is the second number?");
        int secondNumber = myObj.nextInt();

        
        int add = firstNumber + secondNumber; //addition
        System.out.println(firstNumber + " + " + secondNumber + " = " + add);

        int subtract = firstNumber - secondNumber; //subtraction
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtract);

        int multiply = firstNumber * secondNumber; //multiplication
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);

        int divide = firstNumber/secondNumber; //division
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);

    }
}

