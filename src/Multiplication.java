public class Multiplication {
    private float firstValue;
    private float secondValue;

    public Multiplication(float firstValue, float secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public float calc() {
        return firstValue * secondValue;
    }

    // getters
    public float getFirstValue() { return firstValue; }
    public float getSecondValue() { return secondValue; }
    // setters
    public void setFirstValue(int firstValue) { this.firstValue = firstValue; }
    public void setSecondValue(int secondValue) { this.secondValue = secondValue; }
}
