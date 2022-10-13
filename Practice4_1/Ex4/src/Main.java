public class Main {
    public static void main(String[] args) {
        Matrix obj1 = new Matrix(3, 3);
        obj1.printMatrix();
        Matrix obj2 = new Matrix(3, 3);
        obj2.printMatrix();
        Matrix obj3 = new Matrix();
        System.out.println("Matrix 1 + Matrix 2");
        obj3.sumMatrix(obj1, obj2);
        obj3.printMatrix();
        Matrix obj4 = new Matrix();
        System.out.println("Matrix 1 * Matrix 2");
        obj4.multiplicationMatrix(obj1, obj2);
        obj4.printMatrix();
        System.out.println("Matrix 1 * Matrix 2 * 2");
        obj4.multiplicationNumber(2);
        obj4.printMatrix();
    }
}