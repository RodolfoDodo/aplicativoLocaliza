package br.localiza.app.steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import br.localiza.app.page.LoginPage;
import br.localiza.app.runners.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;

public class Loginpage extends BaseTest {

	private LoginPage login = new LoginPage();
	

	@Given("que acesso o aplicativo")
	public void queAcessoOAplicativo() {
		login.with("110508", "3487");
	}

}
