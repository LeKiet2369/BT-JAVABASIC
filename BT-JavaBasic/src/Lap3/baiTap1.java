/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class baiTap1 {
    public boolean kiemTraNguyenTo(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        baiTap1 kt = new baiTap1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int n = sc.nextInt();
        
        if(kt.kiemTraNguyenTo(n)){
            System.out.println("So" +n+ "la so nguyen to!");
        }else{
            System.out.println("So " + n + " khong la so nguyen to!");
        }
    }
    
}
