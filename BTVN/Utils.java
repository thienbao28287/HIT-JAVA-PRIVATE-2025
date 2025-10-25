package Bai2.BTVN;
import java.util.Scanner;
public class Utils {
    public static void tinhTong(int[] a, int n) {
        int s1 = 0;
        for (int i =0;i<n;i++) {
            s1 = s1 +a[i];
        }
        System.out.println("Tong la : "+s1);
    }
    public static void Check(int a[], int n){
        int min = a[0];
        int max = a[0];
        for(int i = 0;i<n;i++){
            if (min>a[i])
                min = a[i];
            if(max<a[i])
                max = a[i];
        }
        System.out.println("\nMin : "+min);
        System.out.println("\nMax : "+max);
    }
    public static void sapXepTangDan(int a[], int n){
        int temp=0;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++){
                if (a[i]>a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
    }
    public static boolean checkSoNguyenTO(int x){
        if (x<1) return false;
        else if (x==2) return true;
        else if(x%2==0) return false;
        else {
            int s = (int) Math.sqrt(x);
            for ( int i=3;i<=s;i=i+2){
                if(x%i==0) return false;
            }
        }
        return true;
    }
    public static void inSoNguyenToMax(int a[], int n){
        int max = a[0];
        int dem=0;
        for (int i=0;i<n;i++){
            if (checkSoNguyenTO(a[i])==true && a[i] >max){
                System.out.print("\nPhan tu la SNT lon nhat la : "+max);
                dem++;
            }
        }
        if (dem==0 ){
            System.out.print("\nKhong co phan tu thoa man");
        }
    }
    public static void main(String[] args) {
    }
}
