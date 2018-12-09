import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BigNumberTest {

    @Test
    public void testAdd() {
        String add = BigNumber.bigNumberAdd(String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MAX_VALUE));
        System.out.println(String.valueOf(Integer.MAX_VALUE));
        System.out.println(add);
        String bigNumberSub = BigNumber.bigNumberSub("123", String.valueOf(Integer.MAX_VALUE));
        System.out.println(bigNumberSub);
    }
}