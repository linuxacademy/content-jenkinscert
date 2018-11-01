package launch;

import org.junit.Test;

import static org.junit.Assert.fail;

public class test1 {

    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }


}
