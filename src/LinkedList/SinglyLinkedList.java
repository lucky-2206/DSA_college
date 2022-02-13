package LinkedList;

import java.util.Scanner;

class  Node
{
    int data;
    Node next;
    public Node()
    {
        data=0;
        next=null;
    }
    public Node(int data)
    {
        this.data=data;
        next=null;
    }
}

public class SinglyLinkedList {

    static Node head;

    public static int size()
    {
        Node temp = head;
        int s=0;
        if(temp==null)
            return 0;
        else
        {
            while(temp != null)
            {
                temp = temp.next;
                s++;
            }
            return s;
        }
    }
    public static void insertAtBegining(int val)
    {
        Node newnode = new Node (val);
        if(head == null)
            head = newnode;
        else
        {
            newnode.next= head;
            head = newnode;
        }
    }
    public static void insertAtEnd(int val)
    {
        Node newnode = new Node (val);
        if(head == null)
            head = newnode;
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newnode;
        }
    }
    public static void insertAtPos(int val,int pos)
    {
        Node newnode = new Node (val);
        if(pos<1)
            System.out.println("Invalid position");
        else if(pos>size())
        insertAtEnd(val);
        else if(pos==1) {
            newnode.next = head;
            head = newnode;
        }
        else
        {
            Node temp =head;
            for(int i=1;i<pos-1;i++)
                temp = temp.next;

            newnode.next= temp.next;
            temp.next = newnode;
        }
    }

    public static void deleteAtBegining()
    {
        if(head == null)
            System.out.println("Empty Linked List");
        else
            head = head.next;
    }

    public static void deleteAtEnd()
    {
        if(head == null)
            System.out.println("Empty Linked List");
        else
        {
            Node temp = head;
            while(temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
    }

    public static void deleteAtPos(int pos)
    {
        if(pos<1||pos>size())
            System.out.println("Invalid position");
        else if(pos==1)
            head = head.next;
        else
        {
            Node temp =head;
            Node temp2 = head;
            temp2= temp2.next;
            for(int i=1;i<pos-1;i++) {
                temp = temp.next;
                temp2 = temp2.next;
            }
            temp.next = temp2.next;
        }
    }
    public static int search(int val)
    {
        Node temp = head;
        int pos=1;
        while(temp !=null)
        {
            if(temp.data==val)
                return pos;
            temp = temp.next;
            pos++;
        }
        return 0;

    }
    public static void displayLinkedList()
    {
        Node temp = head;
        if(head==null)
            System.out.println("Empty Linked list");
        else {
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Press <1> for inserting a value in linked list");
            System.out.println("Press <2> for deleting a value in linked list");
            System.out.println("Press <3> for searching a value in linked list");
            System.out.println("Press <4> for displaying values in linked list");
            System.out.println("Press <5> for exit");

            int ch;
            int c,val,pos;
            try
            {
                ch = sc.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.println("Press <1> for adding the value at start");
                        System.out.println("Press <2> for adding the value at the end");
                        System.out.println("Press <3> for adding the value at specific position");
                        try
                        {
                            c = sc.nextInt();
                            switch (c)
                            {
                                case 1:
                                    System.out.println("Enter value to be added");
                                    val = sc.nextInt();
                                    insertAtBegining(val);
                                    break;
                                case 2:
                                    System.out.println("Enter value to be added");
                                    val = sc.nextInt();
                                    insertAtEnd(val);
                                    break;
                                case 3:
                                    System.out.println("Enter value to be added");
                                    val = sc.nextInt();
                                    System.out.println("Enter the position");
                                    pos = sc.nextInt();
                                    insertAtPos(val,pos);
                                    break;
                                default:
                                    System.out.println("Incorrect option");

                            }

                        }
                        catch (Exception e) {
                            System.out.println(e);
                        }
                        System.out.println("Current Linked list");
                        displayLinkedList();
                        break;
                    case 2:
                        System.out.println("Press <1> for deleting the value at start");
                        System.out.println("Press <2> for deleting the value at the end");
                        System.out.println("Press <3> for deleting the value at specific position");
                        try
                        {
                            c = sc.nextInt();
                            switch (c)
                            {
                                case 1:
                                    deleteAtBegining();
                                    break;
                                case 2:
                                    deleteAtEnd();
                                    break;
                                case 3:
                                    System.out.println("Enter the position");
                                    pos = sc.nextInt();
                                    deleteAtPos(pos);
                                    break;
                                default:
                                    System.out.println("Incorrect option");

                            }

                        }
                        catch (Exception e) {
                            System.out.println(e);
                        }
                        System.out.println("Current Linked list");
                        displayLinkedList();
                        break;
                    case 3:
                        System.out.println("Enter value to be searched");
                        try
                        {
                            val = sc.nextInt();
                            int xe = search(val);
                            if(xe>0)
                                System.out.println("Value existed in linked list at pos ="+xe);
                            else
                                System.out.println("Value doesn't exist in linked list");
                        }
                        catch(Exception e)
                        {
                            System.out.println(e);
                        }
                        break;
                    case 4: displayLinkedList();
                    break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong choice");
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }

    }

}
