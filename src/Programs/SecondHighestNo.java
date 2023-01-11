package Programs;

import java.util.Arrays;

public class SecondHighestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,6,5,8,4,3,5,7,9};
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]<a[i+1])
			{
				int x = a[i];
				a[i]= a[i+1];
				a[i+1]=x;
				i=-1;
						
			}
		}System.out.println(Arrays.toString(a));
		System.out.println(a[1]);

	}

}
