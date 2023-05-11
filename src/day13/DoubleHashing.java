package day13;

import java.util.*;

public class DoubleHashing {

    static int h1(int x, int n) {
        return (x % n);
    }

    static int h2(int x) {
        return (8 - (x % 8));
    }

    static int doubleHashing(int x, int n, int i, int[] arr) {
        System.out.println(h1(x, n));

        if (arr[h1(x, n)] == -1) {
            arr[h1(x, n)] = x;
            return h1(x, n);
        }

        int index = (h1(x, n) + (i * h2(x))) % n;

        if (arr[index] == -1) {
            arr[index] = x;
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 11;

        int[] arr = new int[n];
        Arrays.fill(arr, -1);

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();

            int count = 1;
            int index = -1;

            do {
                index = doubleHashing(x, n, count, arr);
                count++;
            } while (index == -1);
        }

        for (int it : arr) {
            System.out.print(it + " ");
        }

        System.out.println();
    }
}