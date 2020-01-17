package org.sid.app.algorithms.search;


import java.util.Scanner;

/**
 * linear search algorithm
 *
 * @author siddesh
 * @since 16/jan/2020
 */
public class LinearSearch {
    public static void main(String[] args) {

        /*initialize array with user input*/
        System.out.println("size of array ?");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("what are " + size + " elements ?");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("search key ?");
        int searchKey = scanner.nextInt();

        // initialize array with some default elements

        /*int[] array = {12, 13, 37, 89, 110, 2736, 987, 8765, 90, 37};
        int size = array.length;
        int searchKey = 987;*/

        boolean foundflag = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchKey) {
                foundflag = true;
                break;
            }
        }

        if (foundflag)
            System.out.println("key found");
        else
            System.out.println("key not found");
    }
}