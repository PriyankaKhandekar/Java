
package Programs;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=153, num= a;
		int total=0 ;
		while(num>0)
		{
			int num1 = num%10;
			total = total + num1*num1*num1;
			num=num/10;
		}if(total==a)
		{
			System.out.println("Armstrong no.");
		}
		
		

	}

}
