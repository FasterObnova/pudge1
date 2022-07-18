import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int chas = scanner1.nextInt();
        int min = scanner2.nextInt();

        int time = chas * 100 + min;

        if(chas > 23) {
            System.out.println(">:(");
        }
        if(chas < 0) {
            System.out.println(">:(");
        }
        if(min > 59) {
            System.out.println(">:(");
        }
        if(min < 0) {
            System.out.println(">:(");
        }
        if(time >= 2300 && time <= 2359) {
            System.out.println("Otboi");
        }
        if(time >= 0 && time <= 759) {
            System.out.println("Otboi");
        }
    }
}
