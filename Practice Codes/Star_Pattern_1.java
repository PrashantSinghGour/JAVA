////////////////////////////////////////////////////////////////////////////////
//  This code will print a pattern like:                                      //  
//  Input:3                                                                   // 
//  Output: * * *                                                             //    
//           * *                                                              //
//            *                                                               //
////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Count: ");
        int Count=sc.nextInt();
        for(int i=0;i<Count;i++) //Iterates Row
        {
          if(i>0)
              {
                int itr=i;
                  while(itr>0)
                  {
                    System.out.print(" "); //to print the blank space before " * "
                    --itr;
                  }
              }
            for(int j=0;j<Count-i;j++) //Iterates Coloumn
            {
               System.out.print("*");
               System.out.print(" ");
            }
            System.out.println(""); //to Bring Cursor to new Line
        }
       
    }
}