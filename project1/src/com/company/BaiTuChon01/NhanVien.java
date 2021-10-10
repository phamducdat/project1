package com.company.BaiTuChon01;

import java.util.Scanner;

public class NhanVien extends CanBo{

    private String congViec;

    public NhanVien(String hoVaTen, int age, String sex, String address, String congViec) {
        super(hoVaTen, age, sex, address);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    public NhanVien() {

    }

    public NhanVien createNhanVien() {
        NhanVien nhanVien = new NhanVien();
        super.createCanBo(nhanVien);
        System.out.print("Công việc: ");
        Scanner scanner = new Scanner(System.in);
        String congViec = scanner.nextLine();
        nhanVien.setCongViec(congViec);
        return nhanVien;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Công việc: " + congViec;
    }
}
