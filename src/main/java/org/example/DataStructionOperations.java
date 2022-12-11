package org.example;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class DataStructionOperations {

    //check the linked list is looped or not
    static boolean isLooped(LinkedList list){
        Node slow = list.head;
        Node fast = list.getFirst();
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
