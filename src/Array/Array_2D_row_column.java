//2 D ARRAY but row is not equal to column
package Array;
public class Array_2D_row_column 
{
	public static void main(String[] args) 
	{
		//ROW=6 //COLUMN=3
		int[][] A= {{100,101,102},{103,104,105},{106,107,108},{109,110,111},{112,113,114},{115,116,117}};
                  
        System.out.println("Length of Row= " +A.length);//find row's length
        System.out.println("Length of colunm= " +A[0].length);//find column's length**********
                
        for(int i=0; i<A.length; i++)       
    	{
    		for (int j=0; j<A[0].length; j++)    
    	    {
		 		System.out.print(A[i][j] +" ");	
		 		
    		}
    	
    		System.out.println();
        }
        
        System.out.println("Values of array in index format= ");
    	System.out.println();
        
    	for(int i=0; i<A.length; i++)       
    	{
    		for (int j=0; j<A[0].length; j++)    
    	    {
    			System.out.print("A"+"["+i+"]"+"["+j+"]"+"=");
		 		System.out.println(A[i][j]);	
		 		
    		}
        }
    	
    
    	
    	
    	

    	
	}
}
// // int column_size= A[0].length;
//System.out.println(column_size);