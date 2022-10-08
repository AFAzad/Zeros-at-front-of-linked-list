/*
Problem Statement
Given a linked list, the task is to move all 0’s to the front of the linked list. The order of all another element except 0 should be same after rearrangement.

Note: Avoid use of any type of Java Collection frameworks.

Note: For custom input/output, enter the list in reverse order, and the output will also be in reverse order.
*/

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
{
    List<Integer> list=new ArrayList<Integer>();
    int count=0;
    Node temp=head;
    while(temp!=null){
        if(temp.data==0){
            count++;
        }
        else{
            list.add(temp.data);
        }
        temp=temp.next;
    }
    temp=head;
    while(count>0){
        temp.data=0;
        temp=temp.next;
        count--;
    }
    int index=0;
    while(temp!=null){
        temp.data=list.get(index);
        index++;
        temp=temp.next;
    }
    return head;
}