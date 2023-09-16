/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author suunh
 */
public class Libarary {
    Scanner sc = new Scanner(System.in);
    public String getValue(String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine();
            input.trim();
            if (input == null || input.length() == 0) {
                System.out.println("Do not enter null data. Please enter again.");
                continue;
            }
            return input;
        }
    }
    
        public int checkInputNum(String msg){
            while (true) {
                String id = getValue(msg);

                
                try {
                    int out = Integer.parseInt(id);
                    if (out < 0) {
                        System.out.println("Invalid value. Please enter again.");
                        continue;
                    }
                    return Integer.parseInt(id);
                } catch (Exception e) {
                    System.out.println("Wrong format");
                }
            }
    }
}
