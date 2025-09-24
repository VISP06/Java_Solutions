import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        System.out.println(Arrays.deepToString(setZeroes(matrix)));
    }
    static public int[][] setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=true;        //whenever we encounter a zero we will just mark that
                    col[j]=true;        //respective row and col which will then be changed after
                }                       //the this dual for loop has ended
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
}
