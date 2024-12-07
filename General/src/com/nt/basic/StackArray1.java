//StackArray1.java
package com.nt.basic;

public class StackArray1 {
    private int top;
    int size;
    int[] stack ;

    public StackArray1(int arraySize){
        size=arraySize;
        stack= new int[size];
        top=-1;
    }

    public void push(int value){
        if(top==size-1){
            System.out.println("Stack is full, can't push a value");
        }
        else{

            top=top+1;
            stack[top]=value;
        }
    }

    public void pop(){
        if(!isEmpty())
            top=top-1;
        else{
            System.out.println("Can't pop...stack is empty");
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void display(){

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        StackArray1 newStack = new StackArray1(5);
        newStack.push(10);
        newStack.push(1);
        newStack.push(50);
        newStack.push(20);
        newStack.push(90);

        newStack.display();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.display();
    }
}