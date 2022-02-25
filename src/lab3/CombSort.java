package lab3;

public class CombSort {
    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr2 = {4, 8, 1, 5, 9, 2, 3};
        CombSort cs = new CombSort();
        cs.sort(arr2);
        printArray(arr2);
    }

    // To find gap between elements
    int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }

    public void sort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;
        while (gap != 1 || swapped) {
            // Find next gap
            gap = getNextGap(gap);
            swapped = false;
            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }
}
