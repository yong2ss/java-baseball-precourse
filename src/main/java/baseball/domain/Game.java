package baseball.domain;

import baseball.utils.IntegerUtil;
import baseball.utils.RandomNumberUtil;
import baseball.utils.ScannerUtil;

public class Game {
    private final Balls answer;
    private boolean isSuccess = false;

    public Game() {
        Balls balls = new Balls(RandomNumberUtil.getRandomNumberList());
        this.answer = balls;
    }

    public void play(Balls userBalls){
        PlayResult playResult = userBalls.play(answer);

        System.out.println(playResult.toString());

        if(playResult.getStrikeCount() == 3) {
            isSuccess = true;
        }
    }

    public boolean start() {
        String inputStr = "";

        while(!isSuccess) {
            inputStr = ScannerUtil.inputNumber();
            Balls userBalls = new Balls(IntegerUtil.integerToList(inputStr));
            play(userBalls);
        }

        inputStr = ScannerUtil.gameClear();
        if("1".equals(inputStr)){
            return true;
        }
        return false;
    }
}
