package singleton;


import org.junit.*;

public class EagerSingletonPrinterTest {


    @Test
    public void testOnlyOneInstanceCreated() {
        EagerSingletonPrinter eagerSingletonPrinter = EagerSingletonPrinter.getInstance();
        EagerSingletonPrinter eagerSingletonPrinter1 = EagerSingletonPrinter.getInstance();
        EagerSingletonPrinter eagerSingletonPrinter2 = EagerSingletonPrinter.getInstance();
        Assert.assertEquals(eagerSingletonPrinter,eagerSingletonPrinter1);
        Assert.assertEquals(eagerSingletonPrinter,eagerSingletonPrinter2);
        Assert.assertEquals(eagerSingletonPrinter1,eagerSingletonPrinter1);
    }
}