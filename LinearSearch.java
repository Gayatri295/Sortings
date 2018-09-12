package Assignment1;

public class LinearSearch {
	public static int linearSearch(int[]a,int b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,54,7,99};
		int ans=linearSearch(a,9);
		System.out.println(ans);

	}

}
