import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MatrixTest {
    @Test
    public void getMatrix() {
        Matrix matrix = new Matrix(3,3);
        int[][] expected = new int[][]{
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        int[][] result = matrix.fill(0).getMatrix();
        assertArrayEquals("--> getMatrix - Failed", expected, result);
    }

    @Test
    public void insertAt() {
        Matrix matrix = new Matrix(3,3);
        int[][] expected = new int[][]{
            {0,0,0},
            {0,5,0},
            {0,0,0}
        };
        int[][] result = matrix.fill(0).insertAt(1, 1, 5).getMatrix();
        assertArrayEquals("--> insertAt - Failed", expected, result);
    }

    @Test
    public void valueAt() {
        Matrix matrix = new Matrix(3,3);
        int result = matrix.fill(0).insertAt(1, 1, 5).valueAt(1,1);
        assertEquals("--> valueAt - Failed", 5, result);
    }

    @Test
    public void add() {
        Matrix matrix1 = new Matrix(3,3);
        Matrix matrix2 = new Matrix(3,3);

        matrix1.fill(5);
        matrix2.fill(2);

        Matrix sum = matrix1.add(matrix2);
        int[][] expected = new int[][]{
            {7,7,7},
            {7,7,7},
            {7,7,7}
        };

        assertArrayEquals("--> add - Failed", expected, sum.getMatrix());

    }
}
