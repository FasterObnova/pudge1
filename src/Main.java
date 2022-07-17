import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println("Ira fast rapira");

        String newVariable = "ahaqhahahah"; // строка

        int newInt = 5; // целое число

        char newChar = '@'; // символ
        char newChar2 = 148;

        double newDouble = 5.5; //не целое число
        long newLong = 4444444L;
        boolean newBoolean = true;
        boolean isPrime = 7 % 2 == 0;

        if (0 == 1) {
            System.out.println("asdasda");
        } else {
            System.out.println(":(");
        }

        Random random = new Random();
        int randomDay = random.nextInt(20);

        int data = 16;

        if (data + randomDay <= 31) {
            System.out.println("July");
        } else {
            System.out.println("August");
        }

        System.out.println(randomDay);

        int age = random.nextInt(20);

        if (age < 10) {
            System.out.println("Melkiy");
        }
        if (age > 18) {
            System.out.println("Stariy");
        }
        if (age >= 10 && age <= 18) {
            System.out.println("ok");
        }
        System.out.println(age);
    }

}