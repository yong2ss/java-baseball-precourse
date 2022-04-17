package baseball.domain;

public class PlayResult {
    int strikeCount;
    int ballCount;

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void calculator(Balls balls) {
        for(Ball ball : balls.getBalls()) {
            if(BallStatus.STRIKE.equals(ball.getBallStatus()))
                strikeCount++;

            if(BallStatus.BALL.equals(ball.getBallStatus()))
                ballCount++;
        }
    }
}
