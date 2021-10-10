package com.company.BaiTuChon01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class QLCB {
    private final ArrayList<CanBo> canBoArrayList;
    private final CongNhan congNhan;
    private final KySu kySu;
    private final NhanVien nhanVien;

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }


    private int getOption(int start, int end) {
        System.out.print("Nhập option bạn muốn: ");
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        while (!isNumeric(input) || Integer.parseInt(input) < start || Integer.parseInt(input) > end ) {
            System.out.print("Vui lòng nhập lại: ");
            input = scanner.nextLine();

        }
        return Integer.parseInt(input);
    }

    private void timKiemTheoHoTen() {
        System.out.print("Nhập họ tên bạn muốn tìm kiếm: ");
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Kết quả: ");
        String finalName = name;
        AtomicInteger count = new AtomicInteger();
        canBoArrayList.forEach(canBo -> {
            if (canBo.getFullName().contains(finalName)) {
                System.out.println(canBo.toString());
                count.getAndIncrement();
            }
        });
        if (count.intValue() == 0) System.out.println("Không tìm thấy cán hộ theo yêu cầu, vui lòng thử lại");
        System.out.println();
    }


    private void hienThiDanhSachCanBo() {
        System.out.println("Danh sách cán bộ: ");
        this.canBoArrayList.forEach(canBo -> {
            System.out.println(canBo.toString());
        });
        System.out.println();
    }

    private void themMoiCanbo() {
        System.out.println("Chọn đối tượng muốn thêm:");
        System.out.println("1: Công nhân");
        System.out.println("2: Kỹ sư");
        System.out.println("3: Nhân viên");
        int option = getOption(1, 3);
        System.out.println();

        CanBo canBo = null;
        if (option == 1) {
            canBo = congNhan.createCongNhan();
        }
        if (option == 2) {
            canBo = kySu.createKySu();
        }
        if (option == 3) {
            canBo = nhanVien.createNhanVien();
        }
        canBoArrayList.add(canBo);
        System.out.println("Thêm thành công");
        System.out.println();

    }

    public QLCB() {
        this.canBoArrayList = new ArrayList<>();
        this.kySu = new KySu();
        this.congNhan = new CongNhan();
        this.nhanVien = new NhanVien();
    }

    public static void main(String[] args) {

        System.out.println("Xin chào");
        NhanVien nhanVien = new NhanVien("Phạm Đức Đạt", 22,
                "Nam", "Hưng yên", "IT");
        QLCB qlcb = new QLCB();
        qlcb.canBoArrayList.add(nhanVien);

        while (true) {
            System.out.println("1: Thêm mới cán bộ");
            System.out.println("2: Tìm kiếm theo họ tên");
            System.out.println("3: Hiển thị thông tin về danh sách các cán bộ");
            System.out.println("4: Thoát khỏi trương trình");
            System.out.println("---------------------------------");
            int option = qlcb.getOption(1, 4);
            System.out.println();

            if (option == 1) qlcb.themMoiCanbo();
            if (option == 3) qlcb.hienThiDanhSachCanBo();
            if (option == 2) qlcb.timKiemTheoHoTen();
            if (option == 4) break;
        }
    }
}
