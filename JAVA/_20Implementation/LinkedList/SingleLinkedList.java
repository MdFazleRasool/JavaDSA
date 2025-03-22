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
    public  void insert_At_head(int val){
        node temp = new node(val);
        if(head == null){
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    public void insert_At_end(int val){
        node temp = new node(val);
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
        node t = head;
        while(t != null){
            System.out.print(t.val + " ");
            t=t.next;
        }
        System.out.println();
    }

    public void insert_At_Index(int val , int index){
        node temp = new node(val);
        node t = head;
        for(int i=0;i<index-1;i++){
            t=t.next;
        }
        temp.next=t.next;
        t.next=temp;
    }
    public void size(){

        node t = head;
        int count=0;
        while(t != null){
            t=t.next;
            count++;
        }
        System.out.println("size :- " + count);
    }
    public void deleteAtHead(){
        if(head == null)return ;
        head=head.next;
    }
    public void deleteAtEnd(){
        if(head == null)return ;
        node t = head;

        while(t.next.next != null){
            t=t.next;
        }
        t.next=null;
    }
    public void deleteAtIndex(int idx){
        if(head == null)return ;
        node t = head;
        for(int i=0;i<idx-1;i++){
            t=t.next;
        }
        t.next=t.next.next;
    }
    public void get(int idx){
        if(idx< 0){
            System.out.println("Invalid Index idx < 0");
            return;
        }
        if(idx == 0) {
            System.out.println(" value at  index "+idx +"is :- " + head.val);
            return;
        }
        node t = head;
        for(int i=0;i<idx;i++){
            if(t==null){
                System.out.println("Invalid Index");
                System.out.println("size of linked list is " + i);
                return;
            }
            t=t.next;
        }
        System.out.println(  " value at  index "+idx +"is :- " + t.val);
    }
    public void set(int val, int idx){
        if(idx< 0){
            System.out.println("Invalid Index idx < 0");
            return;
        }
        if(idx == 0) {
            head.val=val;
        }
        node t = head;
        for(int i=0;i<idx;i++){
            if(t==null){
                System.out.println("Invalid Index");
                System.out.println("size of linked list is " + i);
                return;
            }
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
    }
}
