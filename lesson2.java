import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình kiểm tra số chẵn lẻ");

        while (true) {
            System.out.print("Nhập một số nguyên (nhập 0 để thoát): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Kết thúc chương trình.");
                break;
            }

            if (isEven(number)) {
                System.out.println(number + " là số chẵn.");
            } else {
                System.out.println(number + " là số lẻ.");
            }
        }

        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
