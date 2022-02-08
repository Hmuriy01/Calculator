package Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class arabskie {
    static String[] stringArray = new String[]{"10","1","2","3","4","5","6","7","8","9"};
    ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

    public boolean check(String a){
        return stringList.contains(a);
    }
}
