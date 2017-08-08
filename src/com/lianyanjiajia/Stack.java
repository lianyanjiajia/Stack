package com.lianyanjiajia;

import java.util.Scanner;

public class Stack {
    class Node
    {
        public  int data;
        public Node next;
        public Node()
        {
            next=null;
        }
    }
    public Node top;
    public Stack()
    {
        top=null;
    }
    public void push(int e)
    {
        Node newnode=new Node();
        newnode.data=e;
        newnode.next=top;
        top=newnode;
    }
    public int pop()
    {
        if(isEmpty())
            return -1;
       int e=top.data;
       top=top.next;
       return e;

    }
    public int getlength()
    {
        int len=0;
        Node p=top;
        while (p!=null)
        {
            len++;
            p=p.next;
        }
        return len;
    }
    public boolean isEmpty()
    {
        return top==null?true:false;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        System.out.println("请输入栈的长度");
        int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           System.out.println("请输入数据");
           s.push(sc.nextInt());
       }
        System.out.println(s.getlength());
        for(int i=0;i<n;i++)
            System.out.println(s.pop());
        System.out.println(s.getlength());


    }
}
