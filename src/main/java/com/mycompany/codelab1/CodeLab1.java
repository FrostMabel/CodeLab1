package com.mycompany.codelab1;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class CodeLab1 {

    public static void main(String[] args) {
        System.out.println("//Input//");
        String name , birthdateStr , input ;
        char gender;
        Scanner scan = new Scanner(System.in);
        System.out.print("Name : ");
        name = scan.nextLine();
        System.out.print("Gender (M/F) : ");
        input = scan.nextLine();
        gender = input.charAt(0);
        System.out.print("Birth date (yyyy-mm-dd) : ");
        birthdateStr = scan.nextLine();
        LocalDate birthdate = LocalDate.parse(birthdateStr);
        LocalDate currentdate = LocalDate.now();
        Period period = Period.between(birthdate, currentdate);
        int year = period.getYears();
        int month = period.getMonths();
        
        System.out.println("//Output//");
        System.out.println("Name : " + name);
        if (gender == 'M') {
            System.out.println("Gender : Male");
        } else { 
            System.out.println("Gender : Female");
        }
        System.out.println("Age : " + year + " years and " + month + " months");
    }
}
