import java.util.*;

class Matrix{

    /*This Class performs all the matrix operations */

    int[][] first_m = new  int[100][100];
    int[][] second_m = new  int[100][100];
    int rows,columns;

    Matrix(){
        for(int i = 0;i<100;i++){
            for(int j = 0;j<100;j++){
                first_m[i][j] = 0;
                second_m[i][j] = 0;
                rows = 0;
                columns = 0;

            }
        }
    }

    Matrix(int[][] a,int[][] b, int row,int column){
        rows = row;
        columns = column;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                first_m[i][j] = a[i][j];
                second_m[i][j] = b[i][j];
            }
        }
    }

    int[][] addition(){
        int[][] sum = new int[rows][columns];
        for(int i = 0;i<rows;i++){
            for(int j = 0; j<columns;j++){
                sum[i][j] = first_m[i][j] + second_m[i][j];
            }
        }
        return sum;
    }

    int[][] subtraction(){
        int[][] sub = new int[rows][columns];
        for(int i = 0;i<rows;i++){
            for(int j = 0; j<columns;j++){
                sub[i][j] = first_m[i][j] - second_m[i][j];
            }
        }
        return sub;
    }

    int[][] multiplication(){
        int[][] multi = new int[rows][columns];
        for(int i=0;i<rows;i++){    
            for(int j=0;j<columns;j++){    
                multi[i][j]=0;      
                for(int k=0;k<rows;k++)      
                {      
                    multi[i][j]=first_m[i][k]*second_m[k][j]+multi[i][j];      
                } 
            }
        }
        return multi; 
    }

    int[][] transposition(){
        int[][] transp = new int[rows][columns];
        for(int i = 0; i<rows; i++){
            for(int j = 0;j<columns;j++){
               transp[i][j] = first_m[j][i];
            }
        }
        return transp;
    }

}


public class MatrixMain {

    static void displayOutput(int[][] outputMatrix,int row,int column){
        /*This Method displays the output */
        for(int i = 0; i<row; i++){
            System.out.print("|");
            for(int j = 0;j<column;j++){
                System.out.print(outputMatrix[i][j]);
                System.out.print("|");
            }
            System.out.println("");
       }
    }


   public static void main(String[] args) {

        /*This is the main method */


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Row Count: ");
        int row = sc.nextInt();
        
        System.out.println("Enter Column Count: ");
        int column = sc.nextInt();

        int[][] first_m = new  int[row][column];
        int[][] second_m = new  int[row][column];

        System.out.println("Enter Matrix 1: ");
        for(int r = 0;r<row;r++){
            for(int c=0;c<column;c++){
                first_m[r][c] = sc.nextInt();
            }
        }
        
        System.out.println("Enter Matrix 2: ");
        for(int r = 0;r<row;r++){
            for(int c=0;c<column;c++){
                second_m[r][c] = sc.nextInt();
            }
        }
        
        
        sc.close();
        
        Matrix mObj = new Matrix(first_m,second_m,row,column);

        /*Addition of matrix and output displayed */
        int[][] sum = mObj.addition();
        System.out.println("Matrix After Addition: ");
        displayOutput(sum,row,column);
        
        /*Subtraction of matrix and output displayed */
        int[][] sub = mObj.subtraction();
        System.out.println("Matrix After Subtraction: ");
        displayOutput(sub,row,column);

        /*Multiplication of matrix and output displayed */
        int[][] multi = mObj.multiplication();
        System.out.println("Matrix After Multiplication: ");
        displayOutput(multi,row,column);

        /*Transposition of matrix and output displayed */
        System.out.println("Matrix After Transposition: ");
        int[][] transp = mObj.transposition();
        displayOutput(transp,row,column);
   } 
}
