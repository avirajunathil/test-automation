package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {

    protected WebDriver driver;

    protected static ExplicitWait wait;

    protected static JavaScriptHelper js;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new ExplicitWait(driver);
        js = new JavaScriptHelper(driver);
        PageFactory.initElements(driver, this);
    }

    public static void click(WebElement webElement) {
        click(webElement, Timeouts.EXPLICIT);
    }

    public static void click(WebElement webElement, int timeOutInSeconds) {
        wait.forElementToBeClickable(webElement, timeOutInSeconds, Timeouts.POLLING_INTERVAL);
        js.clickElement(webElement);
    }

    public static void sendKeys(WebElement webElement, String value, int timeOutInSeconds) {
        click(webElement, timeOutInSeconds);
        webElement.clear();
        webElement.sendKeys(value);
    }

    public static void sendKeys(WebElement webElement, String value) {
        sendKeys(webElement, value, Timeouts.EXPLICIT);
    }

    public void executeJavascript(String string) {
        js.executeScript(string);
    }

    public void executeJavascript(String string, WebElement element) {
        js.executeScript(string, element);
    }

    public static void dropDownMethod(WebElement element, String option, String value)
    {
        Select s = new Select(element);
        if(option.equalsIgnoreCase("Value")){
            s.selectByValue(value);
        }

        else if(option.equalsIgnoreCase("VisibleText")){
            s.selectByVisibleText(value);}

            else if(option.equalsIgnoreCase("Index")){
                int i = Integer.parseInt(value);
                s.selectByIndex(i);
            }
    }

}
