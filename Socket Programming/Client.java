import java.net.*;
import java.io.*;

class Client
{
    public static void main(String arg[]) throws IOException
    {
        BufferedReader BR;
        DataInputStream DI;
        DataOutputStream DO;
		boolean Flag=true;

        BR=new BufferedReader(new InputStreamReader(System.in));

        Socket s=new Socket("localhost",777);		//passing socket localhost instead of ip address as i'm same device and port number of Server
													// You can pass IP address if you are working with diffrent device
        DI=new DataInputStream(s.getInputStream());
        DO=new DataOutputStream(s.getOutputStream());

        String str1="",str2="";

        while(!str1.equals("End"))
        {
			if(Flag==true)
			{
				System.out.println("Client Ready!!");
				Flag=false;
			}
			
            str1=BR.readLine();		
            DO.writeUTF(str1);	//Writing to server
            DO.flush();
            str2=DI.readUTF();	//Reading from Server
            System.out.println("Server: "+str2);
        }
        DI.close();	//DataInputStream Close
		
        DO.close();	//DataOutputStream Close
		
        BR.close(); //BufferedReader Close
		
        s.close(); //Socket Close
    }
}