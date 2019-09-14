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
public class baiTap3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double soDien;
        System.out.println("Số Điện là:");
        soDien = sc.nextDouble();
        if(soDien<50){
            System.out.println("So tien: " +(soDien*1000));
        }else{
            System.out.println("So tien: "+((50*1000)+((soDien-50)*1200)));
        }
    }
    
}
