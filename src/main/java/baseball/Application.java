package baseball;

import baseball.domain.Game;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        // 입력
        boolean isPlay = true;

        while(isPlay) {
            Game game = new Game();
            isPlay = game.start();
        }
    }
}
