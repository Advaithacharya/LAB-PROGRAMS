package J1;
import java.util.Scanner;
public class L1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int N=sc.nextInt();
       int[][] matrix1=new int[N][N];
       int[][] matrix2=new int[N][N];
       Scanner sc1=new Scanner(System.in);

       System.out.println("Enter the elements of the first matrix:");
       for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
         matrix1[i][j]=sc1.nextInt();
        }
       }
       System.out.println("Enter the elements of the second matrix:");
       for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
         matrix2[i][j]=sc1.nextInt();
        }
       }

       int[][] sumMatrix =new int[N][N];
       for(int i=0;i<N;i++){
         for(int j=0;j<N;j++){
           sumMatrix[i][j]=matrix1[i][j]=matrix1[i][j]+matrix2[i][j];
         }
       }

       System.out.println("The sum of the two matrices is: ");
         for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
             System.out.print(sumMatrix[i][j]+"  ");
              }
           System.out.println();
         }
         sc.close();
    }
}