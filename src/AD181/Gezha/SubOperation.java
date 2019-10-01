package AD181.Gezha;

public class SubOperation extends MathOperation {

  public SubOperation(double operand1, double operand2) {
    super(operand1, operand2);
  }

  @Override
  public double calc() {
    return this.operand1 - this.operand2;
  }
}
