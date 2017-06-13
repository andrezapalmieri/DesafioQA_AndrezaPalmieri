package Paginas;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home{
	
	WebDriver driver;
	
	By linkLogin = By.id("lnkCadastreSe"); 
	By menuInformatica = By.xpath(".//*[@id='navbar-collapse']/div/nav/ul/li[2]/a"); 
	By produtos = By.xpath("//div[contains(@class, 'lista-produto')]/ul/li");

	
	
	public Home(WebDriver driver){

        this.driver = driver;

    }
	
	public void AbrirPaginaLogin()
	{
		driver.findElement(linkLogin).click();
	} 
	
	public void ClicarMenuInformatica()
	{
		driver.findElement(menuInformatica).click();
	} 
	
	public void SelecionarProduto()
	{
		Random rand = new Random();
		List<WebElement> todosProdutos = driver.findElements(produtos); 
		int randomValor = rand.nextInt(todosProdutos.size()); 
		todosProdutos.get(randomValor).click();
	} 


}
