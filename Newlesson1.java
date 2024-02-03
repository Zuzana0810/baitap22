/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package thanghai.newlesson;

import java.util.Scanner;

/**
 *
 * @author hongkong
 */
public class Newlesson {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Tinh luong thuc nhan ");
            System.out.println(" Nhap luong co ban ");
            int lcb = scanner.nextInt();
            System.out.println(" Nhap luong doanh so ");
            int lds = scanner.nextInt();
            float bhxh = (float)(lcb * 0.105);
            float ltt = 0;
            if (lcb < 5) {
                ltt = (float)(lcb + 1.1 * lds - bhxh - 11);
                System.out.println(" luong tinh thue = " + ltt);
            } else if (lds > lcb) {
                ltt = (float)(lcb + 0.8 * lds - bhxh - 11);
                System.out.println(" luong tinh thue = " + ltt);
            } else if (lds > 5 && lds > lcb) {
                ltt = (float)(lcb + lds + 1 - bhxh - 11);
                System.out.println(" luong tinh thue = " + ltt);
            } else if (lds > 10 && lds > lcb) {
                ltt = (float)(lcb + lds + 2.5 - bhxh - 11);
                System.out.println(" luong tinh thue = " + ltt);
            } else if ((lds > 10 && lcb < 5 && lds > lcb) || (lds > 20 && lcb > 5) && (lds > lcb)) {
                ltt = (float)(lcb + lds + 5 - bhxh - 11);
                System.out.println(" luong tinh thue = " + ltt);
            } else {
                System.out.println(" luong tinh thue = " + 0);
            }
            if (ltt < 5) {
                System.out.println(" luong thuc nhan = " + ( ltt+11) );
            } else if (ltt < 10) {
                float ltn = (float)(ltt - 0.1 * ltt)+ 11 ;
                System.out.println(" luong thuc nhan = " + ltn);
            } else {
                float ltn = (float)(ltt - ltt * 0.2) + 11 ;
                System.out.println(" luong thuc nhan = " + ltn);
            }
        }
    }

}


    
            
        
 

  

