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

//pattern2

1	
2	6	
3	7	10	
4	8	11	13	
5	9	12	14	15	

//logic
public static void main(String arg[])
	{
		int diff;
		int n;
		for (int i=1;i<=5;i++)
		{
			diff=5;
			n=i;
			for(int j=1;j<=i;j++)
			{
				diff--;
				System.out.print(n);
				System.out.print("\t");
				n+=diff;	
			}
			System.out.println("");
		}
	}


