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
    // Constructor 
    public Question(Answers ans, int questionNumber){
        this.questionNumber = questionNumber;
        this.ans = ans;
    }
    /*
    * This method gives question number
    * @return questionNumber
    */
    public int getQuestionNumber(){
        return questionNumber;
    }
}
