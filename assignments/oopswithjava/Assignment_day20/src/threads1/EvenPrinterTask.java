package threads1;

public class EvenPrinterTask extends Thread
{
	private int start;
	private int end;
	public EvenPrinterTask(String name, int start, int end)
	{
		super(name);
		this.start=start;
		this.end=end;
	}
	@Override
	public void run() 
	{
		try {
			for(int i = this.start ; i <+ this.end ; i++ )
			{
				if(i%2==0)
				{
					System.out.println(getName()+" Even value "+i);
					Thread.sleep(1200);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error occured in "+getName()+e);
		}
		System.out.println("Thread "+getName()+"over...");
	}
}
