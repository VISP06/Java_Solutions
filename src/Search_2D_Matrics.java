public class Search_2D_Matrics {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{10, 20, 30, 40, 50},
                                     {15, 25, 35, 45, 55},
                                     {27, 29, 37, 48, 58},
                                     {32, 33, 39, 50, 62}};
        int target =26;
        System.out.println(searchMatrix(matrix, target));
    }
    static public boolean searchMatrix(int[][] matrix, int target) {
        int rows=0;
        int cols=matrix[0].length-1;
        while(rows<matrix.length && cols>=0){
            if(matrix[rows][cols]==target){
                return true;
            }
            else if(matrix[rows][cols]>target){
                cols--;
            }
            else {
                rows++;
            }
        }
        return false;
    }
}
