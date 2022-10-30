import java.util.Random;

public class Matrix {

    int i;
    int j;
    int[][] matrix;

    public Matrix(int i, int j)
    {
        this.i = i;
        this.j = j;
        this.matrix = new int[this.i][this.j];
    }

    public int getVerticalSize() {
        return matrix.length;
    }

    public int getHorizontalSize() {
        return matrix[0].length;
    }

    public int getElement(int i, int j) {
        return matrix[i][j];
    }

    public void setElement(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public Matrix plus(Matrix b) {
        int v = this.getVerticalSize();
        int h = this.getHorizontalSize();
        Matrix result = new Matrix(v, h);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                int value = 0;
                value = this.getElement(i, j) + b.getElement(i, j);
                result.setElement(i, j, value);
            }
        }
        return result;
    }

    public Matrix minus(Matrix b) {
        int v = this.getVerticalSize();
        int h = this.getHorizontalSize();
        Matrix result = new Matrix(v, h);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                int value = 0;
                value = this.getElement(i, j) - b.getElement(i, j);
                result.setElement(i, j, value);
            }
        }
        return result;
    }

    public Matrix mult(Matrix b) {
        int v = this.getVerticalSize();
        int h = b.getHorizontalSize();
        int temp = this.getHorizontalSize();

        Matrix result = new Matrix(v, h);

        for (int i = 0; i < v; i++)
            for (int j = 0; j < h; j++) {
                int value = 0;
                for (int k = 0; k < temp; k++) {
                    value += this.getElement(i, k) * b.getElement(k, j);
                }
                result.setElement(i, j, value);
            }
        return result;
    }

    public Matrix transp() {
        int v = this.getVerticalSize();
        int h = this.getHorizontalSize();
        int value;

        Matrix result = new Matrix(h, v);

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                value = this.getElement(i,j);
                result.setElement(j,i,value);
            }

        }
        return result;
    }

    public void displayMatrix()
    {
        for(int i = 0; i < this.i; i++)
        {
            for(int j = 0; j < this.j; j++)
            {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix step(int r) {
        int n = this.getVerticalSize();
        Matrix c = new Matrix(n,n);

        for (int i = 0; i < r; i++) {
            c = this.mult(this);
        }

        return c;
    }
}



