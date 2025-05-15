/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 242353497
 */
public class Easy extends Question{
    private static final int EASY_POINTS = 1;
    private Answers ans;
    private int questionNumber;
    private String easyQuestion;
    private int points;
    public Easy (Answers ans, int questionNumber, String easyQuestion){
        super(ans, questionNumber);
        this.points = EASY_POINTS;
        this.easyQuestion = easyQuestion;
    }
    public String getQuestion(){
        return easyQuestion;
    }
    
}
