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
        int[][] result = matrix.fill(0).insertAt(2, 2, 5).getMatrix();
        assertArrayEquals("--> insertAt - Failed", expected, result);
    }
}
