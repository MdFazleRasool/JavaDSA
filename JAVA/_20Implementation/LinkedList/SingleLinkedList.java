package JAVA._20Implementation.LinkedList;

class node {
    node next;
    int val;
    node(int val){
        this.val = val;
    }
}

class SLL{
    private node head;
    private int size=0;
    public  void insert_At_head(int val){
        node temp = new node(val);
        temp.next=head;
        head=temp;
        size++;
    }
    public void insert_At_end(int val){
        node temp = new node(val);
        size++;
        if(head == null){
            head=temp;
            return;
        }
        node t = head;
        while(t.next != null){
            t=t.next;
        }
        t.next=temp;

    }
    public void display(){
        if(head == null) {
            System.out.println("Empty linked list");
            return;
        }
        node t = head;
        while(t != null){
            System.out.print(t.val + " ");
            t=t.next;
        }
        System.out.println();
    }

    public void insert_At_Index(int val , int index){
        if(index>size || index < 0) {
            System.out.println("Invalid Index");
            return ;
        }

        if(index == 0) {
            insert_At_head(val);
            return;
        }
        if(index == size) {
            insert_At_end(val);
            return;
        }
        node temp = new node(val);
        node t = head;
        for(int i=0;i<index-1;i++){
            t=t.next;
        }
        temp.next=t.next;
        t.next=temp;
        size++;
    }
    public void size(){
        System.out.println("size :- " + size);
    }
    public void deleteAtHead(){
        if(head == null) {
            size=0;
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteAtEnd(){
        if(head == null || head.next == null){
            head=null;
            size=0;
            return ;
        }
        node t = head;
        while(t.next.next != null){
            t=t.next;
        }
        t.next=null;
        size--;
    }
    public void deleteAtIndex(int idx){
        if(idx>=size || idx < 0) {
            System.out.println("Invalid Index");
            return;
        }
        if(head == null) {
            System.out.println("Empty linked list");
            return;
        }
        if(idx == 0) {
            deleteAtHead();
            return;
        }

        node t = head;
        for(int i=0;i<idx-1;i++){

            t=t.next;
        }
        t.next=t.next.next;
        size--;
    }
    public void get(int idx){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(idx< 0 || idx > size-1){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0) {
            System.out.println(" value at  index "+idx +"is :- " + head.val);
            return;
        }
        node t = head;
        for(int i=0;i<idx;i++){

            t=t.next;
        }
        System.out.println(  " value at  index "+idx +"is :- " + t.val);
    }
    public void set(int val, int idx){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(idx< 0 || idx > size-1){
            System.out.println("Invalid Index ");
            return;
        }
        if(idx == 0) {
            head.val=val;
            return;
        }
        node t = head;
        for(int i=0;i<idx;i++){
            t=t.next;
        }
        t.val=val;
    }
}

public class SingleLinkedList {
    public static void main(String[] args) {
        SLL ob = new SLL();
        ob.insert_At_head(2);
        ob.display();
        ob.insert_At_head(1);
        ob.insert_At_end(5);
        ob.insert_At_end(8);
        ob.display();
        ob.insert_At_Index(3,2);
        ob.insert_At_Index(4,3);
        ob.display();
        ob.insert_At_Index(6,5);
        ob.display();
        ob.size();
        ob.deleteAtHead();
        ob.deleteAtEnd();
        ob.display();
        ob.size();
        ob.deleteAtIndex(2);
        ob.display();
        ob.get(0);
        ob.get(3);
        ob.display();
        ob.set(4,2);
        ob.display();
        ob.size();
        ob.set(5,3);
        ob.display();
    }
}
