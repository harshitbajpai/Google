package DataStructures.LinkedList;

public class LinkedList {

    Node head;

    static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list=insertAtLast(list,1);
        list=insertAtLast(list,2);
        list=insertAtLast(list,3);
        list=insertAtLast(list,4);
        
        //printList(list);

        //System.out.println("");
        //list=deleteByKey(list,5);

        //printList(list);

        //print length of list
        //int count=length(list);
        //System.out.println("length of list is "+count);
        list=insertAtFirst(-1,list);
        printList(list);

        list=insertAtPosition(6,100,list);
        printList(list);
    }

    private static LinkedList insertAtFirst(int x,LinkedList list) {
        Node newNode=new Node(x);
        newNode.next=list.head;
        list.head=newNode;
        return list;
    }

    private static LinkedList insertAtPosition(int index, int data, LinkedList list) {

        Node currentNode=list.head;
        Node prev=null;

        if(index==0)
            insertAtFirst(data,list);
        else {
            for (int i = 0; i < index; i++) {
                if (currentNode != null) {
                    prev = currentNode;
                    currentNode = currentNode.next;
                } else {
                    System.out.println("list overflowed");
                    return list;
                }
            }
            Node newNode = new Node(data);
            prev.next = newNode;
            newNode.next = currentNode;
        }
        return list;
    }

    private static int length(LinkedList list) {
        int count=0;
        Node last=list.head;
        while(last!=null) {
            count++;
            last=last.next;
        }

        return count;
    }

    private static LinkedList deleteByKey(LinkedList list, int x) {
        Node currentNode=list.head;
        Node prev=null;

        if(currentNode!=null && currentNode.data==x){
            list.head=currentNode.next;
            return list;
        }
        while(currentNode!=null && currentNode.data!=x){
            prev=currentNode;
            currentNode=currentNode.next;
        }
        if(currentNode!=null)
            prev.next=currentNode.next;

        if(currentNode==null)
            System.out.println("key="+x+" Not found");
        return list;
    }

    private static void printList(LinkedList list) {
        Node last=list.head;
        while(last!=null){
            System.out.print(" "+last.data);
            last=last.next;
        }
        System.out.println("");
    }

    private static LinkedList insertAtLast(LinkedList list, int x) {
        Node newNode=new Node(x);
        newNode.next=null;
        
        if(list.head==null)
            list.head=newNode;
        else {
            Node traversal=list.head;
            while (traversal.next!=null){
                traversal=traversal.next;
            }
            traversal.next=newNode;
        }
        return list;
    }
}
