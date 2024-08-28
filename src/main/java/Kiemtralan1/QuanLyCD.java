/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kiemtralan1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class QuanLyCD {

    private static Scanner sc = new Scanner(System.in);
    private static CD cd = null;
    private static List<CD> listCD = new ArrayList<>();

    public static void menu() {
        listCD.add(new CD("CD01", "Noi buon gac tro", "Quang Linh", 19500, 2018));
        listCD.add(new CD("CD02", "Bai ca tinh dem", "Duc Tuan", 185000, 2021));
        listCD.add(new CD("CD03", "Cau ho chieu que", "Nhieu ca si", 172000, 2022));
        listCD.add(new CD("CD04", "Tinh dau tinh cuoi", "Van Khanh", 139000, 2022));
        listCD.add(new CD("CD05", "Thanh Pho Mua Bay", "Dan Nguyen ", 182000, 2019));

        int chon = 0;
        while (chon != 8) {
            System.out.println("======Quan Ly CD======"
                    + "\n1.Xuat toan bo CD va tong tri gia CD"
                    + "\n2.Lay cac CD phat hanh truoc nam 2022"
                    + "\n3.Tim cac CD co chu tinh trong ten"
                    + "\n4.Sap xep CD theo gia giam dan"
                    + "\n5.Xoa CD theo ma so"
                    + "\n6.Sua gia ban cua CD theo ma so"
                    +"\n7.Tong cac gia tri CD "
                    +"\nChon hanh dong muon thuc hien: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Xuat();
                    break;
                case 2:
                    for(CD cd:listCD){
                    if (cd.getNamphathanh() < 2020) {
                        Xuat();
                    }}
                    break;
                case 3:
                    for (CD cd : listCD) {
                        if (cd.getTenCD().contains("tinh")) {
                            Xuat();
                        }
                    }
                    break;
                case 4:
                    SapXepGiamDan();
                    break;
                case 5:
                    timKiemCD();
                    cd.remove(cd);
                    break;
                case 6:
                    break;
                case 7:
                    TinhTong();
                    break;
                
            }

        }

    }

    public static void Xuat() {
        int tong=0;
        for(CD cd:listCD)
            tong+=cd.getGiaban();
        for (CD cd : listCD) {
            System.out.println("\nMa so: " + cd.getMaso()
                    + "\nTen CD: " + cd.getTenCD()
                    + "\nCa si: " + cd.getCasi()
                    + "\nGia ban: " + cd.getGiaban()
                    + "\nNam phat hanh: " + cd.getNamphathanh()
                    + "\nTong gia tri cd: " + tong);
        }
    }

    public static void timKiemCD() {
        CD timkiem = null;
        sc.nextLine();
        System.out.println("Nhap ma so muon tim");
        String Masotim = sc.nextLine();
        for (CD cd : listCD) {
            if (cd.getMaso().equalsIgnoreCase(Masotim)) {
                timkiem = cd;
            }
        }
        int findIndex = listCD.indexOf(new CD(Masotim));

        if (findIndex != -1) {
            System.out.println("Da tim thay" + listCD.get(findIndex));
        } else {
            System.out.println("Khong tim thay");
        }
    }
    public static void SapXepGiamDan(){
        Comparator<CD> cd=new Comparator<CD>(){
            @Override
            public int compare(CD Cd1,CD cd2){
                return Double.compare(cd2.getGiaban(),Cd1.getGiaban());
            }
        };
    }
    public static void TinhTong(){
        int tong=0;
        for(CD cd:listCD)
            tong+=cd.getGiaban();
        Xuat();
    }

}
