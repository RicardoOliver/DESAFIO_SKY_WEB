package pageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Object extends Page{
    public Object(WebDriver driver) {
        super(driver);
    }

    public void clickPopUpInicio() throws InterruptedException {
        Thread.sleep(3000);
        popUpBemVindo.click();
    }

    public void clickLinkProgramacao() throws InterruptedException {
        Thread.sleep(3000);
        linkprogramacao.click();
    }


    public void Programacao() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,1200)", "");

        for(int i =0;i<=45;i++){
            XPATHBTNLEFT.click();
        }

        programacao.click();

    }


    public Boolean validarPopUp(){
       return  validarProgramacao.isDisplayed();
    }

    public void closePopUp() throws InterruptedException {
        Thread.sleep(3000);
        fecharPopUp.click();
    }
}
