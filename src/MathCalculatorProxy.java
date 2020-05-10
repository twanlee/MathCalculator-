public class MathCalculatorProxy implements Calculator {
    private MathCalculator mathCalculator;
    public MathCalculatorProxy(){
        this.mathCalculator = new MathCalculator();
    }
    @Override
    public double div(double first, double second) {
        if (second==0) throw new RuntimeException("Cannot div to zero");
        return  mathCalculator.div(first,second);
    }

    @Override
    public double mul(double first, double second) {
        double result = mathCalculator.mul(first,second);
        if(first!=0 && result/first!=second){
            throw new RuntimeException("Out of range");
        }
        return result;
    }
}
