package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page {
    WebDriver driver;
    public Page(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(className = "close")
    WebElement popUpBemVindo;

    @FindBy(xpath = "//strong[contains(text(),'Programação')] ")
    WebElement linkprogramacao;

    //Mudar o titulo da programação aqui!
    @FindBy(xpath = "//h2[contains(text(),'Um Brinde ao Vinho')] ")
    WebElement programacao;

    @FindBy(xpath = "//div[@class='sky-modal-program-description'] ")
    WebElement validarProgramacao;


    @FindBy(xpath = "//span[contains(text(),'fechar')] ")
    WebElement fecharPopUp;

    @FindBy(xpath = "//button[@class='btn-prev btn-nav nav-left icon-arrow-left'] ")
    WebElement XPATHBTNLEFT;

}
