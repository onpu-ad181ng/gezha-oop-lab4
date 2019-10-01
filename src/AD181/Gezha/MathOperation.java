package AD181.Gezha;

// stores operands, provides calc() interface for derived classes
public abstract class MathOperation {
  protected double operand1;
  protected double operand2;

  public MathOperation(double operand1, double operand2) {
    this.operand1 = operand1;
    this.operand2 = operand2;
  }

  public abstract double calc();
}
