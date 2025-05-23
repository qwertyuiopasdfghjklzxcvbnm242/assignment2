/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 242353497
 */
public class Hard extends Question {
    private static final int HARD_POINTS = 3;
    private String hardQuestion;
    private int points;
    public Hard(Answers ans, int questionNumber, String hardQuestion){
        super(ans, questionNumber);
        this.hardQuestion = hardQuestion;
        this.points = HARD_POINTS;
    } 
    /**
     * This method return questions
     * @return hardQuestion
     */
    public String getQuestion(){
        return hardQuestion;
    }
    /**
     * This method return points
     * @return HARD_POINTS
     */
    @Override
    public int getPoints(){
        System.out.print(points);
        return HARD_POINTS;
    }
}
