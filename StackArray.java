class Stack
{
  int top ;
  int maxsize = 5;
  int[] stack_array = new int(max_size);
  Stack()
  {
    // intially top is empty 
    top = -1 ;
    boolean isEmpty()
    {
      return(top<0);
    }
    boolean push(int val)
    {
      if(top == max_size-1){
        System.out.println("Overflow !!");
        return false;

      }
      else
      {
        top ++ ;
        stack_array[top]=val;
        return true ;
      }
    }
    boolean pop()
    {
      if(top == -1)
      {
        System.out.println("Stack is Underflow !!");
        return false ;

      }
      else
      {
        System.out.println("\n Item is poped "+ stack_array[top--]);
        return true ;

      }
    }
    void display()
    {
      System.out.println("Printing the stack elemets...");
      for(int i == top ; i>=0 ; i++)
      {
        System.out.println(stack_array[i] +" ")
      }
    }
  }

  public static void main(Sting args[])
  {
    Stack stak = new Stack();
    System.out.println("Intialy stack is empty :" + stcl.isEmpty());
    stck.push(10);
    stck.push(11);
    stck.push(12);
    stck.push(13);
    System.out.println('After Push Operation');
    stck.display();

    stck.pop();
    stck.pop();
    System.out.println("After Pop Operation ..");
    stck.display();
}
