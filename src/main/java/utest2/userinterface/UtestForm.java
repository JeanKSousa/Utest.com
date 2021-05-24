package utest2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestForm {
    public static final Target SIGNUP = Target.the("form to signup")
            .located(By.xpath("//a[contains(text(), 'Join Today')]"));
    public static final Target IMPUT_NAME = Target.the("write the firstname")
            .located(By.id("firstName"));
    public static final Target IMPUT_LASTNAME = Target.the("write the lastaname")
            .located(By.id("lastName"));
    public static final Target IMPUT_EMAIL = Target.the(" write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("select the birth month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("select the birth day")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("select the birth year")
            .located(By.id("birthYear"));
    public static final Target LANGUAGE = Target.the("write and select our language")
            .located(By.xpath("//div[@id='languages']//div[1]//input"));
    public static final Target NEXT = Target.the("button that shows us the next step")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a"));


    public static final Target CITY = Target.the("select the city")
            .located(By.id("city"));
    public static final Target POSTAL = Target.the("select the postal code")
            .located(By.id("zip"));
    public static final Target COUNTRY = Target.the("select the country")
            .located(By.xpath("//div[@class='ui-select']//div[1]//div[1]"));
    public static final Target INPUT_COUNTRY = Target.the("type the country")
            .located(By.xpath("//div[@class='ui-select']//div[1]//div[1]//input[1]"));
    public static final Target NEXT2 = Target.the("button that shows us the next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));

    public static final Target COMPUTER = Target.the("select the cumpter")
            .located(By.xpath("//div[@id='web-device']//div[1]//div[2]//div"));
    public static final Target INPUT_COMPUTER = Target.the("type the computer")
            .located(By.xpath("//div[@id='web-device']//div[1]//div[2]//div//input[1]"));
    public static final Target VERSION = Target.the("select the version")
            .located(By.xpath("//div[@id='web-device']//div[2]//div[2]//div"));
    public static final Target INPUT_VERSION = Target.the("type the version")
            .located(By.xpath("//div[@id='web-device']//div[2]//div[2]//div//input[1]"));
}

