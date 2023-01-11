package Programs;

import java.util.Arrays;

public class ArrangeZerosLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {0,4,0,5,0,6,0,4,0};
		int left=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				int temp=a[left];
				a[left]=a[i];
				a[i]=temp;
				++left;
			}
			
		}System.out.println(Arrays.toString(a));

	}

}
