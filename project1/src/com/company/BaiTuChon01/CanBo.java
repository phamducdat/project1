package com.company.BaiTuChon01;

import javafx.scene.input.TouchEvent;

import java.util.Scanner;

public class CanBo {
    private String hoVaTen;
    private int Tuoi;
    private String gioiTinh;
    private String diaChi;

    public String getFullName() {
        return hoVaTen;
    }

    public void setFullName(String fullName) {
        this.hoVaTen = fullName;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        this.Tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CanBo(String hoVaTen, int age, String sex, String address) {
        this.hoVaTen = hoVaTen;
        this.Tuoi = age;
        this.gioiTinh = sex;
        this.diaChi = address;
    }

    public CanBo() {

    }

    public boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public void createCanBo(CanBo canBo) {
        System.out.print("Họ và tên: ");
        String hoVaTen = null;
        Scanner scanner = new Scanner(System.in);
        hoVaTen = scanner.nextLine();

        System.out.print("Tuổi: ");
        String Tuoi;
        Tuoi = scanner.nextLine();
        while (!isNumeric(Tuoi)) {
            System.out.print("Vui lòng nhập lại: ");
            Tuoi = scanner.nextLine();
        }

        System.out.print("Giới tính (Nam, Nữ, Khác): ");
        String gioiTinh = null;
        gioiTinh = scanner.next();
        while (!gioiTinh.equalsIgnoreCase("Nữ")
                && !gioiTinh.equalsIgnoreCase("Nam") &&
                !gioiTinh.equalsIgnoreCase("Khác")) {
            System.out.print("Vui lòng nhập lại giới tính:");
            gioiTinh = scanner.next();

        }
        System.out.print("Địa chỉ: ");
        String diaChi = null;
        Scanner scanner1 = new Scanner(System.in);
        diaChi = scanner1.nextLine();

        canBo.setDiaChi(diaChi);
        canBo.setTuoi(Integer.parseInt(Tuoi));
        canBo.setFullName(hoVaTen);
        canBo.setGioiTinh(gioiTinh);
    }

    @Override
    public String toString() {
        return
                "Họ và tên: " + hoVaTen  +
                ", Tuổi: " + Tuoi +
                ", Giới tính: " + gioiTinh  +
                ", Địa chỉ: " + diaChi  +
                ',';
    }
}
