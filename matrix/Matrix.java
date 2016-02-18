import java.util.Arrays;

public class Matrix {
    private int rows;

    private int columns;

    private int[][] matrix;

    Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public Matrix insertAt(int row, int column, int value) {
        matrix[row-1][column-1] = value;
        return this;
    }

    public Matrix fill(int value){
        for(int row = 0; row < rows; row++)
            Arrays.fill(matrix[row], value);
        return this;
    }

    public int[][] getMatrix(){
        return matrix;
    }

}
