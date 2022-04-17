package baseball.domain;

public class PlayResult {
    private int strikeCount;
    private int ballCount;

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void calculation(Balls balls) {
        for(Ball ball : balls.getBalls()) {
            scoreCount(ball);
        }
    }

    private void scoreCount(Ball ball) {
        if(BallStatus.STRIKE.equals(ball.getBallStatus()))
            strikeCount++;
        if(BallStatus.BALL.equals(ball.getBallStatus()))
            ballCount++;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        if(strikeCount + ballCount == 0) {
            sb.append("낫싱");
            return sb.toString();
        }

        if(ballCount > 0) {
            sb.append(ballCount + "볼 ");
        }

        if(strikeCount > 0) {
            sb.append(strikeCount + "스트라이크");
        }

        return sb.toString().trim();
    }
}
