package selfPractice;

public class ReverseString {

	public static void main(String[] args) {

		String name="selenium";
		String name1="S()&%e78le9n0iu*&m We@bD~`r1i!v+e=r/";
		
		String abc[]= {"78^249!@02841","305923*%#43290","0932_3920#"};
		int a = name.length();
		for(int i=a-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));	
		}
		System.out.println();
		name1=name1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(name1);
		
		for(int i=0;i<=abc.length-1;i++)
		{
			abc[i]=abc[i].replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(abc[i]);
		}
						
	}

}
