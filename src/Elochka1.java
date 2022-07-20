import java.util.Scanner;

public class Elochka1 {
    public static void main(String[] args) {

        Scanner scanfor2 = new Scanner(System.in);
        int c = scanfor2.nextInt();

        int d;
        for(int str = 1; str <= c; str++) {
            System.out.println();

            for(d = str + 1; d <= c; d++) {
                System.out.print(" ");
            }

            for(d = 1; d <= str; d++) {
                System.out.print("*");
            }
        }
            }
}
