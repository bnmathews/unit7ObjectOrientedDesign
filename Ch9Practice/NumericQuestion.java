public class NumericQuestion extends Question
{
    private double answer; 
    
    public NumericQuestion()
    {
    }
    
    public boolean checkAnswer(String response) //must take it as a string to override parent method
    {
        double responseAsDouble = Double.parseDouble(response);
        
        return Math.abs( responseAsDouble - answer ) <= 0.01;
    }
}
