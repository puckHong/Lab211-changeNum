/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Libarary;
import View.menu;


import java.util.Scanner;

public class changeNumManagement {
    public void result()  {
        Scanner scanner = new Scanner(System.in);
        Libarary lib = new Libarary();
        
        System.out.println("Choose the base number input:");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        int inputBase = scanner.nextInt();
        System.out.println("Choose the base number output:");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        int outputBase = scanner.nextInt();
        System.out.println("Enter the input value:");
        String inputValue = lib.getValue("Enter the input value:");
        String outputValue = convertBase(inputValue, inputBase, outputBase);
        System.out.println("Output value: " + outputValue);
        
       
    }

    public static String convertBase(String value, int inputBase, int outputBase) {
        int decimalValue;
        String outputValue;


        switch (inputBase) {
            case 1:
                decimalValue = Integer.parseInt(value, 2);
                break;
            case 2:
                decimalValue = Integer.parseInt(value);
                break;
            case 3:
                decimalValue = Integer.parseInt(value, 16);
                break;
            default:
                throw new IllegalArgumentException("Invalid input base number");
        }

    
        switch (outputBase) {
            case 1:
                outputValue = Integer.toBinaryString(decimalValue);
                break;
            case 2: 
                outputValue = String.valueOf(decimalValue);
                break;
            case 3: 
                outputValue = Integer.toHexString(decimalValue);
                break;
            default:
                throw new IllegalArgumentException("Invalid output base number");
        }

        return outputValue;
    }
}

