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
        if(time >= 800 && time <= 829) {
            System.out.println("Podjom");
        }
        if(time >= 830 && time <= 859) {
            System.out.println("Kaif");
        }
        if(time >= 900 && time <= 939) {
            System.out.println("Zavtrak");
        }
        if(time >= 940 && time <= 959) {
            System.out.println("Turitayak");
        }
        if(time >= 1000 && time <= 1259) {
            System.out.println("Uroki");
        }
        if(time >= 1300 && time <= 1309) {
            System.out.println("Obed");
        }
        if(time >=1310  && time <= 1359) {
            System.out.println("Kaif");
        }
        if(time >= 1400 && time <= 1559) {
            System.out.println("MasterClass");
        }
        if(time >= 1600 && time <= 1609) {
            System.out.println("Poldnik");
        }
        if(time >= 1610 && time <= 1629) {
            System.out.println("Kaif");
        }
        if(time >= 1630 && time <= 1659) {
            System.out.println("TorkemTime");
        }
        if(time >= 1700 && time <= 1829) {
            System.out.println("kaif");
        }
        if(time >= 1830 && time <= 1839) {
            System.out.println("Ujin");
        }
        if(time >= 1840 && time <= 1959) {
            System.out.println("Kaif");
        }
        if(time >= 2000 && time <= 2259) {
            System.out.println("Vecherka");
        }
    }
}
