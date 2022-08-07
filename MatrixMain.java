import java.util.*;

class Matrix{

    int[][] first_m = new  int[100][100];
    int[][] second_m = new  int[100][100];
    int rw,cl;

    Matrix(){
        for(int i = 0;i<100;i++){
            for(int j = 0;j<100;j++){
                first_m[i][j] = 0;
                second_m[i][j] = 0;
                rw = 0;
                cl = 0;

            }
        }
    }

    Matrix(int[][] a,int[][] b, int row,int column){
        rw = row;
        cl = column;
        for(int i = 0;i<rw;i++){
            for(int j = 0;j<cl;j++){
                first_m[i][j] = a[i][j];
                second_m[i][j] = b[i][j];
            }
        }
    }

    int[][] addition(){
        int[][] sum = new int[rw][cl];
        for(int i = 0;i<rw;i++){
            for(int j = 0; j<cl;j++){
                sum[i][j] = first_m[i][j] + second_m[i][j];
            }
        }
        return sum;
    }

    int[][] subtraction(){
        int[][] sub = new int[rw][cl];
        for(int i = 0;i<rw;i++){
            for(int j = 0; j<cl;j++){
                sub[i][j] = first_m[i][j] - second_m[i][j];
            }
        }
        return sub;
    }

    int[][] multiplication(){
        int[][] multi = new int[rw][cl];
        for(int i=0;i<rw;i++){    
            for(int j=0;j<cl;j++){    
                multi[i][j]=0;      
                for(int k=0;k<rw;k++)      
                {      
                    multi[i][j]=first_m[i][k]*second_m[k][j]+multi[i][j];      
                } 
            }
        }
        return multi; 
    }

    int[][] transposition(){
        int[][] transp = new int[rw][cl];
        for(int i = 0; i<rw; i++){
            for(int j = 0;j<cl;j++){
               transp[i][j] = first_m[j][i];
            }
        }
        return transp;
    }

}


public class MatrixMain {
   public static void main(String[] args) {
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

        int[][] sum = mObj.addition();
        System.out.println("Matrix After Addition: ");
        for(int i = 0; i<row; i++){
            for(int j = 0;j<column;j++){
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] sub = mObj.subtraction();
        System.out.println("Matrix After Subtraction: ");
        for(int i = 0; i<row; i++){
            for(int j = 0;j<column;j++){
                System.out.print(sub[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] multi = mObj.multiplication();
        System.out.println("Matrix After Multiplication: ");
        for(int i = 0; i<row; i++){
            System.out.print("|");
            for(int j = 0;j<column;j++){
                System.out.print(multi[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }

        System.out.println("Matrix After Transposition: ");
        int[][] transp = mObj.transposition();
        for(int i = 0; i<row; i++){
            System.out.print("|");
            for(int j = 0;j<column;j++){
                System.out.print(transp[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }
   }
}
