package edu.northeastern.fxmy;

public class LinkList {

    private Node head;
    private Node tail;
    int size;
    private Object object;

    public LinkList(){
        head = null;
        tail = null;
        size = 0;
    }
    public void addAtPosition(int index, int element){

        synchronized(object) {
            if(size==0) {
                head=new Node(element);
                tail=head;
                size++;
                return;
            }

            if(index < 0 ){
                return ;
            }

            Node front = head;
            Node back = head;

            for(int i = 0 ; i < index -2; i ++){
                if(front != null){
                    front = front.next;
                }
                else{
                    return ;
                }
            }

            Node elementNumber = new Node(element);
            if(front == null){
                tail.next = elementNumber;
                tail = elementNumber;
            }else {
                elementNumber.next = front.next;
                front.next = elementNumber;
            }
            size++;
            return;
        }
    }

    public void removeAtPosition(int index, int element){
        synchronized(object) {
            if(index <= 0 ){
                return ;
            }

            if(index == 1){
                head = head.next;
                size--;
            }
            Node front = head;
            Node back = head;

            for(int i = 0 ; i < index -2; i ++){
                if(front.next != null){
                    front = front.next;
                }
                else{
                    return ;
                }
            }

            if(front.next == tail){
                front.next = null;
                tail = front;
            }else{
                front.next = front.next.next;
            }
            size--;
            return;
        }

    }
    public int getFirst() {

        return head.data;
    }

    public int getLast() {

        return tail.data;
    }

    public int size(){
        return size;
    }
}
