package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class collection2 {
    public static void main(String[] args) {
        // 1 ~ 45까지 에서 6개의 숫자를 중복되지 않게 Set을 활용하여 추출 하시오.
        Random random = new Random();
        Set<Integer> RandomNumber = new HashSet<Integer>();

        while (RandomNumber.size() < 6) {
            RandomNumber.add(random.nextInt(45) + 1);
        }

        System.out.println(RandomNumber);
    }
}
