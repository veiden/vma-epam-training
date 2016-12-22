public class Main {
    public static void main(String[] args) {
        double epsilon = Double.parseDouble(args[0]);
        Logic logic = new Logic();
        logic.findRequested(epsilon);
    }

}