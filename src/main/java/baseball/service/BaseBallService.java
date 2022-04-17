package baseball.service;

import baseball.domain.Game;

public class BaseBallService {
    public void gameStart() {
        boolean isPlay = true;

        while(isPlay) {
            Game game = new Game();
            isPlay = game.start();
        }
    }
}
