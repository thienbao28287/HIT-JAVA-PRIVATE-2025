package Bai2;


import java.util.Scanner;

public class TH2 {
    public static void nhapMang(String a[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("A["+i+"] = ");
            a[i] = sc.nextLine();
        }
    }
    public static void xuatMang(String a[], int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
    }
    public static void inNguoc(String a[], int n){
        for(int i=n-1;i>=0;i--){
            System.out.print(" "+a[i]);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so phan tu : ");
        int n = sc.nextInt();
        String a[] = new String [n];
        nhapMang(a, n);
        System.out.println("Mang vua nhap la : ");
        xuatMang(a, n);
        System.out.println("\nMang in nguoc la : ");
        inNguoc(a, n);

    }
}
