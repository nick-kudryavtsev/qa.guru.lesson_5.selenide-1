package homework;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryHWTest {

    @Test
    void shoudJUnitCodeExample(){
        open("https://github.com");

        $("[data-test-selector='nav-search-input']")
                .setValue("selenide")
                .pressEnter();
        $$("ul.repo-list .repo-list-item a")
                .first()
                .click();
        $("#wiki-tab").click();
        $("#wiki-body > div.markdown-body > ul:nth-child(3)")
                .shouldHave(
                        Condition.text("Soft assertions")
                );
        $("#wiki-body > div.markdown-body > ul:nth-child(3) > li:nth-child(7) > a").click();
        $("#wiki-body > div.markdown-body > h4:nth-child(18)")
                .shouldHave(
                        Condition.text("Using JUnit5 extend test class")
                );

        sleep(5000);
    }
}
