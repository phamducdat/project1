package com.company.BaiTuChon01;

import java.util.Scanner;

public class CongNhan extends CanBo {

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level< 1 || level > 10) this.level = Integer.parseInt(null);
        this.level = level;
    }

    public CongNhan(String fullName, int age, String sex, String address, int level) {
        super(fullName, age, sex, address);
        this.level = level;
    }

    public CongNhan() {

    }

    public CongNhan createCongNhan(){
        CongNhan congNhan = new CongNhan();
        super.createCanBo(congNhan);
        System.out.print("Bậc(1,10): ");
        String level;
        Scanner scanner = new Scanner(System.in);
        level = scanner.nextLine();
        while (!super.isNumeric(level) ||Integer.parseInt(level)< 1 || Integer.parseInt(level) > 10) {
            System.out.print("Vui lòng nhập lại bậc: ");
            level = scanner.nextLine();
        }
        congNhan.setLevel(Integer.parseInt(level));
        return congNhan;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Bậc: " + level;
    }
}
