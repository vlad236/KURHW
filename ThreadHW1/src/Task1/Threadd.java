package Task1;

public class Threadd extends Thread
{
	public Threadd (String name) { 
		super(name); 
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			try{
				System.out.print("\n" + super.getName() + ": ");
				for(int j = 1; j < 11; j++) {
					System.out.print((i * 10 + j) + " ");
				}
				
				sleep(500);		//Приостанавливает поток на 1 секунду
			}
			catch(InterruptedException e){}	
		}
		
	}

}
