package manager;

import model.NhanVien;
import model.NhanVienFullTime;
import model.NhanVienPartTime;

import java.util.Scanner;

public class ManagerStaff {
    NhanVien[] nhanViens = new NhanVien[0];
    Scanner scanner = new Scanner(System.in);

    public void show() {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].toString());
        }
    }

    public void add(NhanVien nhanVien) {
        NhanVien[] newNV = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNV[i] = nhanViens[i];
        }
        newNV[newNV.length - 1] = nhanVien;
        nhanViens = newNV;
    }

    public NhanVien creatNV(boolean isFullTime) {
        System.out.println("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên: ");
        String gender = scanner.nextLine();
        if (isFullTime) {
            System.out.println("Nhập hệ số: ");
            double heSo = Double.parseDouble(scanner.nextLine());
            NhanVien nhanVien = new NhanVienFullTime(name, age, gender, heSo);
            return nhanVien;
        } else {
            System.out.println("Nhập số buổi: ");
            int soBuoi = Integer.parseInt(scanner.nextLine());
            NhanVien nhanVien = new NhanVienPartTime(name, age, gender, soBuoi);
            return nhanVien;
        }
    }

    public int findName(String name) {
        for (int i = 0; i < nhanViens.length; i++) {
            if (name.equals(nhanViens[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void edit(String name) {
        if (findName(name) != -1) {
            System.out.println("Bạn muốn sửa nhân viên thành loại gì?");
            System.out.println("1. FullTime");
            System.out.println("2. PartTime");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    nhanViens[findName(name)] = creatNV(true);
                    break;
                case 2:
                    nhanViens[findName(name)] = creatNV(false);
                    break;
            }
        }
    }

    public void delete(String name) {
        if(findName(name)!=-1) {
            NhanVien[] newNV = new NhanVien[nhanViens.length - 1];
            for (int i = 0; i < newNV.length; i++) {
                if (i < findName(name)) {
                    newNV[i] = nhanViens[i];
                } else {
                    newNV[i] = nhanViens[i + 1];
                }
            }
            nhanViens = newNV;
        }
    }

    public void showSalary() {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println("Lương của " + nhanViens[i].getName() + " là: " + nhanViens[i].salary());
        }
    }


}
