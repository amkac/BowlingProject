package dcll.akac;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by rottanaly on 3/8/16.
 */
public class ScoreBoardTest {

    @Test
    public void testCalculateScore() throws Exception {
        ArrayList<Frame> myScore = new ArrayList<Frame>();

        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(10, 0));
        ScoreBoard sb =  new ScoreBoard();
        int score = sb.calculateScore(myScore);
        assertEquals(score, 300);

        ArrayList<Frame> myScore1 = new ArrayList<Frame>();

        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(0, 0));

        int score1 = sb.calculateScore(myScore1);
        assertEquals(score1, 150);


        ArrayList<Frame> myScore2 = new ArrayList<Frame>();
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(0, 0));
        myScore2.add(new Frame(0, 0));

        int score2 = sb.calculateScore(myScore2);
        assertEquals(score2, 90);
        ArrayList<Frame> myScore3 = new ArrayList<Frame>();
        myScore3.add(new Frame(9, 0));
        myScore3.add(new Frame(9, 1));
        myScore3.add(new Frame(8, 2));
        myScore3.add(new Frame(9, 0));
        myScore3.add(new Frame(10, 0));
        myScore3.add(new Frame(7, 0));
        myScore3.add(new Frame(9, 0));
        myScore3.add(new Frame(10, 0));
        myScore3.add(new Frame(6, 4));
        myScore3.add(new Frame(3, 0));
        myScore3.add(new Frame(0, 0));
        myScore3.add(new Frame(0, 0));

        int score3 = sb.calculateScore(myScore3);
        assertEquals(score3, 124);
    }
}