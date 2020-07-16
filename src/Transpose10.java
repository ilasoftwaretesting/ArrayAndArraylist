public class Transpose10 {

    public static void main(String[] args) {
        int row, column;
        //Initialize matrix a
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //Calculates number of rows and columns present in given matrix
        row = a.length;
        column = a[0].length;

        //Declare array t with reverse dimensions
        int t[][] = new int[column][row];

        //Calculates transpose of given matrix
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++){
                //Converts the row of original matrix into column of transposed matrix

                t[i][j] = a[j][i];
            }
        }

        // output given in matrix

        System.out.println("Transpose of given matrix: ");
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}

