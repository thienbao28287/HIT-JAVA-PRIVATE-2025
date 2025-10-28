package Bai1;

import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập 2 số nguyên ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Tong hai so la : "+(a+b));
        System.out.println("Hieu hai so la : "+(a+b));
        System.out.println("Thuong 2 so la : "+(a/b));
        System.out.println("Tich 2 so la : "+(a*b));
        System.out.println("Phan du la : "+(a%b));
    }
}
