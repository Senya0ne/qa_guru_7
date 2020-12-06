import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    @Test
    public void openPage() {
        open("https://selenide.org");
        $("body").shouldHave(text("What is Selenide?"));

    }
}
