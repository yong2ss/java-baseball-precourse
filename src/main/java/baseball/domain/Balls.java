package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    public List<Ball> balls;

    public Balls(List<Integer> numberList) {
        this.balls = numbersToBalls(numberList);
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public List<Ball> numbersToBalls(List<Integer> numbers) {
        List<Ball> ballList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            ballList.add(new Ball(numbers.get(i), i));
        }
        return ballList;
    }

    public PlayResult play(Balls gameBalls) {
        PlayResult playResult = new PlayResult();

        for (Ball ball : balls) {
            ball.calculation(gameBalls);
        }

        playResult.calculation(this);

        return playResult;
    }


}
