package dcll.akac;

import java.util.ArrayList;

/**
 * Created by rottanaly on 3/8/16.
 */
public class ScoreBoard {
    public int calculateScore(ArrayList<Frame> allFrame){
        int TotalScore = 0;

        int[] tempBoard = new int[12];
        for(int i = 0; i<12; i++){
            tempBoard[i] = allFrame.get(i).getTotalScore();
        }
        for(int i = 0; i<10; i++){
            if(allFrame.get(i).getStatus()==2){
                if(allFrame.get(i+1).getStatus() != 2){
                    TotalScore += tempBoard[i] + tempBoard[i+1];
                }else{
                    TotalScore += tempBoard[i] + tempBoard[i+1] + allFrame.get(i+2).getFirstScore();
                }
            }else if(allFrame.get(i).getStatus()==1){
                TotalScore += tempBoard[i] + allFrame.get(i+1).getFirstScore();
            }else{
                TotalScore += tempBoard[i];
            }
        }
        return TotalScore;
    }
}
