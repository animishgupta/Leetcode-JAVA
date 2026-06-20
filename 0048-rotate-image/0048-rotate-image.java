class Solution {
    public void rotate(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[j][i] = matrix[i][j];
            }
            
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][matrix[0].length - 1 - j];
                arr[i][matrix[0].length - 1 - j] = temp;
            }
            
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = arr[i][j];
            }
            
        }
    }
}