package pageObject;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RegistrationFormTest {

    RegistrationFormPage registrationFormPage;

    @BeforeAll
    public static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    public void successfulFillRegistrationForm() {
        registrationFormPage = new RegistrationFormPage();

        registrationFormPage.openPage()
                .fillForm()
                .checkData();
    }

}
