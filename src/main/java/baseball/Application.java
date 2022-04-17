package baseball;

import baseball.service.BaseBallService;

public class Application {
    static final BaseBallService baseBallService = new BaseBallService();

    public static void main(String[] args) {
        baseBallService.gameStart();
    }
}
