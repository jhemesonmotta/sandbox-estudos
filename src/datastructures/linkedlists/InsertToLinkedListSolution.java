package datastructures.linkedlists;

import java.io.*;
import java.util.stream.*;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result {

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode linkedlistHead, int dataToInsert, int positionToInsert) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(dataToInsert);

        if (positionToInsert == 0) {
            newNode.next = linkedlistHead;
            return newNode;
        } else {
            int index = 0;
            SinglyLinkedListNode linkedlistNode = linkedlistHead;

            while (linkedlistNode != null) {
                if (index + 1 == positionToInsert) {
                    newNode.next = linkedlistNode.next;
                    linkedlistNode.next = newNode;
                    break;
                } else {
                    linkedlistNode = linkedlistNode.next;
                    index++;
                }
            }

            return linkedlistHead;
        }

    }

}

public class InsertToLinkedListSolution {
    public static void main(String[] args) throws IOException {

    }
}
