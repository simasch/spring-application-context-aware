package ch.martinelli.demo.applicationcontextaware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextHolder implements ApplicationContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextHolder.class);

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static <T> T getBean(Class<T> type) {
        LOGGER.info("applicationContext: {}", applicationContext);

        T bean = applicationContext.getBean(type);

        LOGGER.info("getBean: {}", bean);

        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        LOGGER.info("setApplicationContext: {}", applicationContext.getId());

        ApplicationContextHolder.applicationContext = applicationContext;
    }
}
