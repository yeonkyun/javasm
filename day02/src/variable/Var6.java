package variable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Var6 {
    public static void main(String[] args) {
        String str = "jungyk411@sunmoon.ac.kr";

        // 0. 메일 주소 출력
        System.out.println(str);

        // 1. 전체 스트링 길이 출력 (length())
        int length = str.length();

        // 2. 메일의 아이디만 출력 (substring())
        System.out.println(str.substring(0, str.indexOf("@")));

        // 3. 메일의 도메인만 출력 (substring())
        System.out.println(str.substring(str.indexOf("@") + 1, str.indexOf(".")));

        // 4. 도메인 주소를 (sunmoon.ac.kr) char array로 만들어 각 char 출력
        char[] domain = str.substring(str.indexOf("@") + 1).toCharArray();
        System.out.println(Arrays.toString(domain));

        // 5. 도메인 주소를 (sunmoon.ac.kr) -> (mail.sunmoon.ac.kr)로 변경하여 출력
        System.out.println("mail." + str.substring(str.indexOf("@") + 1));
    }
}
