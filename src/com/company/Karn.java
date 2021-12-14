package com.company;
//
// import java.util.Scanner;
public class Karn {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        //Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n = 5;
        int star = 1;
        char c='D';
        for (int i = n; i >= 1; i--) {
            for (int space = i - 1; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print(c);
            }
            System.out.println();
            star +=2;
        }
    }
}