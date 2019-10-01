package AD181.Gezha;

public class SumOperation extends MathOperation {

  public SumOperation(double operand1, double operand2) {
    super(operand1, operand2);
  }

  @Override
  public double calc() {
    return this.operand1 + this.operand2;
  }
}
