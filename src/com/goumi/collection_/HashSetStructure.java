package com.goumi.collection_;

import java.util.HashMap;

/**
 * @version 1.0
 * @auther GouMi
 */
public class HashSetStructure {
    public static void main(String[] args) {
        Node[] table = new Node[10];
        Node node1 = new Node("a", null);
        table[2] = node1;

        Node node2 = new Node("b", null);
        node1.next = node2;

        Node node3 = new Node("c", null);
        node2.next = node3;

        System.out.println(table);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    }
}

class Node{
    String name;
    Node next;

    public Node(String name, Node next) {
        this.name = name;
        this.next = next;
    }
}
