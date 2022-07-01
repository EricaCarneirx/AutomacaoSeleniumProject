package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

public class HomeSteps {
	private HomePage homePage = new HomePage();
	
	@Dado("^que acesso a página principal do e-commerce \"(.*?)\"$")
	public void acessarPaginaPrincipal(String url) {
		homePage.acessarPaginaPrincipal(url);
		
}
	@Quando("^é realizado uma pesquisa de um produto \"(.*?)\"$")
	public void pesquisarProduto(String produto) {
		pesquisarProduto(produto);
	}

}
