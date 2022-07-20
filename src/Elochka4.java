import java.util.Scanner;

public class Elochka4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        for(int a = 1; a <= i; a++) {
            System.out.println();
            for(int space = 1; space <=a; space++) {
                System.out.print(" ");
            }
            for(int str = a; str <= i; str++){
                System.out.print("* ");

            }
        }


    }
}
