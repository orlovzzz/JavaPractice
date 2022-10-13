import java.util.Random;

public class Matrix {
    private int n;
    private int m;
    private double[][] matrix = new double[100][100];

    Matrix() {}

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextDouble(10 + 1);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void multiplicationNumber(int n) {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] *= n;
            }
        }
    }

    public void setLine(int n) {
        this.n = n;
    }

    public void setRow(int m) {
        this.m = m;
    }

    public int getLine() {
        return n;
    }

    public int getRow() {
        return m;
    }

    public void sumMatrix(Matrix obj1, Matrix obj2){
        if ((obj1.getLine() == obj2.getLine()) && (obj1.getRow() == obj2.getRow())) {
            this.setLine(obj1.getLine()); this.setRow(obj1.getRow());
            for (int i = 0; i < this.n; i++) {
                for(int j = 0; j < this.m; j++){
                    this.matrix[i][j] = obj1.matrix[i][j] + obj2.matrix[i][j];
                }
            }
        }  else {
            System.out.println("Dimensions aren`t equal.");
        }
    }

    public void multiplicationMatrix(Matrix obj1, Matrix obj2) {
        if (obj1.getRow() == obj2.getLine()) {
            this.setLine(obj1.getLine()); this.setRow(obj2.getRow());
            for (int i = 0; i < obj1.getLine(); i++) {
                for (int j = 0; j < obj2.getRow(); j++) {
                    for (int k = 0; k < obj2.getLine(); k++){
                        matrix[i][j] += obj1.matrix[i][k] * obj2.matrix[k][j];
                    }
                }
            }
        } else {
            System.out.println("Row first matrix != line second matrix.");
        }
    }
}
