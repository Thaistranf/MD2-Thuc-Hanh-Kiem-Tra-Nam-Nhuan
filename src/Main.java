import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int year = sc.nextInt();

        boolean namNhuan = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    namNhuan = true;
                } else {
                    namNhuan = false;
                }
            } else {
                namNhuan = true;
            }
        } else {
            namNhuan = false;
        }
        if (namNhuan){
            System.out.printf("Năm %d là năm nhuận", year);
        } else {
            System.out.printf("Năm %d là năm không nhuận", year);
        }
    }
}