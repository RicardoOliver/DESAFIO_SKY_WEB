package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import funcionalidades.Funcionalidades;
import utils.Enum.Status;
import utils.NavegadorFabrica;
import utils.ReportExtentReports;

public class stepDefinitions {

    WebDriver driver;
    Funcionalidades func = new Funcionalidades();

    @Dado("que tenha acessado a tela do site")
    public void que_tenha_acessado_a_tela_site() {
        try {
            func.acessarTela();
            ReportExtentReports.adicionarLog(Status.PASS,"Dado que tenha acessado a tela do site", true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }
    @E("devo clicar no link de programacao")
    public void devo_clicar_no_link_de_programacao() {
        try {
            func.clicarNoLinkProgramacao();
            ReportExtentReports.adicionarLog(Status.PASS,"E devo clicar no link de programação", true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }
    @Quando("eu selecionar a programacao que estiver passando na hora")
    public void selecionar_a_programacao_que_estiver_passando_na_hora() {
        try {
            func.selecionarProgramacao();
            ReportExtentReports.adicionarLog(Status.PASS,"Quando eu selecionar a programacao que estiver passando na hora", true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }
    @Entao("validar se o texto e a hora que aparecem na programacao é o mesmo que aparece no modal")
    public void validar_se_o_texto_e_a_hora_que_aparecem_na_programacao_e_o_mesmo_que_aparece_no_modal() {
        try {
            func.validarPopUpdaProgramacao();
            ReportExtentReports.adicionarLog(Status.PASS,"Entao eu selecionar a programacao que estiver passando na hora", true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }
    @E("devo clicar em fechar o modal")
    public void devo_clicar_em_fechar_o_modal() {
        try {
            func.fecharPopUp();
            ReportExtentReports.adicionarLog(Status.PASS,"E devo clicar em fechar o modal", true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }
    @Before
    public static void adicionarTesteNoReport(Scenario scenario) {
        String nomeTeste = scenario.getName();
        ReportExtentReports.adicionarTeste("SKY WEB", nomeTeste);
    }
    @After
    public static void finalizarTesteNoReport() {
        ReportExtentReports.finalizarTeste();
        NavegadorFabrica.fecharNavegador();
    }
}
