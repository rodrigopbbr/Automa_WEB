package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "txtUsername")
	private WebElement campoUsuario;
	
	@FindBy(id = "txtPassword")
	private WebElement campoSenha;
	
	@FindBy(id = "btnLogin")
	private WebElement botaoLogin;
	
	public void informarCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}
	
	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		acionarBotaoLogin();
	}

}
