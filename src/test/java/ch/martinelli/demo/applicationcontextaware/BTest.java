package ch.martinelli.demo.applicationcontextaware;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest
class BTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BTest.class);

    @Autowired
    private SomeBean someBean;

    @Test
    void test() {
        LOGGER.info("BTest");

        new SomeClass().foo();
        someBean.bar();
    }

}
