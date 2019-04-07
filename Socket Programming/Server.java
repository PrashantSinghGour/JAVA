import java.io.*;
import java.net.*;

class Server
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader BR;
        DataInputStream DI;
        DataOutputStream DO;
		boolean Flag=true;

        BR=new BufferedReader(new InputStreamReader(System.in));

        ServerSocket ss=new ServerSocket(777);	//passing port Number as 777 it can be anything
												// avoid 13,21,23,25,67,80,109 as port number as they are used by our System.
												
        Socket s=ss.accept();	//Make Server wait till Client is ready for Connection.
		
        DI=new DataInputStream(s.getInputStream());
        DO=new DataOutputStream(s.getOutputStream());

        String str1="",str2="";

        while(!str1.equals("End"))
        {	
	
			if(Flag==true)
			{
				System.out.println("Server Ready!!");
				Flag=false;
			}
			
            str1=DI.readUTF();		//reading from Client
            System.out.println("Client: "+str1);
            str2=BR.readLine();
            DO.writeUTF(str2);		//Writing to Client
            DO.flush();
        }
        DI.close();	//Close DataInputStream	
		
        DO.close();	//Close DataOutputStream
		
        ss.close();	//Close ServerSocket
    }
}