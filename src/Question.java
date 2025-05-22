/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 242353497
 */
public class Question {
    // Declare variables
    private Answers ans;
    private int questionNumber;
    private int points;
    private String question;
    private static int numQuestions = 0;
    // Constructor 
    public Question(Answers ans, int questionNumber){
        this.questionNumber = questionNumber;
        this.ans = ans;
        numQuestions++;
    }
    // Constructor 
    public Question(Answers ans, int questionNumber, String question){
        this.questionNumber = questionNumber;
        this.ans = ans;
        this.question = question;
        numQuestions++;
    }
    /*
    * This method gives question number
    * @return questionNumber
    */
    public int getQuestionNumber(){
        return questionNumber;
    }
    /*
    * This method gives number of questions answered
    * @return questionNumber
    */
    public static int getNumQuestions(){
        return numQuestions;
    }
    public int getPoints(){
        return 0;
    }
    
    public String getQuestion(){
        return question;
    }
}
