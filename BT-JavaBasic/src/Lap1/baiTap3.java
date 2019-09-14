/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class baiTap3 {
    public static void main(String[] args){
        int canh;
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Nhập chiều dài hình hộp chữ nhật: ");
        float fChieuDai = scanner.nextFloat();
        
        System.out.print("Nhập chiều rộng hình hộp chữ nhật: ");
        float fChieuRong = scanner.nextFloat();
        
        System.out.print("Nhập chiều cao hình hộp chữ nhật: ");
        float fChieuCao = scanner.nextFloat();
        
        float TheTich;
        TheTich = fChieuDai * fChieuRong *fChieuCao;
        System.out.print("Thể tích hình hộp chữ nhật là: " +TheTich);
        
    }
    
}
