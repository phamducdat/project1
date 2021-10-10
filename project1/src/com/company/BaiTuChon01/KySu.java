package com.company.BaiTuChon01;

import java.util.Scanner;

public class KySu extends CanBo {

   private String nganhDaoTao;

    public KySu(String fullName, int age, String sex, String address, String trainingIndustry) {
        super(fullName, age, sex, address);
        this.nganhDaoTao = trainingIndustry;
    }

    public KySu(String trainingIndustry) {
        this.nganhDaoTao = trainingIndustry;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(){

    }

    public KySu createKySu() {
        KySu kySu = new KySu();
        super.createCanBo(kySu);
        System.out.print("Ngành đào tạo: ");
        String nganhDaoTao = null;
        Scanner scanner = new Scanner(System.in);
        nganhDaoTao = scanner.nextLine();
        kySu.setNganhDaoTao(nganhDaoTao);
        return kySu;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ngành đào tạo: " + nganhDaoTao;
    }
}
