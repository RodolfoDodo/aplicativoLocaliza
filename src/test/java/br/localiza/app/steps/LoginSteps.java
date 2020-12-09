package br.localiza.app.steps;

import br.localiza.app.page.LoginPage;
import br.localiza.app.runners.BaseTest;
import io.cucumber.java.en.Given;

public class LoginSteps extends BaseTest {

	private LoginPage login = new LoginPage();
	

	@Given("que acesso o aplicativo")
	public void queAcessoOAplicativo() {
		login.with("110508", "3487");
		gerarScreenShot();
	}
	
	

}
