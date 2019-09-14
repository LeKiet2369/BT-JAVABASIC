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
public class baiTap2 {
    public static void main(String[] args){
        int canh;
        
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Chieu dai hinh chu nhat: ");
        float fChieuDai = scanner.nextFloat();
        
        System.out.print("Chieu rong hinh chu nhat: ");
        float fChieuRong = scanner.nextFloat();
        
        float ChuVi, DienTich, CanhNhoNhat;
        ChuVi = (fChieuDai + fChieuRong)*2;
        DienTich = fChieuDai * fChieuRong;
        CanhNhoNhat = Math.min(fChieuDai, fChieuRong);
        
        System.out.println("Chu Vi Hinh chu Nhat la: " +ChuVi);
        System.out.println("Dien Tich Hinh chu Nhat la : " +DienTich);
        System.out.println("Canh Nho Nhat la: " +CanhNhoNhat);
    }
    
}
