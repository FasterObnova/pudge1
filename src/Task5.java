import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
            System.out.print(array[i] + " ");
        }

        //Max
        int maxel = 0;
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxel = i;
            }
        }

        System.out.println();
        System.out.println("Max: " + max);

        //Min
        int minel = 0;
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                minel = i;
            }
        }

        System.out.println("Min: " + min);

        //Mid
        double mid = array[0];
        int all = 0;
        for(int i = 0; i < array.length; i++) {
            all += array[i];
        }
        mid = (double) all / array.length;

        System.out.println("Mid: " + mid);

        //Max~Min
        int imax = array[maxel];
        int imin = array[minel];
        int kolvoel = maxel - minel;
        if (kolvoel < 0) {
            kolvoel *= -1;
        }

        System.out.println("Max~Min: " + (kolvoel-1));

    }
}
