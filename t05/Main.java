public class Main {
    public static void main(String[] args) {
        System.out.println("Matrix size is " + args[0]);
        LinkedIntMatrix matrix = new LinkedIntMatrix(Integer.parseInt(args[0]));
        matrix.writeMatrix();

    }
}