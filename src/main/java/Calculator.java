public class Calculator {

    private int number1;
    private int number2;
    private double number3;
    private double number4;

    public Calculator(int number1, int number2, double number3, double number4){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
    }

    public int getAddedNumbers(){
        return this.number1 + this.number2;
    }

    public int getSubtractedNumbers(){
        return this.number1 - this.number2;
    }

    public int multiply() {
        return this.number1 * this.number2;
    }

    public double divide() {
        return this.number3 / this.number4;
    }
}
