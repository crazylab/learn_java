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
        matrix[row][column] = value;
        return this;
    }

    public int valueAt(int row, int column) {
        return matrix[row][column];
    }

    public Matrix fill(int value){
        for(int row = 0; row < rows; row++)
            Arrays.fill(matrix[row], value);
        return this;
    }

    public int[][] getMatrix(){
        return matrix;
    }

    public Matrix add(Matrix addendMatrix){
        Matrix sum = new Matrix(rows, columns);
        for (int row = 0; row < rows ; row++){
            for (int column = 0; column < columns ; column++){
                int addedValue = this.valueAt(row,column) + addendMatrix.valueAt(row,column);
                sum.insertAt(row, column, addedValue);
            }
        }
        return sum;
    }
}
