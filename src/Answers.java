/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 344165857
 */
public class Answers {
    //variables
    private static int numCorrect = 0;
    private boolean correct;
    
    //constructor
    public Answers (boolean correct){
        this.correct = correct;
        if (correct==true){
            numCorrect += 1 ;
        } 
    }
    /**
     * This method returns numCorrect
     * @return numCorrect
     */
    public int getNumCorrect(){
        return numCorrect;
    }
    /**
     * This method returns correct
     * @return correct
     */
    public boolean getCorrect(){
        return correct;
    }
    
}
