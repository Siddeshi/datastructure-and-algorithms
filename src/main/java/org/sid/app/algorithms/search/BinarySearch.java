package org.sid.app.algorithms.search;

/**
 * Binary search algorithm implementation
 *
 * @author siddesh
 * @since 17/Jan/2020
 */
public class BinarySearch {

    private static boolean binarSearch(int begin, int end, int key, int[] arr) {

        if (end >= begin) {
            int mid = (begin + end) / 2;
            if (arr[mid] == key)
                return true;
            else if (key > arr[mid]) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }

            return binarSearch(begin, end, key, arr);
        } else
            return false;
    }

    public static void main(String[] args) {

        int[] array = {12, 34, 45, 56, 67, 69, 109, 118, 1234};
        int size = array.length - 1;
        boolean flag = binarSearch(0, size, 34, array);
        if (flag)
            System.out.printf("key found");
        else
            System.out.printf("key not found");
    }
}
