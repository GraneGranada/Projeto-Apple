package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", glue = "steps", tags = "@testes", monochrome = true,
		dryRun = false, //true para planejar | false para executar		
		plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"}, snippets = SnippetType.CAMELCASE		
		)

public class Executa extends Drivers {
	
	public static void abrirNavegador() {
		
		boolean headless = false; //com true não abre o navegador | false abre o navegador
		WebDriverManager.chromedriver().setup(); // substitui a System.setProperty()
		ChromeOptions chromeOptions = new ChromeOptions();
		if(headless) {
		chromeOptions.addArguments("--headless");
		}
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.apple.com/");
		
	}
	

}
