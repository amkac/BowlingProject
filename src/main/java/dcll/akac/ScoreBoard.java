package dcll.akac;

import java.util.ArrayList;


/**
 * Created by rottanaly on 3/8/16.
 */
public class ScoreBoard {
    /**
     * calcul de score.
     * @param allFrame un tableau de frame
     * @return le score totale
     */
    public final int calculateScore(final ArrayList<Frame> allFrame) {
        int totalScore = 0;
        final int maxFrame = 12;
        final int frame = 10;

        int[] tempBoard = new int[maxFrame];
        for (int i = 0; i < maxFrame; i++) {
            // tempBoard: un taleau qui contient le score temporaire
            // allFrame.get(i) va retourner la Frame i
            tempBoard[i] = allFrame.get(i).getTotalScore();
        }
        for (int i = 0; i < frame; i++) {
            // Cas "Strike"
            if (allFrame.get(i).getStatus() == 2) {
                // Total score = Score courant + les deux prochaines scores
                totalScore += tempBoard[i] + tempBoard[i + 1];
                /** Cas le prochain Frame est Strike
                 * on doit ajouter encore d'autre Score
                 */
                if (allFrame.get(i + 1).getStatus() == 2) {
                    totalScore += allFrame.get(i + 2).getFirstScore();
                }
            } else if (allFrame.get(i).getStatus() == 1) {
                // cas de spare
                int nextScore = allFrame.get(i + 1).getFirstScore();
                totalScore += tempBoard[i] + nextScore;
            } else {
                //cas normal
                totalScore += tempBoard[i];
            }
        }
        return totalScore;
    }
}
