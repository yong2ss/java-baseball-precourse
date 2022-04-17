package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class RandomNumberUtil {
    public static List<Integer> getRandomNumberList() {
        HashSet<Integer> numberSet = new HashSet<>();
        while(numberSet.size() < 3) {
            numberSet.add(Randoms.pickNumberInRange(1, 9));
        }

        ArrayList<Integer> numberList = new ArrayList<>(numberSet);
        Collections.shuffle(numberList);
        return numberList;
    }
}
