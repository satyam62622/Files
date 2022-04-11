import java.util.*;

public class Saddle
{

      public static void main(String []args)

              {
                 Scanner sc=new Scanner(System.in);

                 System.out.println("Enter the no of rows and coloumns:");

                 int r=sc.nextInt();

                 int c=sc.nextInt();

                  int arr[][]=new int[r][c];

                  int min[]=new int[r];

                  int max[]=new int[c];

                  int mn=0,mx=0;

                 System.out.println("Enter the elements of matrix:");

                  for(int i=0;i<r;i++)

                   {

                       for(int j=0;j<c;j++)

                          arr[i][j]=sc.nextInt();

                   }
                  
			for(int i=0;i<r;i++)

                   {

                        mn=arr[i][0];

                       for(int j=0;j<c;j++)

                        {

                           if(arr[i][j]<mn)

                             mn=arr[i][j];

                        }
         
              min[i]=mn;

                         
                   }

                    for(int i=0;i<c;i++)

                   {

                        mx=arr[0][i];

                       for(int j=0;j<r;j++)

                        {

                           if(arr[j][i]>mx)

                             mx=arr[j][i];

                        }

                       max[i]=mx;

                         
                   }

                   for(int m=0;m<r;m++)

                     {

                         int temp=min[m];

                         for(int n=0;n<c;n++)

                              {

                                 if(max[n]==temp)

                                    {

                                      System.out.println("Saddle point:"+temp);

                                     break;

                                    }

                               }

                      }

                   
              }

      }
