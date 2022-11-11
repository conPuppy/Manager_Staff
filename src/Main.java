import manager.ManagerStaff;
import model.NhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStaff managerStaff = new ManagerStaff();

        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1. Thêm nhân viên: ");
            System.out.println("2. Sửa nhân viên: ");
            System.out.println("3. Xoá nhân viên: ");
            System.out.println("4. Hiển thị lương nhân viên: ");
            System.out.println("5. Hiển thị nhân viên: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại nhân viên bạn muốn thêm: ");
                    System.out.println("1. Nhân viên FullTime: ");
                    System.out.println("2. Nhân viên PartTime: ");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2) {
                        case 1:
                            managerStaff.add(managerStaff.creatNV(true));
                            break;
                        case 2:
                            managerStaff.add(managerStaff.creatNV(false));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chọn tên nhân viên muốn sửa: ");
                    String nameEdit = scanner.nextLine();
                    managerStaff.edit(nameEdit);
                    break;
                case 3:
                    System.out.println("Nhập tên nhân viên muốn xoá: ");
                    String nameDelete = scanner.nextLine();
                    managerStaff.delete(nameDelete);
                    break;
                case 4:
                    managerStaff.showSalary();
                    break;
                case 5:
                    managerStaff.show();
                    break;
                default:
                    return;
            }
        }
    }
}