package com.ecfront.easybi.classscanner;

import com.ecfront.easybi.classscanner.exchange.ClassScanner;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Set;

public class ClassScannerTest {

    @Test
    public void test() throws Exception {
        Set<Class<?>> resultInFile = ClassScanner.scan("com.ecfront.easybi.classscanner.test", Deprecated.class);
        Assert.assertEquals(resultInFile.size(),2);
        Set<Class<?>> resultInJar = ClassScanner.scan("org.junit", "Before\\w*");
        Assert.assertEquals(resultInJar.size(),4);
    }

}
