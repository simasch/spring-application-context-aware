package ch.martinelli.demo.applicationcontextaware;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest(properties = "foo=bar")
class ATest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ATest.class);

    @Autowired
    private SomeBean someBean;
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void test() {
        LOGGER.info("ATest");

        assertSame(applicationContext, ApplicationContextHolder.getApplicationContext());

        new SomeClass().foo();
        someBean.bar();
    }

}
