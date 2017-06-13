package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class DetalheProduto{
	
	WebDriver driver;

	By infoProduto = By.id("ctl00_Conteudo_869"); 
	By botaoComprar = By.id("btnAdicionarCarrinho"); 
	By botaoContinuar = By.className("continue-button"); 
	
	public DetalheProduto(WebDriver driver){

        this.driver = driver;
    }
	
	public void VerificarExibicaoInfoProduto()
	{
		assertTrue(driver.findElement(infoProduto).isDisplayed());
	} 
	
	public void ClicarBotaoComprar()
	{
		driver.findElement(botaoComprar).click();
	} 
	
	public void ClicarBotaoContinuar() 
	{
		try
		{
			driver.findElement(botaoContinuar).click();
		}
		catch (Exception e) {
			
		}

	}
	
}
