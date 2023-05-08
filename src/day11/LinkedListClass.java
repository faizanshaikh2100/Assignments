package day11;

public class LinkedListClass {

    Node head;
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            next = null;
        }

    }
    //add last
        public void addLast(int value){
        if(this.head==null){
            this.head = new Node(value);
            return;
        }
                Node curr = this.head;
                while (curr.next!= null){
                    curr = curr.next;
                }
                curr.next = new Node(value);
        }
        //add First
        public void addFirst(int value){
              Node newNode  = new Node(value);
              newNode.next = this.head;
        }

        //add middle
        public void addMiddle(int value){
        Node fast = head;
        Node slow = head;
        Node newNode = new Node(value);

        while(fast.next!=null || fast.next.next!= null){
            fast = fast.next.next;
            slow  = slow .next;
        }
        Node store  = slow.next;
        slow.next = newNode;
        newNode.next = store;

    }

    //add at index
    public void addAtIndex(int index,int value){
        Node curr = this.head;
        while(curr!= null && index-1> 0){
            curr = curr.next;
            index--;
        }
        Node newNode = new Node(value);
        Node store  = curr.next;
        curr.next = newNode;
        newNode.next = store;
    }

    //delete beg
    public void deleteFirst(){
        if(this.head!= null)
            this.head = this.head.next;
    }

    //delte end
    public void deleteLast(){
        Node curr = this.head;
        while(curr.next!=null){
            curr= curr.next;
        }
        curr.next =null;
    }

    //delete index
    public void deleteIndex(int index){
        Node curr = this.head;
        while(curr!= null && index-1> 0){
            curr = curr.next;
            index--;
        }
        curr.next= curr.next.next;
    }

    public void print(){
        Node curr = this.head;
        while (curr!=null){
            System.out.println(curr.val+"->");
            curr = curr.next;
        }
    }
    public int search(int val){
       Node curr = this.head;

       int i=0;
       while(curr!=null){
           if(curr.val ==val){
               return i;
           }
           curr= curr.next;
           i++;
       }
       return -1;
    }


    //sort the elements
    public void sort(){
        Node curr  = this.head;
        Node curr2;

        while(curr!= null){
            curr2 = curr.next;
            while(curr2!=null){
                if(curr.val>curr2.val){
                    int temp = curr.val;
                    curr.val = curr2.val;
                    curr2.val = temp;
                }
                curr2 =curr2.next;
            }
            curr =curr.next;
        }

    }
    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();

        ll.addLast(1);
        ll.addLast(10);
        ll.addLast(3);
        ll.addLast(15);
        ll.addLast(5);

        ll.sort();

        while (ll.head!=null){
            System.out.println(ll.head.val+" ");
            ll.head = ll.head.next;
        }
    }
}
