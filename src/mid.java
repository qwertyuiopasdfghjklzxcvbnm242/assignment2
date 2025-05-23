/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 344165857
 */
public class mid extends Question{
    // Declare variables
    private static final int MID_POINTS = 2;
    private String midQuestion;
    private int points;
    // Constructor
    public mid(Answers ans, int questionNumber, String midQuestion){
        super(ans, questionNumber);
        this.midQuestion = midQuestion;
        this.points = MID_POINTS;
    }
    
    /**
     * This method returns question
     * @return midQuestion
     */
    public String getQuestion(){
        return midQuestion;
    }
    /**
     * This method returns points
     * @return MID_POINTS
     */
    @Override
    public int getPoints(){
        return MID_POINTS;
    }
    
}



