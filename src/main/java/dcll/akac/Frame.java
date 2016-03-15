package dcll.akac;

/**
 * Created by rottanaly on 3/8/16.
 */
public class Frame {
    /**
     * score de preimier essai.
     */
    private int firstTry = 0;
    /**
     * score de deuxieme essai.
     */
    private int secondTry = 0;
    /**
     * Score maximum.
     */
    static final int MAX_SCORE = 10;
    /**
     * constructeur.
     * @param a the firstTry
     * @param b the secondTry
     */
    public Frame(final int a, final int b) {
        firstTry = a;
        secondTry = b;
    }

    /**
     * Acceder au score de premier essai.
     * @return firstTry
     */
    final int getFirstScore() {
        return firstTry;
    }

    /**
     * Score totale de chaque frame.
     * @return firstTry + secondTry
     */
    final int getTotalScore() {
        return firstTry + secondTry;
    }

    /**
     * retourner le status de la frame.
     * @return status
     */
    final int getStatus() {
        if (getFirstScore() == MAX_SCORE) {
            return 2; // strike
        }
        if (getTotalScore() == MAX_SCORE) {
            return 1; // spare
        }
        return 0; // normal
    }
}
