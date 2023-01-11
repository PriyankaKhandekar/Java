package Programs;

public class PallendromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11211, num=a;
		int total=0;
		while(num>0)
		{
			int num1 = num%10;
			total = total*10 + num1;
			num=num/10;
		}if(total == a)
		{
			System.out.println("pallendrome no.");
		}

	}

}
