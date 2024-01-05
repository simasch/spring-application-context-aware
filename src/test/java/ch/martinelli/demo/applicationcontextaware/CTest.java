package ch.martinelli.demo.applicationcontextaware;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest(properties = "foo=bar")
class CTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CTest.class);

    @Autowired
    private SomeBean someBean;

    @Test
    void test() {
        LOGGER.info("CTest");

        new SomeClass().foo();
        someBean.bar();
    }

}
