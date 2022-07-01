package pages;

import java.io.File;

import core.DriverFactory;
import io.cucumber.java.pt.Dado;
import maps.HomeMaps;

public class HomePage extends BasePage {
	
	private HomeMaps homeMaps = new HomeMaps();
	private String produto = new String();	
	public void acessarPaginaPrincipal(String url) {
		navigate(url);
	}
	
	public void pesquisarProduto(String produto) {
		this.produto = produto;
		sendKeys(homeMaps.searchProductInput, produto);
		click(homeMaps.submitSearchButton);
	}
	
}