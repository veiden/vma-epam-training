public class Logic {
    public void buildFunction(double a, double b, double h){
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("h is " + h);
        System.out.println("F(x) = tg(2*x) -3");
        double currentValue = a;
        writeHeader();
        while (currentValue < b){
            writeValuesLine(currentValue, Math.tan(currentValue*2) - 3);
            currentValue += h;
        }
        if (currentValue == b){
            writeValuesLine(currentValue, Math.tan(currentValue*2) - 3);
        }
        writeFooter();
    }
    
    private void writeValuesLine(double x, double y){
        System.out.print(". ");
        writeNDigitNumber(x, 18);
        System.out.print(" . ");
        writeNDigitNumber(y, 18);
        System.out.println(" .");
    }

    
    private void writeNDigitNumber(double number, int length){
        String varToString = Double.toString(number);
        int varLength = Math.min (varToString.length(), length);
        for (int i = 0; i < varLength; ++i){
            System.out.print(varToString.charAt(i));
        }
        for (int i = varLength; i < length; ++i){
            System.out.print(" ");
        }
    }

    private void writeHeader(){
        for (int i = 0; i < 43; ++i){
            System.out.print(".");
        }
        System.out.println();

        System.out.print(". x");
        for (int i = 0; i < 18; ++i){
            System.out.print(" ");
        }
        System.out.print(". y");
        for (int i = 0; i < 18; ++i){
            System.out.print(" ");
        }
        System.out.println(".");

        for (int i = 0; i < 43; ++i){
            System.out.print(".");
        }
        System.out.println();
    }

    private void writeFooter(){
        for (int i = 0; i < 43; ++i){
            System.out.print(".");
        }
        System.out.println();
    }

}