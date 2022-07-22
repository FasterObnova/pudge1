public class Task4 {
    public static void main(String[] args) {

        //1
        int[] aoi = new int[10];

        for (int i = 0; i < aoi.length; i++) {
            aoi[i] = i + 1;
        }
        for (int current : aoi) {
            System.out.print(current + " ");
        }
        System.out.println();

        //2
        for (int i = 0; i < aoi.length; i++) {
            aoi[i] = (i + 1) * 2;
        }
        for (int current : aoi) {
            System.out.print(current + " ");
        }
        System.out.println();

        //3
        int a = 1;
        for (int i = 0; i < aoi.length; i++) {
            aoi[i] = a;
            a += 2;
        }
        for (int current : aoi) {
            System.out.print(current + " ");
        }
        System.out.println();

        //4
        a = 1;
        int b = 1;
        for (int i = 0; i < aoi.length; i++) {
            aoi[i] = a;
            b += 2;
            a += b;
        }
        for (int current : aoi) {
            System.out.print(current + " ");
        }
        System.out.println();

        //5
        a = 1;
        for (int i = 0; i < aoi.length; i++) {
            aoi[i] = a;
            a *= -1;
        }
        for (int current : aoi) {
            System.out.print(current + " ");
        }
        System.out.println();

        //6
        for (int i = 0; i < aoi.length; i++) {
            aoi[i] = (i + 1) * a;
            a *= -1;
        }
        for (int current : aoi) {
            System.out.print(current + " ");
        }
        System.out.println();

        //7
        for (int i = 0; i < aoi.length; i++) {
            aoi[i] = i * i;
        }
        for (int current : aoi) {
            System.out.print(current + " ");
        }
        System.out.println();

    }
}
