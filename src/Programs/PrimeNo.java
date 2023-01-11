package Programs;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=77;
		int count=0;
		for(int i=2; i<=a-1; i++)
		{
			if(a%i == 0)
			{
				count++;
			}
			
		}if(count==0)
		{
			System.out.println("prime no.");
		}else {
			System.out.println("Not prime No.");
		}

	}

}
