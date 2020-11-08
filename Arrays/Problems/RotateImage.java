package Arrays.Problems;

public class RotateImage {

    public static void rotateImage(int [][]matrix){
        int n = matrix.length;

        printMatrix(matrix);

        //Transpose matrix (swap lower triangle to upper triangle elements
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("After Transpose");
        printMatrix(matrix);

        //Reverse Each row
        for (int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        printMatrix(matrix);

    }

    static void printMatrix(int [][] matrix){
        int n = matrix.length;
        //Print Matrix
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage(matrix);
    }
}
