package p1;

public class Excep

{
	
	public void err()
	{
		

			
		int a=10/0;
		
		}
		
		catch(Exception q) //catch exception
		{
			
			System.out.println(q);
			System.out.println("Exception Handilled");
		}
		
	}

	public static void main(String[] args)
	
	{
	Excep ob=new Excep();
	ob.err();
	System.out.println("rest of the code");

	}

}
