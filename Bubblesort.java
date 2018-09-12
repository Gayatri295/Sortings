package Assignment1;

public class Bubblesort {
	public static void bubbleSort(int[]a)
	{
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}  
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}
	public static void main(String[] args) {
		int[] a= {7,3,9,1,7,3,10,8};
		 bubbleSort(a);
		
	}

}
