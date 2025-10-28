package Bai2;

import java.util.Scanner;

public class TH1 {
    public static void nhapMang(int a[], int n){
       Scanner sc = new Scanner(System.in);
        for(int i =0;i<n;i++){
            System.out.print("A["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int a[], int n){
        for(int i=0;i<n;i++)
            System.out.print(" "+a[i]);
    }
    public static boolean NguyenTo(int x){
        if (x <= 1) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(x);
        for (int i = 3; i <= sqrt; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public static void tinh(int a[], int n){
        int s1=0;
        int s2=1;
        for(int i=0;i<n;i++){
             s1 = s1 + a[i];
             s2 = s2*a[i];
        }
        System.out.print("\nTong la : "+s1);
        System.out.print("\nTich la : "+s2);
    }
    public static void kiemTra(int a[], int n){
        for(int i=0;i<n;i++){
            if (NguyenTo(a[i]) == true )
                System.out.print(" "+ a[i]);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap so phan tu : ");
        int n = sc.nextInt();
        int a[] = new int [n];
        nhapMang(a, n);
        System.out.println("\nMang vua nhap la : ");
        xuatMang(a, n);
        tinh(a, n);
        System.out.println("\nSo nguyen to la :");
        kiemTra(a, n);
    }
}
