package org.sid.app.datastructure.linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLInkedListImpl {

    Node head;

    //it adds a new node to the end of the linked list
    protected void addNewNodeToEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            if (temp.next == null) {
                temp.next = node;
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }
    }

    //Adds a new node to front of the list
    protected void addNewNodeToFront(int data) {
        Node node = new Node(data);
        if (head != null) {
            node.next = head;
            head = node;
        } else {
            head = node;
        }
    }

    // it adds a new node to a given position
    protected void addNewNodeToGivenLocation(int location, int data) {
        Node node = new Node(data);
        Node temp;
        int count = 1;
        if (location == 1) {
            if (head != null) {
                node.next = head;
                head = node;
            } else {
                head = node;
            }
        } else if (location > 1) {
            if (head != null) {
                temp = head;
                while (temp.next != null) {
                    count++;
                    if (location == count) {
                        node.next = temp.next;
                        temp.next = node;
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
                if (location == (count + 1)) {
                    temp.next = node;
                } else {
                    System.out.println("can't add the node to given position");
                }
            } else {
                System.out.println("list empty can't add the node to given position");
            }
        } else {
            System.out.println("not able to insert to given location");
        }
    }

    //it deletes first node of the linked list
    protected void deleteFirstNode() {
        Node temp;
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                temp = head.next;
                head.next = null;
                head = temp;
            }
        } else {
            System.out.println("list is empty");
        }
    }

    //it deletes the last node from linked list
    protected void deleteLastNode() {
        Node temp;
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                temp = head.next;
                if (temp.next == null) {
                    head.next = null;
                } else {
                    while (temp.next.next != null) {
                        temp = temp.next;
                    }
                    temp.next = null;
                }
            }
        } else {
            System.out.println("list is empty");
        }

    }

    //it deletes the node from given postion
    protected void deleteNodeFromGivenPos(int pos) {
        Node temp;
        if (head != null) {
            if (pos == 1) {
                if (head.next == null) {
                    head = null;
                } else {
                    temp = head.next;
                    head.next = null;
                    head = temp;
                }
            } else if (pos > 1) {
                temp = head.next;
                int count = 1;
                while (temp.next != null) {
                    count++;
                    if (count == pos) {
                        temp.next = temp.next.next;
                        break;
                    }
                }
            } else {
                System.out.println("Can't delete the node");
            }
        } else {
            System.out.println("list is empty");
        }

    }

    //displays the list
    protected void printLinkedList() {
        if (head != null) {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        } else {
            System.out.println("list is empty");
        }
    }
}

public class SinglyLInkedList {
    public static void main(String[] args) {

        SinglyLInkedListImpl list = new SinglyLInkedListImpl();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter option : ");
            System.out.println("1 - add new node to end of the list");
            System.out.println("2 - add new node to front of the list");
            System.out.println("3 - add new node to specified position");
            System.out.println("4 - delete first node");
            System.out.println("5 - delete last node");
            System.out.println("6 - delete the node from given position");
            System.out.println("p - print the list");
            System.out.println("e - exit");
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    list.addNewNodeToEnd(scan.nextInt());
                    break;
                case "2":
                    list.addNewNodeToFront(scan.nextInt());
                    break;
                case "3":
                    list.addNewNodeToGivenLocation(scan.nextInt(), scan.nextInt());
                    break;
                case "4":
                    list.deleteFirstNode();
                    break;
                case "5":
                    list.deleteLastNode();
                    break;
                case "6":
                    list.deleteNodeFromGivenPos(scan.nextInt());
                    break;
                case "p":
                    list.printLinkedList();
                    break;
                case "e":
                    System.exit(0);
                    break;
            }
        }
    }
}
