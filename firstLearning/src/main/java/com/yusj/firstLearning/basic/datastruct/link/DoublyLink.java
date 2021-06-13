package com.yusj.firstLearning.basic.datastruct.link;

public class DoublyLink {
    private class Node{
        public Object data;
        public Node next;
        public Node pre;

        public Node(){}
        public Node(Object data){
            this.data = data;
        }
    }

    private int size = 0;
    private Node head;

    public DoublyLink(){
        head = new Node();
        head.next = null;
    }

    public boolean isEmpty(){
        return head.next == null;
    }

    public void addNode(Object data){
        Node nowNode = new Node(data);
        Node rNode = head;
        if (this.isEmpty()){
            head.next = nowNode;
            nowNode.pre = head;
        }else{
            while (rNode.next != null){
                rNode = rNode.next;
            }
            rNode.next = nowNode;
            nowNode.pre = rNode;
        }
    }

    public void removeNode(){
    }
}
