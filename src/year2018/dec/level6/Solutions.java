package year2018.dec.level6;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static year2018.dec.level6.KtSolutionsKt.*;

/**
 * @author Almas Baimagambetov
 */
public class Solutions implements Codefest {
    @Override
    public int challenge1 (String s) {
        return ktchallenge1(s);
    }

    @Override
    public int[] challenge2 (int[] array, int a) {
        return ktchallenge2(array, a);
    }

    @Override
    public int challenge3 (int[] array1, int[] array2) {
        return ktchallenge3(array1, array2);
    }

    // TODO("Since JavaFX is not included in Java 11, I need to call this in. Will complete soon")
    @Override
    public <T> T challenge4 (Class<T> c, double a, double b) {
//        Constructor<?>[] con = c.getDeclaredConstructors();
//
//        for (Constructor f : con) {
//            try {
//                T temp = (T) f.newInstance(a, b);
//                return temp;
//            } catch (Throwable re) {
//
//            }
//        }
//        return null;

        return ktchallenge4(c, a, b);

    }

    @Override
    public int challenge5 (String s, int a) {
        return ktchallenge5(s, a);
    }
}
