package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	By email = By.id("Email");
	By senha = By.id("Senha");
	By continuar = By.id("btnClienteLogin");
	
	public Login(WebDriver driver){

        this.driver = driver;

    }
	
	public void EfetuarLogin(String preencheEmail, String preencheSenha)
	{
		driver.findElement(email).sendKeys(preencheEmail);
		driver.findElement(senha).sendKeys(preencheSenha);
		driver.findElement(continuar).click();
	} 

}
