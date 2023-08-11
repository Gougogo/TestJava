package com.goumi.collection_;

import java.util.LinkedList;

/**
 * @version 1.0
 * @auther GouMi
 */
public class LinkedList_ {
    public static void main(String[] args) {
        LinkedList<Object> objects = new LinkedList<>();
        objects.add(1);
        Object first1 = objects.getFirst();
        objects.get(1);

        objects.add(2);
        objects.add(3);


        Node node1 = new Node("zhangsan");
        Node node2 = new Node("lisi");
        Node node3 = new Node("wangwu");

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        node1.pre = null;
        node2.pre = node1;
        node3.pre = node2;

        Node first = node1;
        Node last = node3;


        while(first != null) {
            System.out.println(first.toString());
            first = first.next;
        }

        first = node1;

        while(first != null) {
            System.out.println(first.toString());
            first = first.next;
        }

        while (last != null){
            System.out.println(last.toString());
            last = last.pre;
        }


    }

    private static class Node{
        public String name;
        public Node pre;
        public Node next;

        public Node(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Node=" + name;
        }
    }

}
