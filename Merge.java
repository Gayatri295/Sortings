package Assignment1;

public class Merge {
	public static int[] merging(int[]a,int[]b)
	{
		int []c=new int[a.length+b.length];
		int k=0;
			for(int i=0;i<a.length;i++)
			{
				c[k]=a[i];
				k++;
			}
			for(int j=0;j<b.length;j++)
			{
				c[k]=b[j];
				k++;
			}
			return c;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7};
		int[]c=merging(a,b);
		for(int l=0;l<c.length;l++)
		{
			System.out.print(c[l]);
		}

	}

}
