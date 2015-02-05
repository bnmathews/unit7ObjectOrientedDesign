import java.util.Scanner;
public class FillInQuestion extends Question
{
    // specified text: "The inventor of Java is _James Gosling_ from Sun."
    // convert specified text into text to display and the answer
    // text: "The inventor of Java is _____ from Sun."
    // answer: "James Gosling"
    
    public FillInQuestion()
    {
        
    }
    
    public void setText(String questionText)   
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next(); //goes until the first '_'
        String answer = parser.next(); //goes until the next '_'
        question += "_____" + parser.next();
        
        super.setText(question);
        super.setAnswer(answer); //super is not really needed here, since setAnswer isn't in here
    }
}
