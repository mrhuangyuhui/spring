package com.smart.ditype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class TestDiType {
    private ApplicationContext context = null;
    private static String[] CONFIG_FILES = {"com/smart/ditype/beans.xml"};

    @BeforeClass
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testBoss() {
        Boss boss = context.getBean("boss", Boss.class);
        assertNotNull(boss);
        System.out.println(boss);
    }
}
