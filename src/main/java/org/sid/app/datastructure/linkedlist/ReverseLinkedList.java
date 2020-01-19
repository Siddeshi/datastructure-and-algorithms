package org.sid.app.datastructure.linkedlist;

import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        SinglyLInkedListImpl list = new SinglyLInkedListImpl();
        System.out.println("Enter list elements");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            list.addNewNodeToEnd(scanner.nextInt());
        }
        list.printLinkedList();
        reverseList(list);
        list.printLinkedList();
    }

    protected static void reverseList(SinglyLInkedListImpl list) {
        Node tempNode1;
        Node temp;
        Node tempNode2;

        if (list.head != null) {
            if (list.head.next == null) {
                System.out.println(list.head.data);
            } else {
                temp = list.head.next;
                tempNode1 = list.head.next;
                tempNode2 = list.head;
                while (temp.next != null) {
                    tempNode1 = temp.next;
                    temp.next = tempNode2;
                    tempNode2 = temp;
                    temp = tempNode1;
                }
                temp.next = tempNode2;
                list.head.next = null;
                list.head = temp;
            }
        } else {
            System.out.println("list is empty!");
        }
    }
}
