/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DE01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class QLCauThu {

    public static ArrayList<CauThu> ds = new ArrayList<>();

    public QLCauThu() {
        ds = new ArrayList<>();
        ds.add(new CauThu(1, "Nguyen Van A", 1999, 1000, 1, 1));
        ds.add(new CauThu(2, "Nguyen Van B", 1999, 1000, 1, 1));
        ds.add(new CauThu(3, "Nguyen Van C", 1999, 1000, 1, 1));
        ds.add(new CauThu(4, "Nguyen Van D", 1999, 1000, 1, 1));
        ds.add(new CauThu(5, "Nguyen Van E", 1999, 1000, 1, 1));
        ds.add(new CauThu(6, "Nguyen Van F", 1999, 1000, 1, 1));
        ds.add(new CauThu(7, "Nguyen Van G", 1999, 1000, 1, 1));
        ds.add(new CauThu(8, "Nguyen Van H", 1999, 1000, 1, 1));
        ds.add(new CauThu(9, "Nguyen Van J", 1999, 1000, 1, 1));
        ds.add(new CauThu(10, "Nguyen Van M", 1999, 1000, 1, 1));
        ds.add(new CauThu(11, "Nguyen Van N", 1999, 1000, 1, 1));
    }

    public static void ThemCauThu() {
        System.out.println("Thuc hien nhap:");

        Scanner s = new Scanner(System.in);
        String tieptuc;

        do {
            CauThu ct;
            //1. Nhap thong tin
            System.out.print("Nhap so ao:");
            int soao = Integer.parseInt(s.nextLine());
            System.out.print("Ho ten: ");
            String hoten = s.nextLine();
            System.out.print("Nam Sinh: ");
            double namsinh = Double.parseDouble(s.nextLine());
            System.out.print("Luong cung: ");
            double luongcung = Double.parseDouble(s.nextLine());
            System.out.print("Tien thuong: ");
            double tienthuong = Double.parseDouble(s.nextLine());
            System.out.print("Tien phat: ");
            double tienphat = Double.parseDouble(s.nextLine());
            ct = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
            
            ds.add(ct);

            System.out.println("Tiep tuc (Y/N?");
            tieptuc = s.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }
}
