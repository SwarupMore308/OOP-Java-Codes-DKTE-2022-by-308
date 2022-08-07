import java.util.*;

public class Matrix {
    public static void main(String []args){
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

        int[][] sum = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0; j<column;j++){
                sum[i][j] = first_m[i][j] + second_m[i][j];
            }
        }

        System.out.println("Matrix After Addition: ");
        for(int i = 0; i<row; i++){
            for(int j = 0;j<column;j++){
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] sub = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0; j<column;j++){
                sub[i][j] = first_m[i][j] - second_m[i][j];
            }
        }
        System.out.println("Matrix After Subtraction: ");
        for(int i = 0; i<row; i++){
            for(int j = 0;j<column;j++){
                System.out.print(sub[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int[][] multi = new int[row][column];
        for(int i=0;i<row;i++){    
            for(int j=0;j<column;j++){    
                multi[i][j]=0;      
                for(int k=0;k<row;k++)      
                {      
                    multi[i][j]=first_m[i][k]*second_m[k][j]+multi[i][j];      
                } 
            } 
        }
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
        for(int i = 0; i<row; i++){
            System.out.print("|");
            for(int j = 0;j<column;j++){
                System.out.print(first_m[j][i]);
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
