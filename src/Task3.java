import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        int kolvo = scanner1.nextInt();

        for(int i = 1; i <= kolvo; i++) {
            System.out.println(kolvo - i);
            for(int a = i; 1 <= kolvo - 1; a++) {
                System.out.print(" ");
            }
            for(int star = 1; star <= i; star++) {
                System.out.print("*");
            }

        }
    }
}
