package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BallsTest {
    private Balls balls;
    private Balls comBalls;

    @BeforeEach
    void init() {
        balls = new Balls(new ArrayList<Integer>(){{
            add(1);
            add(8);
            add(9);
        }});
        comBalls = new Balls(new ArrayList<Integer>(){{
            add(3);
            add(8);
            add(1);
        }});
    }

    @Test
    void play() {
        PlayResult playResult = balls.play(comBalls);
        assertThat(playResult.getStrikeCount()).isEqualTo(1);
        assertThat(playResult.getBallCount()).isEqualTo(1);
    }
}