/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 344165857
 */
public class mid extends Question{
    private static final int MID_POINTS = 2;
    private String midQuestion;
    private int points;
    public mid(Answers ans, int questionNumber, String midQuestion){
        super(ans, questionNumber);
        this.midQuestion = midQuestion;
        this.points = MID_POINTS;
    }
    
    
    public String getQuestion(){
        return midQuestion;
    }
    
    @Override
    public int getPoints(){
        return MID_POINTS;
    }
    
}



