////////////////////////////////////////////////////////////////////////////
// This Code will print the all possible 3 multiples simultaneously.      //
// for example-                                                           //
//  input-8                                                               //
//  output-2 x 2 x 2 =8                                                  //
////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

class ThreeMultiple
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Whoes 3 Multiple You want to find: ");
        int Number=sc.nextInt();
        int i=1,j=1,k=1;
        while(i<=Number)
        {
            while(j<=Number)
            {
                while(k<=Number)
                {
                    if((i*j*k)==Number)
                    {
                        System.out.println(i+" x "+j+" x "+k+" = "+Number);
                    }
                    k++;
                }
                k=j+1;
                j++;
            }
            j=i;
            i++;
           
        }
      sc.close();
    }
}
