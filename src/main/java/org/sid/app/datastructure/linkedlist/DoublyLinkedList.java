package org.sid.app.datastructure.linkedlist;

import java.util.Scanner;

class DoublyNode {
    int data;
    DoublyNode left;
    DoublyNode right;

    public DoublyNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class DoublyLinkedListImpl {

    DoublyNode head;

    private DoublyNode createDoublyNode(int data) {
        return new DoublyNode(data);
    }

    //it prints data from doubly linked list
    protected void printLinkedList() {
        DoublyNode node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.right;
        }
        System.out.println();
    }

    // adds new node to right
    protected void addNewNodeToRight(int data) {
        DoublyNode newNode = createDoublyNode(data);
        if (head != null) {
            DoublyNode temp = head;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = newNode;
            newNode.left = temp;
        } else {
            head = newNode;
        }
    }

    //adds new node to left
    protected void addNewNodeToLeft(int data) {
        DoublyNode newNode = createDoublyNode(data);
        if (head != null) {
            head.left = newNode;
            newNode.right = head;
            head = newNode;
        } else {
            head = newNode;
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListImpl linkedList = new DoublyLinkedListImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("r - add new node to right");
            System.out.println("l - add new node to left");
            System.out.println("p - print list");
            System.out.println("e - exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "l":
                    linkedList.addNewNodeToLeft(scanner.nextInt());
                    break;
                case "r":
                    linkedList.addNewNodeToRight(scanner.nextInt());
                    break;
                case "p":
                    linkedList.printLinkedList();
                    break;
                case "e":
                    System.exit(0);
                    break;
            }
        }
    }
}
