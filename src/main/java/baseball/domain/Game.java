package baseball.domain;

import baseball.utils.RandomNumber;
import camp.nextstep.edu.missionutils.*;

public class Game {
    private final Balls answer;
    private boolean isSuccess = false;

    public Game() {
        Balls balls = new Balls(RandomNumber.getRandomNumberList());
        this.answer = balls;
    }

    public boolean play(Balls userBalls){
        PlayResult playResult = userBalls.play(answer);

        if(playResult.getStrikeCount() == 3) {
            isSuccess = true;
            return true;
        }

        return false;
    }

    public boolean start() {
        //TODO 숫자입력
        Console.readLine();

        //TODO while play
        while(isSuccess) {

        }

        //TODO 계속 하시겠습니까? -> return t/f
        return false;
    }
}
