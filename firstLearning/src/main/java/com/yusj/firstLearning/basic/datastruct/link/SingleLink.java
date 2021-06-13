package com.yusj.firstLearning.basic.datastruct.link;

public class SingleLink {
    private class Node{
        public Object data;
        public Node next;

        public Node(){}
        public Node(Object data){
            this.data = data;
        }
    }

    private int size;
    private Node head;

    public SingleLink(){
        head = new Node();
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //在位置index处新增节点
    public void add(int index,Object e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Add failed.Index illegal");
        }
        Node rNode = head;
        Node node = new Node(e);
        for (int i = 0;i < index;i++){
            rNode = rNode.next;
        }
        node.next = rNode.next;
        rNode.next = node;
        size++;
    }

    //在位置index处移除节点
    public void remove(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Remove failed.Index illegal");
        }
        Node rNode = head;
        for(int i = 0;i < index;i++){
            rNode = rNode.next;
        }
        Node node = rNode.next;
        rNode.next = rNode.next.next;
        node.next = null;
        size--;
    }
}
