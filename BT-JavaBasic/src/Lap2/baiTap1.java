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
public class baiTap1 {
    public static void main(String[] args){
        int a, b ;
        double nghiem;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình này có vô số nghiệm.");
            }else{
                System.out.println("Phương trình vô nghiệm.");
            }
        }else{
            nghiem = -b/a;
            System.out.println("Phương trình có nghiệm x = " +nghiem);
        }
    }
    
}
