import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;


public class GitHubTests extends TestBase {

    @Test
    void checkUrlGitHubTest() {
        open("");
        webdriver().shouldHave(currentFrameUrl("https://github.com/"));
    }
}
