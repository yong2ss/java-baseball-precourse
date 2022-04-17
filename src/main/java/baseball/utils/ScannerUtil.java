package baseball.utils;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public final class ScannerUtil {

    public static final String INPUT_NUMBER_TEXT = "숫자를 입력해주세요 : ";
    public static final String GAME_CLEAR_TEXT = "3개의 숫자를 모두 맞히셨습니다! 게임종료";
    public static final String GAME_RESTART_TEXT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String inputNumber() {
        String inputString = "";
        int inputNumber;
        System.out.print(INPUT_NUMBER_TEXT);
        inputString = Console.readLine();

        if(!inputValid(inputString)) {
            throw new IllegalArgumentException();
        }

        return inputString;
    }

    public static String gameClear() {
        String inputString = "";
        System.out.println(GAME_CLEAR_TEXT);
        System.out.println(GAME_RESTART_TEXT);
        inputString = Console.readLine();

        if(!Arrays.asList("1","2").contains(inputString)) {
            throw new IllegalArgumentException();
        }

        return inputString;
    }

    private static boolean inputValid(String inputString) {
        if(inputString.length() != 3)
            return false;

        try {
            Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
