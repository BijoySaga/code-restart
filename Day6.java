import java.util.*;

public class Day6 {

//    1. remove duplicate number fron array
    static void removeDuplicate(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (!list.contains(j)) {
                list.add(j);
            }
        }
        System.out.println(list);
    }

//    2. bubble sort an array
    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    3. selection sort an array
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    4. common element on two dif array
    static void commonElement(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                System.out.print(arr2[j] + " ");
            }
        }
        System.out.println();
    }

//    5. merget two sort arays in dif array
    static void mergeSortArray(int[] arr1, int[] arr2) {
        int left = 0;
        int right = 0;
        int summ = arr1.length + arr2.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < summ; i++) {
            if (left >= arr1.length) {
                list.add(arr2[right]);
                right++;
            } else if (right >= arr2.length) {
                list.add(arr1[left]);
                left++;
            } else if (arr1[left] < arr2[right]) {
                list.add(arr1[left]);
                left++;
            } else {
                list.add(arr2[right]);
                right++;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        removeDuplicate(new int[]{1, 2, 2, 3, 4, 4, 5});
        bubble(new int[]{4, 56, 8, 2, 6, 9, 45, 24, 86, 35, 0});
        selectionSort(new int[]{21, 848, 62, 4789, 654, 57, 0, 8});
        commonElement(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 6, 7});
        mergeSortArray(new int[]{3, 11, 13}, new int[]{8, 12, 14});
    }
}