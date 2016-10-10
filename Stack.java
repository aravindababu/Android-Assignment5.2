/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPack;

/**
 *
 * @author user2
 */
interface Stack {

    /**
     * @param args the command line arguments
     */
    void push(int item); // store an item 
    int pop(); // retrieve an item 

    public static void main(String[] args) {
        // TODO code application logic here
        FixedStack F1 = new FixedStack(5); 

// push some numbers onto the stack 
    for(int i=0; i<6; i++) 
    F1.push(i); 
// pop those numbers off the stack 
    System.out.println("Stack elements are"); 
    for(int i=0; i<8; i++) 
    System.out.println(F1.pop());  
    //Adding Elements in the Variable Stack and printing out the values
    VariableStack V1 = new VariableStack(10);
    V1.push(6);
    V1.push(7);
    V1.push(9);
    V1.push(10);
    V1.push(11);
    V1.push(12);
    V1.push(13);
    V1.pop();
   
    } 
}
// An implementation of IntStack that uses fixed storage. 
class FixedStack implements Stack { 
    //Declaring StackArray
       private int stack[]; 
       //Declaring an integer top which is nothing but top of the stack
       //Since elements are either added or removed from top of the stack
       private int top; 
//Creating a constructor to define the size of the stack
       FixedStack(int size) { 
       stack = new int[size]; 
       top = -1; 
} 
// Push an item onto the stack 
         public void push(int i) { 
            if(top==stack.length-1) // use length member 
            System.out.println("Stack is full."); 
        else 
            stack[++top] = i; 
        } 
        // Pop an item from the stack == remove an item from the stack
         public int pop() { 
            if(top < 0) { 
                //Printing stack is underFlow when top of the stack is less than 0
            System.out.println("Stack underflow."); 
         return 0; 
       } 
         else 
         return stack[top--]; 
} 
} 

class VariableStack implements Stack{
    
       private int stack[]; 
       private int top; 
       private int stackSize;
// allocate and initialize stack 
       VariableStack(int size) { 
           stackSize=size;
       stack = new int[size]; 
       top = -1; 
} 
    @Override
    public void push(int i) {
        if(top+1<stackSize){
            top++;
            stack[top]=i;
          //Adding an element to the stack  
        System.out.println("PUSH " +i+ " was added to the stack");
            
        }
    }

    @Override
    public int pop() {
        //When top of the Stack is greater or equal to stack
        if(top >= 0){
            //Removing the element of the stack and printing which element removed from stack
            System.out.println("POP " +stack[top]+ " Was removed from the stack");
            
            stack[top--]=-1;
        }
            return stack[top--];
        }
    }
    
  

 
    

