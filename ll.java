class ll{
    Node  head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    
 }
 // add-first
 public void addFirst(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
 }
 //add last
 public void addLast(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node currNode=head;
    while  (currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newNode;
 }
 public void printList(){
    Node currNode=head;
    if(head==null){
        System.out.println("List is Empty");
        return;
    }
    while  (currNode!=null){
        System.out.println(currNode.data+"->");
        currNode=currNode.next;
    }
    System.out.println("Null");

 }
 public void deleteFirst(){
    if(head==null){
        System.out.println("List is Empty");
        return;
    }
    head=head.next;

 }
 public void deleteLast(){
    if(head==null){
        System.out.println("List is Empty");
        return;
    }
    if(head.next==null){
        head=null;
        return;
    }
        Node secondLast=head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;

        }
        secondLast.next=null;
    

 }

 public static void main(String []args){
    ll list = new ll();
    list.addFirst(5);
    list.addFirst(10);
    list.addLast(6);
    list.printList();
    list.deleteFirst();
    list.deleteLast();



 }

}