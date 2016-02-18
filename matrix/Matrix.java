import java.util.Arrays;

public class Matrix {
    int rows;

    int columns;

    int[][] matrix;

    Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public boolean isEqual(int[][] otherMatrix){
        return 	Arrays.deepEquals(this.matrix, otherMatrix);
    }

    private Matrix insertAt(int row, int column, int value) {
        matrix[row][column] = value;
        return this;
    }

    private int valueAt(int row, int column) {
        return matrix[row][column];
    }

    public Matrix fill(int value){
        for(int row = 0; row < rows; row++)
            Arrays.fill(matrix[row], value);
        return this;
    }

    public Matrix setValues(int[][] matrix){
        for(int row = 0; row < rows; row++)
            for(int column = 0; column < columns; column++)
                this.matrix[row][column] = matrix[row][column];
        return this;
    }

    public Matrix add(Matrix addendMatrix){
        Matrix resultMatrix = new Matrix(rows, columns);
        for (int row = 0; row < rows ; row++){
            for (int column = 0; column < columns ; column++){
                int addedValue = this.valueAt(row,column) + addendMatrix.valueAt(row,column);
                resultMatrix.insertAt(row, column, addedValue);
            }
        }
        return resultMatrix;
    }

    // private boolean canBeMultiplied(Matrix multiplier){
    //     return this.rows == multiplier.columns;
    // }
    // public Matrix multiply(Matrix multiplier){
    //     if(canBeMultiplied(multiplier))
    //         return new Matrix(0,0);
    //     Matrix resultMatrix = new Matrix(this.rows, multiplier.columns);
    //     return resultMatrix;
    // }

}
