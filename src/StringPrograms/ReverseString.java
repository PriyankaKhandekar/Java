package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "priya vicky" , rWord=" ";
		
		for(int i=(a.length()-1); i>=0; i--)
		{
			rWord = rWord + a.charAt(i);
		}System.out.println(rWord);
		
		StringBuffer buf = new StringBuffer(a);
		//StringBuffer rev = ;
		System.out.println(buf.reverse());
		

	}

}
