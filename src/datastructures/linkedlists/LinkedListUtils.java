package datastructures.linkedlists;

import datastructures.linkedlists.classes.SinglyLinkedList;
import datastructures.linkedlists.classes.SinglyLinkedListNode;

import java.util.List;
import java.util.Stack;

public class LinkedListUtils {

    //    delete node from a given position in a linked list
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if (llist == null) return null;
        SinglyLinkedListNode head = llist;
        int currentIndex = 0;
        while(llist != null) {
            if (position == 0) {
                head = llist.next;
                break;
            }
            if (position == currentIndex + 1) {
                SinglyLinkedListNode nextItem = llist.next;
                llist.next = nextItem.next;
            }
            llist = llist.next;
            currentIndex++;
        }
        return head;
    }

    //    print items from a linked list
    public static void printLinkedList(SinglyLinkedListNode head) {
        if (head == null) return;
        System.out.println(head.data);
        printLinkedList(head.next);
    }

    //    insert a node at the head of a linked list
    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        return newNode;
    }

    //    insert a node at a specific index of a linked list
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

    static class ReverseLinkedListResponse {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode data;

        public ReverseLinkedListResponse(SinglyLinkedListNode head, SinglyLinkedListNode data) {
            this.data = data;
            this.head = head;
        }
    }

    private static ReverseLinkedListResponse createReverseLinkedList(SinglyLinkedListNode linkedlistNode, SinglyLinkedListNode llHead) {
        if (linkedlistNode.next.next == null) {
            llHead = linkedlistNode.next;
            llHead.next = linkedlistNode;
            return new ReverseLinkedListResponse(llHead, linkedlistNode);
        }
        else {
            ReverseLinkedListResponse returnedNodes = createReverseLinkedList(linkedlistNode.next, llHead);
            returnedNodes.data.next = linkedlistNode;
            return new ReverseLinkedListResponse(returnedNodes.head, linkedlistNode);
        }
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode linkedlistHead) {
        if (linkedlistHead == null) return null;
        ReverseLinkedListResponse returnedNodes = createReverseLinkedList(linkedlistHead, null);
        returnedNodes.data.next = null;
        return returnedNodes.head;
    }

    public static SinglyLinkedListNode reverseOptimized(SinglyLinkedListNode linkedlistHead) {
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = linkedlistHead;
        SinglyLinkedListNode next = null;

        while (current != null) {
            next = current.next; // Salva o próximo nó
            current.next = previous; // Reverte o ponteiro do próximo nó
            previous = current; // Move o ponteiro 'previous' para este nó
            current = next; // Move para o próximo nó na lista original
        }

        return previous; // 'previous' se tornará a nova cabeça da lista revertida
    }

    public static SinglyLinkedListNode reverseWithStack(SinglyLinkedListNode linkedlistHead) {
        Stack<Integer> dataStack = new Stack<>();

        while (linkedlistHead != null) {
            dataStack.add(linkedlistHead.data);
            linkedlistHead = linkedlistHead.next;
        }

        SinglyLinkedList newLinkedList = new SinglyLinkedList();

        while (!dataStack.isEmpty()) newLinkedList.insertNode(dataStack.pop());

        return newLinkedList.head;
    }

    // get node at reverse index
    public static int getNode(SinglyLinkedListNode linkedlistHead, int positionFromTail) {
        Stack<Integer> dataStack = new Stack<>();

        while (linkedlistHead != null) {
            dataStack.add(linkedlistHead.data);
            linkedlistHead = linkedlistHead.next;
        }

        int index = 0;
        while (!dataStack.isEmpty()) {
            Integer currentNumber = dataStack.pop();
            if (positionFromTail == index) return currentNumber;
            index++;
        }

        return -999;
    }

}
