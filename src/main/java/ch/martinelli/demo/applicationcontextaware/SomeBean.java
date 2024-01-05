package ch.martinelli.demo.applicationcontextaware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeBean.class);

    public SomeBean() {
        LOGGER.info("new: {}", this);
    }

    public void bar() {
        LOGGER.info("bar(): {}", this);
    }
}
