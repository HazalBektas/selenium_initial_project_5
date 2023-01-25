package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalLoginFormPage extends TechGlobalBasePage{

    public TechGlobalLoginFormPage(){
        super();
    }

    @FindBy(xpath = "//input[@id='username']/../..")

    public List<WebElement> form;
}
