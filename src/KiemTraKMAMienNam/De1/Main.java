package KiemTraKMAMienNam.De1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SieuThi st = new SieuThi();
        int choice = 0;
        do {
            System.out.println(" =================Menu======================");
            System.out.println("|  1.Nhap San Pham                          |");
            System.out.println("|  2.Them Khach Hang                        |");
            System.out.println("|  3.Change info Khach Hang                 |");
            System.out.println("|  4.In All San Pham                        |");
            System.out.println("|  5.Khach Hang mua San Pham                |");
            System.out.println("|  6.In tat ca khach hang da mua va sap xep |");
            System.out.println("|  7.In tat ca khach hang                   |");
            System.out.println("|  8.In tat ca Hoa Don                      |");
            System.out.println("|  0.Exit                                   |");
            System.out.println(" ===========================================");
            System.out.printf("Moi nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("-> Ban da chon chuc nang 1");
                    st.nhapSP();
                    break;
                case 2:
                    System.out.println("-> Ban da chon chuc nang 2");
                    st.dangKiKH();
                    break;
                case 3:
                    System.out.println("-> Ban da chon chuc nang 3");
                    st.suaKH();
                    break;
                case 4:
                    System.out.println("-> Ban da chon chuc nang 4");
                    st.inAllSP();
                    break;
                case 5:
                    System.out.println("-> Ban da chon chuc nang 5");
                    st.khachMuaHang();
                    break;
                case 6:
                    System.out.println("-> Ban da chon chuc nang 6");
                    st.sapSepKH();
                    break;
                case 7:
                    System.out.println("-> Ban da chon chuc nang 7");
                    st.inAllKH();
                    break;
                case 8:
                    System.out.println("-> Ban da chon chuc nang 8");
                    st.inAllHD();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hay nhap lua chon 0-6");
                    break;
            }
        } while(choice != 0);
    }
}
