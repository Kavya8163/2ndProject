package BasicPrograms;

public class Exceptions {
	public static void main(String[] args)
	{
		try
		{
			int data = 25/5;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always execuyed");
			
		}
		System.out.println("Rest of the code");
	}
	

}
SYSTEM>OUT>PRNTLN("CHANGE THE EXCEPTION")