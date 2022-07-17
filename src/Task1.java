import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        if (a > 365) {
            a = a - 365 * (a / 365);
        }
        if(a < 1) {
           System.out.println("Incorrect");
        }
        if(a > 0 && a < 32) {
            System.out.println("January");
        }
        if(a > 31 && a < 60) {
            System.out.println("February");
        }
        if(a > 59 && a < 91) {
            System.out.println("March");
        }
        if(a > 90 && a < 121) {
            System.out.println("April");
        }
        if(a > 120 && a < 152) {
            System.out.println("May");
        }
        if(a > 151 && a < 182) {
            System.out.println("June");
        }
        if(a > 181 && a < 213) {
            System.out.println("Jule");
        }
        if(a > 212 && a < 244) {
            System.out.println("August");
        }
        if(a > 243 && a < 274) {
            System.out.println("September");
        }
        if(a > 273 && a < 305) {
            System.out.println("October");
        }
        if(a > 304 && a < 335) {
            System.out.println("November");
        }
        if(a > 334 && a < 366) {
            System.out.println("December");
        }

    }
}
//1000-7 zxc