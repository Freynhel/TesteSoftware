public class Subtraction {
    private double firstValue;
    private double secondValue;

    public Subtraction(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double calc() {
        return firstValue - secondValue;
    }
    // getters
    public double getFirstValue() { return firstValue; }
    public double getSecondValue() { return secondValue; }
    // setters
    public void setFirstValue(int firstValue) { this.firstValue = firstValue; }
    public void setSecondValue(int secondValue) { this.secondValue = secondValue; }
}
