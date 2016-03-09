package dcll.akac;

/**
 * Created by rottanaly on 3/8/16.
 */
public class Frame {
    private int firstTry = 0; // score de preimier essai
    private int secondTry = 0; // score de deuxieme essai

    /* Constructeur */
    public Frame(final int a, final int b) {
        firstTry = a;
        secondTry = b;
    }

    /* Acceder au score de premier essai */
    int getFirstScore() {
        return firstTry;
    }

    /* Score totale de chaque frame */
    int getTotalScore(){
        return firstTry + secondTry;
    }

    int getStatus() {
        if(getFirstScore()==10) {
            return 2; // strike
        }
        if(getTotalScore()==10) {
            return 1; // spare
        }
        return 0; // normal
    }
}
