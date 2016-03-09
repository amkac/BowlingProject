package dcll.akac;

/**
 * Created by rottanaly on 3/8/16.
 */
public class Frame {
    public int firstTry = 0;
    public int secondTry = 0;

    public Frame(int a, int b){
        firstTry = a;
        secondTry = b;
    }

    int getFirstScore(){
        return firstTry;
    }

    int getTotalScore(){
        return firstTry + secondTry;
    }

    int getStatus(){
        if(getFirstScore()==10){
            return 2; // strike
        }
        if(getTotalScore()==10){
            return 1; // spare
        }
        return 0; // normal
    }
}
