package baseball.domain;

import java.util.Objects;

public class Ball {
    private int number;
    private int position;
    private BallStatus ballStatus;

    public Ball(int number, int position) {
        if(!validation(number, position)) {
            throw new IllegalArgumentException();
        }
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public int getPosition() {
        return position;
    }

    public BallStatus getBallStatus() {
        return ballStatus;
    }

    private boolean validation (int number, int position) {
        if(number < 1 || number > 9)
            return false;

        if(position < 0 || position > 2)
            return false;

        return true;
    }

    public void calculation(Balls balls) {
        //스트라이크인가?
        if(isStrike(balls)) {
            this.ballStatus = BallStatus.STRIKE;
            return;
        }

        //볼인가?
        if(isBall(balls)) {
            this.ballStatus = BallStatus.BALL;
            return;
        }

        //낫띵
        this.ballStatus = BallStatus.NOTHING;

    }

    private boolean isBall (Balls balls) {
        for (Ball ball : balls.getBalls()) {
            if(this.isBall(ball))
                return true;
        }
        return false;
    }

    private boolean isBall(Ball ball) {
        if(this.number == ball.getNumber()
            && this.number != ball.getPosition())
            return true;
        return false;
    }


    private boolean isStrike (Balls balls) {
        for (Ball ball : balls.getBalls()) {
            if(this.equals(ball))
                return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return number == ball.number && position == ball.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, position);
    }
}
