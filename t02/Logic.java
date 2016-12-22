public class Logic {
    int findRequested(double epsilon){
        System.out.println("epsilon is " + epsilon);        
        int index = 1;
        double currentValue;
        while (true){
            currentValue = (double)1/((index+1)*(index+1));
            if (currentValue < epsilon){
                System.out.println("requested element is at index " + index);
                System.out.println("value is " + currentValue);
                return index;
            }
            ++index;
        }
    }
}