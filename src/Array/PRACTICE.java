package Array;

public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 ={1,2,3,2,1};
		//	System.out.println(a);
			
			System.out.println(a1.length);
			
			for(int i=0;i<a1.length;i++)
			{
				for(int j=i+1;j<a1.length;j++)
				{
				if(a1[i]==a1[j])
				{
					continue;
				//	System.out.println(a1[i]);
				}
				}
			}
		
			
			System.out.println("hjklsdfghjkl");

		int[] a ={1,2,3,2,2,1};
	//	System.out.println(a);
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				System.out.println(a[j]);
			}
			}
		}
	}

}
