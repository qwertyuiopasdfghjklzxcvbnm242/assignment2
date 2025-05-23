
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 242353497
 */
public class MainProgram extends javax.swing.JFrame {
    int questionNum = 0;
    int easyCount = -1;
    int midCount = -1;
    int hardCount = -1;
    public static int points = 0;
    int questionCount = 0;
    boolean allow = true;
    boolean detectEasy = false;
    boolean detectMid = false;
    boolean detectHard = false;
    Question [] easyQuestions = new Question [10];

    mid [] midQuestions = new mid[10];
    Hard [] hardQuestions = new Hard[10];
    
    /**
     * Creates new form NewJFrame
     */
    public MainProgram() {
        initComponents();
        feed.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feedback = new javax.swing.JLabel();
        fake = new javax.swing.JButton();
        real = new javax.swing.JButton();
        nextEasy = new javax.swing.JButton();
        nextMid = new javax.swing.JButton();
        nextHard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        qq = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        point = new javax.swing.JTextField();
        feed = new javax.swing.JButton();
        ifcorrect = new javax.swing.JTextField();

        feedback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fake.setBackground(new java.awt.Color(255, 0, 51));
        fake.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fake.setText("Fake");
        fake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakeActionPerformed(evt);
            }
        });

        real.setBackground(new java.awt.Color(0, 255, 51));
        real.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        real.setText("Real");
        real.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realActionPerformed(evt);
            }
        });

        nextEasy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nextEasy.setText("Next Easy");
        nextEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextEasyActionPerformed(evt);
            }
        });

        nextMid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nextMid.setText("Next Mid");
        nextMid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMidActionPerformed(evt);
            }
        });

        nextHard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nextHard.setText("Next Hard");
        nextHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextHardActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Points");

        qq.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        qq.setText("Question");

        header.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        feed.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        feed.setText("Feedback Page");
        feed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedActionPerformed(evt);
            }
        });

        ifcorrect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ifcorrect.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qq, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ifcorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fake, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(165, 165, 165)
                                        .addComponent(real, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(189, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(nextEasy)
                .addGap(178, 178, 178)
                .addComponent(nextMid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextHard)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(feed, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifcorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(point))
                .addGap(5, 5, 5)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fake, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(real, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextMid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextHard, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(feed, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakeActionPerformed
        // If statement
        if (detectEasy && allow){
            // Declare variables
            int lines = countLines("easy"); 
            String [] easyQ = take(lines, "easy"); 
            String [] easyA = take(lines, "easyAns"); 
            Answers [] answer = new Answers [10]; 
            int [] easyAnswers = new int [easyA.length]; 
            boolean [] bool = new boolean [easyA.length];
            // For loop to convert to int
            for (int i = 0; i < easyAnswers.length;i++){
                easyAnswers[i] = Integer.parseInt(easyA[i]);
                if(easyAnswers[i] == 0){ // Converts to boolean
                    bool[i] = true;
                } else {
                    bool[i] = false;
            }    
            }
            // For loop to instiantiate easyQuestions
            for (int i = 0; i<easyQ.length;i++){
                answer[i] = new Answers(bool[i]);
                easyQuestions[i] = new Easy(answer[i], (i + 1), easyQ[i]);
            }
            // Detect if correct
            if (!answer[easyCount].getCorrect()){
                points += easyQuestions[easyCount].getPoints();
                ifcorrect.setText("CORRECT");
            }  else ifcorrect.setText("INCORRECT");
            point.setText("" + points);
            allow = false; // Set allow false to avoid double inputs
        }
        // If statement
        if (detectMid && allow){
            // Declare variables
            int lines = countLines("mid");
            String [] midQ = take(lines, "mid");
            String [] midA = take(lines, "midAns");
            Answers [] answer = new Answers [10];
            int [] midAnswers = new int [midA.length];
            boolean [] bool = new boolean [midA.length];
            // For loop to convert to int
            for (int i = 0; i < midAnswers.length;i++){
                midAnswers[i] = Integer.parseInt(midA[i]);
                if(midAnswers[i] == 0){ // Converts to boolean
                    bool[i] = true;
                } else {
                    bool[i] = false;
            }    
            }
            // For loop to instiantiate midQuestions
            for (int i = 0; i<midQ.length;i++){
                answer[i] = new Answers(bool[i]);
                midQuestions[i] = new mid(answer[i], (i + 1), midQ[i]);
            }
            // Detect if correct
            if (!answer[midCount].getCorrect()){
                ifcorrect.setText("CORRECT");
                points += midQuestions[midCount].getPoints();
            }  else ifcorrect.setText("INCORRECT");
            point.setText("" + points);
            allow = false;  // Set allow false to avoid double inputs
        }
        // If statement
        if (detectHard && allow){
            // Declare variables
            int lines = countLines("hard");
            String [] hardQ = take(lines, "hard");
            String [] hardA = take(lines, "hardAns");
            Answers [] answer = new Answers [10];
            int [] hardAnswers = new int [hardA.length];
            boolean [] bool = new boolean [hardA.length];
            // For loop to convert to int
            for (int i = 0; i < hardAnswers.length;i++){
                hardAnswers[i] = Integer.parseInt(hardA[i]);
                if(hardAnswers[i] == 0){ // Converts to boolean
                    bool[i] = true;
                } else {
                    bool[i] = false;
            }    
            }
            // For loop to instiantiate hardQuestions
            for (int i = 0; i<hardQ.length;i++){
                answer[i] = new Answers(bool[i]);
                hardQuestions[i] = new Hard(answer[i], (i + 1), hardQ[i]);
            }
            // Detect if correct
            if (!answer[hardCount].getCorrect()){
                ifcorrect.setText("CORRECT");
                points += hardQuestions[hardCount].getPoints();
            }  else ifcorrect.setText("INCORRECT");
            point.setText("" + points);
            allow = false; // Set allow false to avoid double inputs
        }
        questionCount++;  // Increase question counter
        // Set detections to false to avoid double inputs
        detectEasy = false;
        detectMid = false;
        detectHard = false;
    }//GEN-LAST:event_fakeActionPerformed

    private void realActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realActionPerformed
        // If statement
        if (detectEasy && allow){
            int lines = countLines("easy");
            String [] easyQ = take(lines, "easy");
            String [] easyA = take(lines, "easyAns");
            Answers [] answer = new Answers [10];
            int [] easyAnswers = new int [easyA.length];
            boolean [] bool = new boolean [easyA.length];
            // For loop to turn to int
            for (int i = 0; i < easyAnswers.length;i++){
                easyAnswers[i] = Integer.parseInt(easyA[i]);
                if(easyAnswers[i] == 0){ // Convert to boolean
                    bool[i] = true;
                } else {
                    bool[i] = false;
            }    
            }
            // For loop to instiantiate easyQuestions
            for (int i = 0; i<easyQ.length;i++){
                answer[i] = new Answers(bool[i]);
                easyQuestions[i] = new Easy(answer[i], (i + 1), easyQ[i]);
            }
            // Detect if correct
            if (answer[easyCount].getCorrect()){
                points += easyQuestions[easyCount].getPoints();
                ifcorrect.setText("CORRECT");
            } else ifcorrect.setText("INCORRECT");
            point.setText("" + points);
            allow = false; // Set to false to avoid double inputs
        }
        // if statement
        if (detectMid && allow){
            // Declare variables
            int lines = countLines("mid");
            String [] midQ = take(lines, "mid");
            String [] midA = take(lines, "midAns");
            Answers [] answer = new Answers [10];
            int [] midAnswers = new int [midA.length];
            boolean [] bool = new boolean [midA.length];
            // For loop to convert to int 
            for (int i = 0; i < midAnswers.length;i++){
                midAnswers[i] = Integer.parseInt(midA[i]);
                if(midAnswers[i] == 0){ // Convert to boolean
                    bool[i] = true;
                } else {
                    bool[i] = false;
            }    
            }
            // For loop to instiantiate midQuestions
            for (int i = 0; i<midQ.length;i++){
                answer[i] = new Answers(bool[i]);
                midQuestions[i] = new mid(answer[i], (i + 1), midQ[i]);
            }
            // Detect if correct
            if (answer[midCount].getCorrect()){
                ifcorrect.setText("CORRECT");
                points += midQuestions[midCount].getPoints();
            }  else ifcorrect.setText("INCORRECT");
            point.setText("" + points);
            allow = false; // Set allow false to avoid double inputs
        }
        // If statement
        if (detectHard && allow){
            // Declare variables
            int lines = countLines("hard");
            String [] hardQ = take(lines, "hard");
            String [] hardA = take(lines, "hardAns");
            Answers [] answer = new Answers [10];
            int [] hardAnswers = new int [hardA.length];
            boolean [] bool = new boolean [hardA.length];
            // if statement to convert to int
            for (int i = 0; i < hardAnswers.length;i++){
                hardAnswers[i] = Integer.parseInt(hardA[i]);
                if(hardAnswers[i] == 0){ // Convert to boolean
                    bool[i] = true;
                } else {
                    bool[i] = false;
            }    
            }
            // For loop to instiantiate hardQuestions
            for (int i = 0; i<hardQ.length;i++){
                answer[i] = new Answers(bool[i]);
                hardQuestions[i] = new Hard(answer[i], (i + 1), hardQ[i]);
            }
            // Detect if correct
            if (answer[hardCount].getCorrect()){
                ifcorrect.setText("CORRECT");
                points += hardQuestions[hardCount].getPoints();
            } else ifcorrect.setText("INCORRECT");
            point.setText("" + points);
            allow = false; // Set allow to false to aviod double inputs
        }
        // Set all detection to false to avoid double inputs
        detectEasy = false;
        detectMid = false;
        detectHard = false;
    }//GEN-LAST:event_realActionPerformed

    private void nextEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextEasyActionPerformed
        // Declare variables
        int lines = countLines("easy");
        String [] easyQ = take(lines, "easy");
        String [] easyA = take(lines, "easyAns");
        int [] easyAnswers = new int [easyA.length];
        boolean [] bool = new boolean [easyA.length];
        // Convert to int
        for (int i = 0; i < easyAnswers.length;i++){
            easyAnswers[i] = Integer.parseInt(easyA[i]);
            if(easyAnswers[i] == 0){ // Convert to boolean
                bool[i] = true;
            } else {
                bool[i] = false;
            }
        }
        // Instintiate easyQuestions
        for (int i = 0; i<easyQ.length;i++){
            Answers answer = new Answers(bool[i]);
            easyQuestions[i] = new Easy(answer, (i + 1), easyQ[i]);
        }
       
        // if statement to prevent out of index
        if (easyCount < easyQuestions.length - 1){
            // Increase counters
             questionNum++;
             qq.setText("Question " + questionNum);
            easyCount++;
            // Set text
            header.setText("<html>" + easyQuestions[easyCount].getQuestion() + "<html>");
           
        } else {
            header.setText("No more easy!"); // Done msg
        }
        // Set all detection to true 
        detectEasy = true;
        allow = true;
        // Disappear after 10 questions
        if (questionNum == 10){
            nextMid.setVisible(false);
            nextEasy.setVisible(false);
            nextHard.setVisible(false);
            feed.setVisible(true); 
        }
        
    }//GEN-LAST:event_nextEasyActionPerformed

    private void nextMidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMidActionPerformed
        // Declare variables
        int lines = countLines("mid");
        String [] midQ = take(lines, "mid");
        String [] midA = take(lines, "midAns");
        int [] midAnswers = new int [midA.length];
        boolean [] bool = new boolean [midA.length];
        // For loop to convert to int
        for (int i = 0; i < midAnswers.length;i++){
            midAnswers[i] = Integer.parseInt(midA[i]);
            if(midAnswers[i] == 0){ // convert to boolean
                bool[i] = true;
            } else {
                bool[i] = false;
            }
        }
        // Instiantiate midQuestions
        for (int i = 0; i<midQ.length;i++){
            Answers answer = new Answers(bool[i]);
            midQuestions[i] = new mid(answer, (i + 1), midQ[i]);
        }
        // Prevent out of index
        if (midCount < midQuestions.length - 1){
            // Increase counters
            questionNum++;
            qq.setText("Question " + questionNum);
            midCount++;
            header.setText("<html>" + midQuestions[midCount].getQuestion() + "<html>"); // Set text
           
        } else {
            header.setText("No more mid!"); // Finished msg
        }
        // Set detection to true
        detectMid = true;
        allow = true;
        // End at 10 questions
        if (questionNum == 10){
            nextMid.setVisible(false);
            nextEasy.setVisible(false);
            nextHard.setVisible(false);
            feed.setVisible(true); 
        }
        
    }//GEN-LAST:event_nextMidActionPerformed

    private void nextHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextHardActionPerformed
        // Declare variables
        int lines = countLines("hard");
        String [] hardQ = take(lines, "hard");
        String [] hardA = take(lines, "hardAns");
        int [] hardAnswers = new int [hardA.length];
        boolean [] bool = new boolean [hardA.length];
        // For loop to conver to int
        for (int i = 0; i < hardAnswers.length;i++){
            hardAnswers[i] = Integer.parseInt(hardA[i]);
            if(hardAnswers[i] == 0){ // Convert to boolean
                bool[i] = true;
            } else {
                bool[i] = false;
            }
        }
        // Instiantiate hardQuestions
        for (int i = 0; i<hardQ.length;i++){
            Answers answer = new Answers(bool[i]);
            hardQuestions[i] = new Hard(answer, (i + 1), hardQ[i]);
        }
        // Prevent out of index
        if (hardCount < hardQuestions.length - 1){
            // Increases counter
            questionNum++;
              qq.setText("Question " + questionNum);
            hardCount++;
            header.setText("<html>" + hardQuestions[hardCount].getQuestion() + "<html>"); // Set text 
           
        } else {
            header.setText("No more hard!"); // Done msg
        }
        // Set detection to true
        detectHard = true;
        allow = true;
        // End at 10 questions
        if (questionNum == 10){
            nextMid.setVisible(false);
            nextEasy.setVisible(false);
            nextHard.setVisible(false);
            feed.setVisible(true); 
        }
    }//GEN-LAST:event_nextHardActionPerformed

    private void feedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedActionPerformed
        new feedback().setVisible(true); // Set as visible
        this.setVisible(false); // Set as not visible
    }//GEN-LAST:event_feedActionPerformed

    /**
     * Counts line in file
     * @return lineCount
     */
    private int countLines(String filename){
        // Declare Variables
        int lineCount = 0;
        // Try catch
        try {
            // Loop through data.txt if there is a next line
            Scanner fileInput = new Scanner(new File(filename));
            while (fileInput.hasNextLine()){
                fileInput.nextLine();
                lineCount++; // Add one to counter
            }
            fileInput.close(); // Close scanner
           
        } catch(IOException e){
            System.out.print("Java Exception" + e);
        }
        return lineCount; // Return lineCount
    }
    /**
     * Take questions from file
     * @param lineCount This creates the array size
     * @return questions This holds the questions in an array
     */
    private String [] take(int lineCount, String filename){
        // Declare Variables
        int count = 0;
        String [] Q = new String [lineCount];
        // Try catch
         try{
             // Loop through data.txt and store questions
            Scanner fileInput = new Scanner(new File(filename));
            while(fileInput.hasNext()){
                String output = fileInput.nextLine();
                // Store values
                Q[count] = output;
                count++; // Add to counter
            }
        } catch (IOException e){
            System.err.println("Java Exception: " + e);
        } catch (StringIndexOutOfBoundsException p) {
            System.err.println("Java Exception: " + p);
        }

        return Q; // Return array
    }

    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fake;
    private javax.swing.JButton feed;
    private javax.swing.JLabel feedback;
    private javax.swing.JLabel header;
    private javax.swing.JTextField ifcorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextEasy;
    private javax.swing.JButton nextHard;
    private javax.swing.JButton nextMid;
    private javax.swing.JTextField point;
    private javax.swing.JLabel qq;
    private javax.swing.JButton real;
    // End of variables declaration//GEN-END:variables
}
