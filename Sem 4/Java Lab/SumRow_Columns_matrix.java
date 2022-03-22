import java.util.Scanner;
public class SumRow_Columns_matrix {
public static void main(String [] Args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please input size of matrix(mXn): \nm: ");
	int m,n,i,j,rowSum=0,colSum=0;
	m=sc.nextInt();
	System.out.println("\nn: ");
	n=sc.nextInt();
	int matrix[][]=new int[m][n];
	System.out.println("Input matrix elements: ");
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			matrix[i][j]=sc.nextInt();
	System.out.println("\nMATRIX:\n");
	for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println("");	
	}		
	System.out.println("");
for(i=0;i<m;i++) {
	for(j=0;j<n;j++)
		rowSum=rowSum+matrix[i][j];
	System.out.println("Sum of row "+(i+1)+" is : "+rowSum);
	rowSum=0;
}

for(j=0;j<n;j++) {
	for(i=0;i<m;i++)
		colSum=colSum+matrix[i][j];
	System.out.println("Sum of column "+(j+1)+" is : "+colSum);
	colSum=0;
}

}
}

