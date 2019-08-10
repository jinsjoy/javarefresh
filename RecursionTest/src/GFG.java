
// A Java program to demonstrate working of 
// recursion 
class GFG{ 
static int printFun(int n, int a) 
{ 
    if (n == 0) 
        return a; 
    else
    { 
       return printFun((n-1), (n * a));
    } 
} 
  
public static void main(String[] args) 
{ 
    int test = 3; 
    System.out.println(printFun(3,1)); 
} 
} 
  
// This code is contributed by  
// Smitha Dinesh Semwal 