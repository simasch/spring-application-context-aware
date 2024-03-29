package ch.martinelli.demo.applicationcontextaware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeClass.class);

    public void foo() {
        LOGGER.info("foo(): {}", this);
        ApplicationContextHolder.getBean(SomeBean.class).bar();
    }
}
