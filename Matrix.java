import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter dimensions of first matrix (rows columns):");
        int m1 = sc.nextInt(); 
        int n1 = sc.nextInt(); 
    
        System.out.println("Enter " + (m1 * n1) + " elements of first matrix:");
        int[][] a = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter dimensions of second matrix (rows columns):");
        int m2 = sc.nextInt(); 
        int n2 = sc.nextInt(); 
        
        System.out.println("Enter " + (m2 * n2) + " elements of second matrix:");
        int[][] b = new int[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    
        if (n1 != m2) {
            System.out.println("Matrix multiplication not possible!");
            System.out.println("Number of columns in first matrix (" + n1 + ") must equal number of rows in second matrix (" + m2 + ")");
            return;
        }
        
        int[][] c = new int[m1][n2];
    
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                c[i][j] = 0; 
                for (int k = 0; k < n1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
