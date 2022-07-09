package Array;

public class ARRAY_BASICS 
{
	public static void main(String[] args) 
	{
		//Array declaration
		//1) int[] a;
		//2) int [] a;
		//3) int []a;
		//4) int a[];
		
		//ARRAY  CREATION
		//1)a=new int[3 ];
		//2)a=new int [3];
	
		//DECLARATION + CREATION
		//1)int[] a=new int[3];
		
		//ARRAY INITIALIZATION
		//1)a[0]=10;
		//a[1]=20;
		//a[2]=30;
		//a[3]=40;//***** gives run time error== index 3 is out of bond.
		
	    //	System.out.println(a[2]);
		
		//DECLARATION + CREATION + INITIALIZATION
		int[] a= {10,20,30,40,50};
		
		System.out.println(a[2]+"\n");
		//System.out.println(a);//gives # value=[I@515f550a
	
		System.out.println(a.length+"\n");//length = 5
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//gives all values of array
		}
	}

}
