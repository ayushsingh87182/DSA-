import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralmatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
            int startrow = 0;
            int endrow = matrix.length-1;
            int startcol = 0;
            int endcol = matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            for(int j = startcol;j<=endcol;j++){
                ans.add(matrix[startrow][j]);
            }
            for(int i =startrow+1;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }
            for(int j = endcol - 1;j>=startcol;j--){
                if(startrow == endrow){
                    break;
                }
                ans.add(matrix[endrow][j]);
            }
            for(int i = endrow-1;i>startrow;i--){
                if(startcol == endcol){
                    break;
                }
                ans.add(matrix[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
        return ans;
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create object and call function
        spiralmatrix obj = new spiralmatrix();
        List<Integer> result = obj.spiralOrder(matrix);

        // Print spiral order
        System.out.println("Spiral Order:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}