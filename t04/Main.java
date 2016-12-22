public class Main {
    public static void main(String[] args) {
        System.out.println("Array is " + args[0]);
        LinkedDoubleList array = new LinkedDoubleList(args[0].trim() + " ");
        array.findMaxPair();
        
    }
}
