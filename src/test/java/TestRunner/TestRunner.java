package TestRunner;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.ReportExtentReports;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources", tags = "@programacao",
        glue = "steps", monochrome = true, dryRun = false,strict = true)

public class TestRunner {
    @BeforeClass
    public static void iniciarReport() {
        ReportExtentReports.iniciarReport("target/evidencia/", "AutomacaoWEB");
        ReportExtentReports.adicionarSuiteTeste("SKY WEB" ,"Teste Web");
    }
    @AfterClass
    public static void finalizarReport() {
        ReportExtentReports.finalizarReport();
    }


}
