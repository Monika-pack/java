package arrays;

public class TransposeofMatrix {

	public static void main(String[] args) {
		
		//creating a matrix  //
		int original[][]={{1,3,4},{2,4,3},{3,4,5}};    
		    
		//creating another matrix to store transpose of a matrix with using 3 rows and 3 columns//
  
		int result[][]=new int[3][3];
		    
		//Code to transpose a matrix  //
		
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		result[i][j]=original[j][i];  
		}    
		}    
		  //print withuout transpose//
		System.out.println("Printing Matrix without transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(original[i][j]+" ");    
		}    
		System.out.println();//new line  //  
		}    
		//print after  transpose//
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(result[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		}

	}


