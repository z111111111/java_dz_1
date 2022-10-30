public class Main {

    public static void main(String[] args) {
        Matrix m1;
        Matrix m2;
        Matrix m3;
        Matrix m4;


        m1 = new Matrix(2,3);

        m1.setElement(1,1,2);
        m1.setElement(1,2,2);
        m1.setElement(1,0,3);
        m1.setElement(0,1,1);
        m1.setElement(0,2,5);
        m1.setElement(0,0,6);

        m1.displayMatrix();
        m2 = m1.transp();
        m2.displayMatrix();

        m3 = new Matrix(2,2);
        m3.setElement(0,1,1);
        m3.setElement(0,0,6);
        m3.setElement(1,0,3);
        m3.setElement(1,1,2);

        m3.displayMatrix();
        m4 = m3.step(3);
        m4.displayMatrix();



        Ball ball = new Ball(10);
        Cilinder cilinder = new Cilinder(2, 2);
        Pyramid pyramid = new Pyramid(5, 8);

        Box box = new Box(2500);

        System.out.println(box.add(ball));
        System.out.println(box.add(cilinder));
        System.out.println(box.add(pyramid));
    }
}