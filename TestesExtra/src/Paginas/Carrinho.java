package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;


public class Carrinho{
	
	WebDriver driver;
	
	By infoProdutoCarrinho = By.className("produto"); 
	By removerProduto = By.linkText("Remover"); 
	By mensagemCarrinhoVazio = By.className("innerCart");
	By botaoContinuarComprando = By.xpath(".//*[@id='body']/section/div[3]/a");
	
	public Carrinho(WebDriver driver){

        this.driver = driver;
    }
	
	public void VerificarExibicaoDoProdutoNoCarrinho()
	{		
		assertTrue(driver.findElement(infoProdutoCarrinho).isDisplayed());
	} 
	
	public void RemoverProdutoDoCarrinho()
	{
		driver.findElement(removerProduto).click();
	} 

	public void VerificarMensagemCarrinhoVazio()
	{		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemCarrinhoVazio));  
		assertTrue(driver.findElement(mensagemCarrinhoVazio).getText().contains("Não há produtos em seu carrinho"));
	} 
	
	public void ClicarBotaoContinuarComprando()
	{
		driver.findElement(botaoContinuarComprando).click();		
	}	
	
}