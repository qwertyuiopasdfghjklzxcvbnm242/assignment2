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
    
    public int getNumCorrect(){
        return numCorrect;
    }
    
    public boolean getCorrect(){
        return correct;
    }
    
}
