
public class ICS4U {
	public static void starString(double x){
		if (x==0)
		{			
			System.out.println("*");
			return;
		}
		else{
			starString(x-1);



			for (int i=0;i<Math.pow(2, x);i++)
				System.out.print("*");
			

		}



	}
	
}
