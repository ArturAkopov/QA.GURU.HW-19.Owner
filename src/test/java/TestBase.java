import com.codeborne.selenide.Selenide;
import config.ProjectConfiguration;
import config.web.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    private static final WebConfig webConfig =
            ConfigFactory.create(
                    WebConfig.class,
                    System.getProperties()
            );

    @BeforeAll
    static void beforeAll() {
        ProjectConfiguration pConf = new ProjectConfiguration(webConfig);
        pConf.webConfig();
    }

    @AfterEach
    void closeWebDriver() {
        Selenide.closeWebDriver();
    }
}
