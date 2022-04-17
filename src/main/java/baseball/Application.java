package baseball;

import baseball.domain.Game;

public class Application {
    public static void main(String[] args) {
        boolean isPlay = true;

        while(isPlay) {
            Game game = new Game();
            isPlay = game.start();
        }
    }
}
