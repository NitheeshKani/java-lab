public class Calculator{
    public double findAverage(int number1,int number2,int number3){
        return Math.round((((number1+number2+number3)/3)*100.0)/100.0);
    }
}