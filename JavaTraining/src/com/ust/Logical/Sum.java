package com.ust.Logical;

public class Sum {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,1};
		int i=0;
		for( i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[i]+a[j];
					System.out.println(a[j]);
					
				}
				
			}
		}
		

	}

}
