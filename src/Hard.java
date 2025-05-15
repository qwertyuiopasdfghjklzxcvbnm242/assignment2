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
    public Hard(Answers ans, int questionNumber, String hardQuestion){
        super(ans, questionNumber);
        this.hardQuestion = hardQuestion;
    } 
}
