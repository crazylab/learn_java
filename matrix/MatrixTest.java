import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MatrixTest {
    @Test
    public void fill_fills_the_matrix_with_the_given_value() {
        Matrix matrix = new Matrix(3,3);
        int[][] expected = new int[][]{
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        assertTrue("--> fill - Failed", matrix.fill(0).isEqual(expected));
    }

    @Test
    public void fill_does_not_fills_the_matrix_with_the_value_that_is_not_given() {
        Matrix matrix = new Matrix(3,3);
        int[][] notExpected = new int[][]{
            {0,0,0},
            {0,5,0},
            {0,0,0}
        };
        assertFalse("--> fill - Failed", matrix.fill(0).isEqual(notExpected));
    }

    @Test
    public void setValues_sets_the_matrix_with_given_matrix_values() {
        Matrix matrix = new Matrix(3,4);
        int[][] actual = new int[][]{
            {0,3,0,8},
            {0,0,5,1},
            {2,0,0,6}
        };
        assertTrue("--> setValues - Failed", matrix.setValues(actual).isEqual(actual));
    }

    @Test
    public void setValues_does_not_sets_the_matrix_with_the_matrix_that_is_not_given() {
        Matrix matrix = new Matrix(3,4);
        int[][] actual = new int[][]{
            {0,3,0,8},
            {0,8,5,1},
            {2,9,0,6}
        };
        int[][] different = new int[][]{
            {0,3,0,8},
            {0,0,5,1},
            {2,0,0,6}
        };
        assertFalse("--> setValues - Failed", matrix.setValues(actual).isEqual(different));
    }

    @Test
    public void add_adds_2_matrix_and_returns_a_new_matrix() {
        Matrix matrix1 = new Matrix(3,3);
        Matrix matrix2 = new Matrix(3,3);

        matrix1.fill(5);
        matrix2.fill(2);
        int[][] matrix1_value = new int[][]{
            {5,5,5},
            {5,5,5},
            {5,5,5}
        };
        int[][] matrix2_value = new int[][]{
            {2,2,2},
            {2,2,2},
            {2,2,2}
        };

        Matrix sum = matrix1.add(matrix2);
        int[][] expected = new int[][]{
            {7,7,7},
            {7,7,7},
            {7,7,7}
        };

        assertTrue("--> add - Failed", sum.isEqual(expected));
        assertTrue("--> add - Failed", matrix1.isEqual(matrix1_value));
        assertTrue("--> add - Failed", matrix2.isEqual(matrix2_value));
    }

    // @Test
    // public void multiply_multiplies_2_matrix_and_returns_a_new_matrix() {
    //     Matrix matrix1 = new Matrix(3,2);
    //     int[][] matrix1_value = {
    //         {4,8},
    //         {0,2},
    //         {1,6}
    //     };
    //     matrix1.setValue(matrix1_value);
    //
    //     int[][] matrix2_value = {
    //         {5,2},
    //         {9,4}
    //     };
    //     Matrix matrix2 = new Matrix(2,2);
    //     matrix2.setValue(matrix2_value);
    //
    //     Matrix result = matrix1.multiply(matrix2);
    //     int[][] expected = new int[][]{
    //         {92,40},
    //         {18, 8},
    //         {59, 26}
    //     };
    //
    //     assertArrayEquals("--> multiply - Failed", expected, result.getMatrix());
    //     assertArrayEquals("--> multiply - Failed", matrix1_value, matrix1.getMatrix());
    //     assertArrayEquals("--> multiply - Failed", matrix2_value, matrix2.getMatrix());
    // }
}
