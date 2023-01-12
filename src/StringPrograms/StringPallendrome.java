package StringPrograms;

public class StringPallendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "aazaa", b=a;
		String rev = " ";
		for(int i=(a.length()-1); i>=0; i--)
		{
			rev = rev + a.charAt(i);
		}System.out.println(rev);
		if(a .equals(rev))
		{
			System.out.println("string is pallendrome");
		}else {
			System.out.println("string is not pallendrome");
		}
	}

}
