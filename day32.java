
import java.util.*;
public class day32 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            
            {
                arr[i][j]=sc.nextInt();
            }
        }


      /*   for(int i=0;i<n;i++)
        {                                                 to print matrix
            for(int j=0;j<m;j++)
            {
                  System.out.print(arr[i][j]+" ");

            }
            System.out.println("");
            }
            */

    /*  int sum=0;

            for(int i=0;i<n;i++)
              {                                                
              for(int j=0;j<m;j++)
                 {
                     if(i==j||i+j==n-1)
                     {
                        System.out.print(arr[i][j]+" ");
                        sum=sum+arr[i][j];
                     }
                     else{
                        System.out.print(" ");
                     }
                      

                 }
                 System.out.println("");                                   //diagonal and diagonal sum
            }
            System.out.println(sum);
            */







          /*   int startrow=0;
            int endrow=arr.length-1;
            int startcol=0;
            int endcol=arr[0].length-1;
            //top
            while(startrow<=endrow&&startcol<=endcol)
            {
                for(int j=startcol;j<=endcol;j++)
                {
                    System.out.print(arr[startrow][j]+" ");
                }
                //right
                for(int i=startrow+1; i<=endrow;i++)
                {
                    System.out.print(arr[i][endcol]+" ");
                }
                  for(int j=endcol-1;j>=startcol;j--)
                  {
                    System.out.print(arr[endrow][j]+" ");
                  }
                  for(int i=endrow-1;i>=startrow+1;i--)
                  {
                    System.out.print(arr[i][startcol]+" ");
                  }
                  startcol++;
                  startrow++;
                  endcol--;
                  endrow--;            //to print in sprial

            }
            System.out.println("");
            */


            class Solution {
                public List<Integer> spiralOrder(int[][] matrix) {
                    List <Integer> res=new ArrayList<>();
                    if(matrix==null || matrix.length==0){
                        return res;
                    }
                    int start_row=0;
                    int end_row=matrix.length-1;
                    int start_col=0;
                    int end_col=matrix[0].length-1;
            
                    while(start_row<=end_row && start_col<=end_col){
            
                    //top
                    for(int j=start_col;j<=end_col;j++){
                        res.add(matrix[start_row][j]);
                    }                                                                  //leetcode 54 sprial using list
                    //right
                    for(int i=start_row+1;i<=end_row;i++){
                        res.add(matrix[i][end_col]);
                    }
                    //bottom
                    for(int j=end_col-1;j>=start_col;j--){
                        if(start_row==end_row) //avoid middle element twice
                        {
                            break;
                        }
                        res.add(matrix[end_row][j]);
                    }
                    //left
                    for(int i=end_row-1;i>start_row;i--){
                        if(start_col==end_col)  //avoid middle element twice
                        {
                            break;
                        }
                        res.add(matrix[i][start_col]);
                    }
                    start_row++;
                    end_row--;
                    start_col++;
                    end_col--;
                    }
                    return res;
                }
            
            }
             
    }


}
