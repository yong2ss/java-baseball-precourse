package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class RandomNumberUtil {
    private static int MIN_NUMBER = 9;
    private static int MAX_NUMBER = 9;
    private static int MAX_COUNT = 3;

    public static List<Integer> getRandomNumberList() {
        HashSet<Integer> numberSet = new HashSet<>();
        while(numberSet.size() < MAX_COUNT) {
            numberSet.add(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
        }

        ArrayList<Integer> numberList = new ArrayList<>(numberSet);
        //Collections.shuffle(numberList);
        return numberList;
    }
}
