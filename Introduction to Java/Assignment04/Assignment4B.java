package assignment4b;

/**
 *
 * @author Marie
 * This program displays both the average test score and the student's letter grade.
 */
public class Assignment4B {

    
    public static void main(String[] args) {
        // I assume that scores of tests and average score are double variables.
        double score1 = 48.6, score2 = 94, score3 = 78.5, average_score;
        
        // This counts average score.
        average_score = (score1 + score2 + score3)/3; 
        
        /* This defines round_average_score that rounds average score to integer value. 
        That is because mark is not defined for scores between 64 and 65, 69 and 70, 79 and 80, 89 and 90. */
        int round_average_score = (int) Math.round(average_score);
        
        // This decides which mark student gets. Decision is based on round_average_score.
        if (90 <= round_average_score && round_average_score <= 100){
            System.out.println("Your average score is " + average_score + ". Your grade is A.");
        }
        else if (80 <= round_average_score && round_average_score <= 89){
            System.out.println("Your average score is " + average_score + ". Your grade is B.");
        }
        else if (70 <= round_average_score && round_average_score <= 79){
            System.out.println("Your average score is " + average_score + ". Your grade is C.");
        }
        else if (65 <= round_average_score && round_average_score <= 69){
            System.out.println("Your average score is " + average_score + ". Your grade is D.");
        }   
        else if (0 <= round_average_score && round_average_score <= 64){
            System.out.println("Your average score is " + average_score + ". Your grade is F.");
        }       
        else{
            System.out.println("Your scores of tests are invalid.");
        }

    }
    
}
