
//Two diamensional array
package Array;
public class ARRAY_2D 
{
	public static void main(String[] args) 
	{	
		//2 diamensional array
		//declaration + creation + initialization
		//int[][] a= {{50,100,150},{200,250,300},{350,400,450}};
		String[][] a= {{"india","heritage","republic"},{"country","democracy","secular"},{"independent","ancient","fabulus"}};
		
		System.out.println("Length of 2-D array= "+a.length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++ )
			{
					System.out.print("Index " +i+","+j +" = ");
					System.out.println(a[i][j]);	
			}
		}

	}

}
