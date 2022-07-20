import java.util.Scanner;

public class Elochka3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        for(int a = 1; a <= i; a++) {
            System.out.println();
            for(int space = a; space <= i; space++) {
                System.out.print(" ");
            }
            for(int str = 1; str <= a; str++){
                System.out.print("* ");

            }
        }


    }
}