package selfPractice;

public class MissingNoFromArray {

	public static void main(String[] args) {

		int[] a= {100,101,102,103,105};
		int sum=0,sum1=0;
		System.out.println(a[0]);
System.out.println(a[a.length-1]);
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		for(int j=100;j<=105;j++)
		{
			sum1=sum1+j;
		}
	System.out.println(sum1);
	System.out.println(sum1-sum);
	}

}
