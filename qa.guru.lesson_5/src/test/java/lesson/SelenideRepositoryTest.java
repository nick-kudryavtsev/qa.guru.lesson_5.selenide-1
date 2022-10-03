package lesson;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryTest {

    @Test
    void shouldFindSelenideAsRepository(){
        open("https://github.com/");

        //  1 доллар ищет 1 элемент
        $("[data-test-selector='nav-search-input']")
                .setValue("selenide")
                .pressEnter();

        //  2 доллара ищет коллекцию
        $$("ul.repo-list .repo-list-item a")
                .first()
                .click();

        $("span.author")
                .shouldHave(
                        Condition.text("selenide")
                );

        sleep(5000);

        //  arrange -подготовка
        //  act - действие
        //  assert - провер
    }

}
