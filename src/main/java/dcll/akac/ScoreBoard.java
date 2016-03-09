package dcll.akac;

import java.util.ArrayList;

/**
 * Created by rottanaly on 3/8/16.
 */
public class ScoreBoard {
    public int calculateScore(ArrayList<Frame> allFrame){
        int TotalScore = 0;

        int[] tempBoard = new int[12];
        for(int i = 0; i<12; i++)
        {
            // tempBoard: un taleau qui contient le score temporaire
            // allFrame.get(i) va retourner la Frame i
            tempBoard[i] = allFrame.get(i).getTotalScore();
        }
        for(int i = 0; i<10; i++) {
            // Cas "Strike"
            if(allFrame.get(i).getStatus()==2) {
                // Total score = Score courant + les deux prochaines scores
                TotalScore += tempBoard[i] + tempBoard[i+1];
                // Si le prochain Frame est Strike, on doit ajouter encore d'autre Score
                if(allFrame.get(i+1).getStatus() == 2){
                    TotalScore += allFrame.get(i+2).getFirstScore();
                }
            }
            // Cas "Spare"
            else if(allFrame.get(i).getStatus()==1) {
                TotalScore += tempBoard[i] + allFrame.get(i+1).getFirstScore();
            }
            // Cas "Normal"
            else {
                TotalScore += tempBoard[i];
            }
        }
        return TotalScore;
    }
}
