public class Sum {
    private int firstValue;
    private int secondValue;

    public Sum(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public int calc() {
        return firstValue + secondValue;
    }

    // getters
    public int getFirstValue() { return firstValue; }
    public int getSecondValue() { return secondValue; }
    // setters
    public void setFirstValue(int firstValue) { this.firstValue = firstValue; }
    public void setSecondValue(int secondValue) { this.secondValue = secondValue; }
}