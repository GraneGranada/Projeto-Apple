package pages;

import org.openqa.selenium.By;

import drivers.Drivers;

public class MetodosMacPage extends Drivers {
	
public void selecionarTamanho(String tamanho) {
		
		driver.findElement(By.xpath("//span[text()='"+tamanho+"-inch']")).click();	
	}

}
