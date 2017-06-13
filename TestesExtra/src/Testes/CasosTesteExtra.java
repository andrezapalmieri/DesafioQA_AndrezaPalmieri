package Testes;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Paginas.Home;
import Paginas.Login;
import Paginas.DetalheProduto;
import Paginas.Carrinho;

public class CasosTesteExtra {
	
	WebDriver driver;
	Login objLogin;
    Home objHome;
	DetalheProduto objDetalheProduto;
	Carrinho objCarrinho;

	
	@Before
	public void Iniciar()
	{
		driver = new ChromeDriver();
		driver.get("http://www.extra.com.br");
		driver.manage().window().maximize();
	}

	@Test
	public void TesteExtra() 
	{
		objHome = new Home(driver);
		objLogin = new Login(driver);
		objDetalheProduto = new DetalheProduto(driver);
		objCarrinho = new Carrinho(driver);
		
		//Realizar login
		objHome.AbrirPaginaLogin();
		objLogin.EfetuarLogin("andreza.palmieri@gmail.com", "220125");	
		
		//Selecionar produto
		objHome.ClicarMenuInformatica();
		objHome.SelecionarProduto();
		objDetalheProduto.VerificarExibicaoInfoProduto();
		objDetalheProduto.ClicarBotaoComprar();
		objDetalheProduto.ClicarBotaoContinuar();
		
		//Verificar produto no carrinho
		objCarrinho.VerificarExibicaoDoProdutoNoCarrinho();
		
		//Remover produto do carrinho
		objCarrinho.RemoverProdutoDoCarrinho();
		
		//Verificar mensagem de carrinho vazio
		objCarrinho.VerificarMensagemCarrinhoVazio();
		
		//Voltar para home e continuar comprando
		objCarrinho.ClicarBotaoContinuarComprando();
	}
	
	
	@After
	public void EncerrarTeste()
	{
		driver.quit();
	}

}
