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
public class baiTap2 {
    public static void main(String[] args){
        for(int i = 2; i <=9; i++){
            for(int j = 1 ; j <= 9; j++){
                System.out.print( j + " x " + i + " = " +i*j+ "\t");
            }
            System.out.println();
        }
    }
    
}
