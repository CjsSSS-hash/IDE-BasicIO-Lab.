/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
import java.time.Year;

public class JavaApplication1 {

  

    public static void main(String[] args) {
        Year crdate = Year.now();
        int dt = crdate.getValue();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = sc.nextLine();

        System.out.println("Enter your Age:");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " Years old!");

        int calcAge = (60 - age);
        System.out.println("You will turn 60 years old in year "  + (dt + calcAge));
    }

}
