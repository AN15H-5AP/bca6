/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceJava.classExample;
import java.util.Scanner;
/**
 *
 * @author devil
 */
public class MainProgram {
//    qn1
    public static void Display(){
        System.out.println("hello , im called");
    }
//    qn2
    public static void getTotal(int x, int y){
        int sum = x+y;
        System.out.println(sum);
    }
//    qn3
    public static void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a : ");
        int a = sc.nextByte();
        System.out.print("enter value of b : ");
        int b= sc.nextByte();
        int multiply = a*b;
        System.out.println(multiply); 
    }
    
//    qn4
    public static void CirArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of radius : ");
        double r = sc.nextByte();
       
        double circum = 2* 3.1416 *r;
        System.out.println("Curcumference of circle is : "+circum);
        
         double area = 3.1416 *r*r;
        System.out.println("area of circle is : "+area);
        
    }
    
    //Qn5 
    public static void giveVote(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = sc.nextByte();
        if (age >= 18 ){
            System.out.print("you are "+ age +"so u are eligible ot vote");
        }
        else{
            System.out.println("your are not allowed to vote");
        }
        
    }
    public static void main(String[] args){
 Display();
 getTotal(1,2);
 getInput();
 CirArea();
 giveVote();
}
}
