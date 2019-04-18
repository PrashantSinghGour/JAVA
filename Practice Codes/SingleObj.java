/////////////////////////////////////////////////////////////////////////////////////////
//	Implementation of Two Thread working on Same object so to avoid absurd output used //
//  Synchronized keyword.                                                              //
//  Date:18-04-2019 Time:21:58                                                         //
///////////////////////////////////////////////////////////////////////////////////////// 

class Myclass implements Runnable{
	int Avail=1; //Considering Available Seat as 1
	int Req;
	
	public Myclass(int Req) {
		this.Req=Req; //Accepting Required birth at Runtime
		
	}
	
	synchronized public void run() //Synchronize the current object
	{
		System.out.println("Available :"+Avail);
		
		if(Avail>=Req)
		{
			String str=Thread.currentThread().getName(); //get the name for passenger
			System.out.println("Seat Reserved for :"+str);
			try {
				Thread.sleep(2000); //wait for printing the ticket
				Avail-=Req; //reduce the Available seats
			} catch (InterruptedException e) // As Sleep method thows InterruptedException
			{
				e.printStackTrace();
			}
		}
		else //When No seat Available
		{
			System.out.println("Sorry Seat Not Available");
		}
	}
}
class SingleObj{
public static void main(String arg[])
{
	Myclass obj=new Myclass(1); //Passing Required Seats
	
	Thread t1=new Thread(obj); //Attaching 1st thread to the Object 
	Thread t2=new Thread(obj); //Attaching 2nd thread to the Object 
	
	//take thread name as passenger
 t1.setName("Passenger 1"); 
 t2.setName("Passenger 2");
 
 //send the request for seats
 t1.start();
 t2.start();
			
}
}