package guru.springframework;

import guru.springframework.controllers.MyController;
import guru.springframework.examplesbeans.FakeDataSource;
import guru.springframework.examplesbeans.FakeJmsBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {
    private final static Logger LOG = LoggerFactory.getLogger(DiDemoApplication.class);

    public static void main(String[] args) {
        LOG.info("...Starting application...");
        LOG.info("args: {}", args);

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());

        try {
            ctx.getBean("bla");
        } catch (Exception e) {
            LOG.error("Error", e);
        }
    }
}
