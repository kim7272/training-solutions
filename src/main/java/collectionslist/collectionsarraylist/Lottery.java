package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int lotteryType;
    private int ballCount;

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){

        if (ballCount <= lotteryType){
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> balls = new ArrayList<>();
        List<Integer> winningNumbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < ballCount; i++){
            balls.add(rand.nextInt(ballCount)+1);
        }

        for (int i = 0; i < lotteryType; i++){
            winningNumbers.add(balls.get(i));
        }

        Collections.sort(winningNumbers);

        return winningNumbers;

    }

}
