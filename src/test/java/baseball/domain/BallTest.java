package baseball.domain;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class BallTest {
    private Ball ball;
    private Ball strikeBall;
    private Balls balls;

    @BeforeEach
    void init() {
        ball = new Ball(1,2);
        strikeBall = new Ball(8,1);
        balls = new Balls(new ArrayList<Integer>(){{
            add(1);
            add(8);
            add(9);
        }});
    }

    @Test
    void isBall() {
        assertThat(ball.isBall(balls)).isTrue();
    }

    @Test
    void isStrike() {
        assertThat(strikeBall.isStrike(balls)).isTrue();
    }

    @Test
    void calculation() {
        ball.calculation(balls);
        strikeBall.calculation(balls);

        assertThat(ball.getBallStatus()).isEqualTo(BallStatus.BALL);
        assertThat(strikeBall.getBallStatus()).isEqualTo(BallStatus.STRIKE);
    }
}