package funcionalidades;
import org.openqa.selenium.WebDriver;
import utils.NavegadorFabrica;
import pageObjects.Object;
import utils.Enum.Navegador;
public class Funcionalidades {

    WebDriver driver;
    Object object;

    public void acessarTela() throws InterruptedException {
        NavegadorFabrica.configurarNavegador(Navegador.CHROME);
        driver = NavegadorFabrica.getDriver();
        NavegadorFabrica.maximizar();
        NavegadorFabrica.acessarPaginaWeb("http://www.sky.com.br/");
        object = new Object(driver);
        object.clickPopUpInicio();
    }


    public void clicarNoLinkProgramacao() throws InterruptedException {
        object.clickLinkProgramacao();
    }



    public void selecionarProgramacao() throws InterruptedException {
        object.Programacao();
    }


    public void validarPopUpdaProgramacao(){
        assert(object.validarPopUp());
    }


    public void fecharPopUp() throws InterruptedException {
        object.closePopUp();
    }

}
