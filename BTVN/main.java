package Bai2.BTVN;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap so luong phan tu  : ");
        int n = scanner.nextInt();
        int a[] = new int [n];
        System.out.println("\nMoi nhap gia tri phan tu : ");
        for(int i=0;i<n;i++){
            System.out.print("A["+i+"] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Phan tu da nhap la : ");
        for(int i=0;i<n;i++){
            System.out.print(" " + a[i]);
        }
        System.out.println("\n--- Menu ---");
        System.out.println("1. Tính tổng các phần tử.");
        System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng");
        System.out.println("3. Sắp xếp lại mảng theo chiều tăng dần");
        System.out.println("4. In ra số nguyên tố lớn nhất trong mảng");
        System.out.println("Moi nhap lua chon : ");
        int choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    Utils.tinhTong(a, n);
                    break;
                case 2 :
                    Utils.Check(a, n);
                    break;
                case 3 :
                    Utils.sapXepTangDan(a, n);
                    break;
                case 4 :
                    Utils.inSoNguyenToMax(a, n);
                    break;
                default:
                    System.out.print("Nhap sai gia tri!");
            }
    }
}
