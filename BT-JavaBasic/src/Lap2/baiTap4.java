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
public class baiTap4 {
     public static void main(String[] args) {
        int choiceNumber;
        Scanner scanner = new Scanner(System.in);
         
        // vòng lặp for vắng mặt cả 3 biểu thức
        for (;;) {
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Thoát");
             
            do {
                System.out.println("Bấm số để chọn (1/2/3/4): ");
                choiceNumber = scanner.nextInt();
            } while ((choiceNumber < 1) || (choiceNumber > 3));
             
            switch (choiceNumber) {
                case 1:
                    System.out.println("Ban chon Giai Phuong Trinh Bac 1!");
                    break;
                case 2:
                    System.out.println("Ban chon Giai Phuong Trinh Bac 2!");
                    break;
                case 3:
                    System.out.println("Ban chon Tinh Tien Dien!");
                case 4:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0); // thoát chương trình
                    break;
            }
        }
    
    
     }
}
