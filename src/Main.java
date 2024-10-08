import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        double[] numbers = {1.57, 7.654, 9.986};
        int[] mounths = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // task 2
        System.out.println("Задача 2");
        for (int i = 0; i < 3; i++) {
            System.out.println(weights[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < mounths.length; i++) {
            System.out.println(mounths[i]);
        }
        // task 3
        System.out.println("Задача 3");
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = mounths.length - 1; i >= 0; i--) {
            System.out.print(mounths[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        // task 4
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) ;
            arr[i] += arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}