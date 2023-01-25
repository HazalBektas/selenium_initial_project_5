package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalFrontendHomePage  extends TechGlobalBasePage{

    public TechGlobalFrontendHomePage(){
        super();
    }
    @FindBy(css = "div[id^='card']")
    public List<WebElement> cards;

    public void getFrontendPage(){
        headerDropdown.click();
        headerDropdownOptions.get(0).click();
    }

    public void getCard(String nameOfCard){
        for (int i = 0; i < cards.size(); i++) {
            if(cards.get(i).getText().contains(nameOfCard)) {
                cards.get(i).click();
                break;
            }
        }
    }

    public void getCard(int index){
        for (int i = 0; i < cards.size(); i++) {
            if (i == index) cards.get(i).click();
            break;
        }
    }

}
