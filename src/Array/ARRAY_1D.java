//Single diamensional array
package Array;
public class ARRAY_1D 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};//declaration + creation + initialization in one go.
		
		System.out.println("Length of the array=" +a.length);
		System.out.println("values of array = ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" Index " + i + "= ");
						
			System.out.println(a[i]);
		}	
	}
}
