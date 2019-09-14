/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class baiTap2 {
    public static void main(String[] args){
        System.out.println("Vui long nhap vao he so a, b, c:");
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if (a == 0){
            System.out.println("phuong trinh co nghiem la:" +(-c/b));
        }else{
            double delta = b*b - 4*a*c;
            
            if(delta < 0){
                System.out.println("phuong trinh vo nghiem");
            }else if (delta == 0){
            double x = -b/2*a;
            System.out.println("Phuong trih co nghiem kep:" +x);
        }else{
                double x1 =(-b -  Math.sqrt(delta))/2*a;
                double x2 =(-b +  Math.sqrt(delta))/2*a;
                
                System.out.println("Phuong trinh co 2 nghiem phan biet la;");
                System.out.println("x1 = " +x1);
                System.out.println("x2 = " +x2);
                }
        }
        
        
        
    }
    
    
}
