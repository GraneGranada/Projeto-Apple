package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import drivers.Drivers;

public class Metodos extends Drivers {
	
	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
		
	}
	
	
	
	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+n1+","+n2+")");
	}
	
	public void validarTexto() {
		assertEquals("Customize your 14‑inch MacBook Pro - Space Gray", "Customize your 14‑inch MacBook Pro - Space Gray");
		assertTrue("Customize your 14‑inch MacBook Pro - Space Gray", true);
		
	}
	
	public void fecharNavegador()throws Exception {
		TimeUnit.SECONDS.sleep(4);
		driver.quit();
	}

}
