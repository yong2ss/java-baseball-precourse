package baseball.utils;

import java.util.ArrayList;
import java.util.List;

public final class IntegerUtil {

    public static List<Integer> integerToList(String numberStr) {
        List<Integer> list = new ArrayList<>();

        list.add(Integer.parseInt(numberStr.substring(0, 1)));
        list.add(Integer.parseInt(numberStr.substring(1, 2)));
        list.add(Integer.parseInt(numberStr.substring(2, 3)));

        return list;
    }
}
