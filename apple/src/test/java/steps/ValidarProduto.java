package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import metodos.Metodos;
import pages.ElementosIphonePage;
import pages.ElementosMacPage;
import pages.MetodosMacPage;
import runner.Executa;

public class ValidarProduto {

	MetodosMacPage mPage = new MetodosMacPage();
	Metodos metodo = new Metodos();
	ElementosMacPage elMacPage = new ElementosMacPage();
	ElementosIphonePage elIpage = new ElementosIphonePage();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();

	}

	@Given("que eu clico em Mac")
	public void queEuClicoEmMac() {
		metodo.clicar(elMacPage.mac);

	}

	@Given("clico em Macbook Pro")
	public void clicoEmMacbookPro() {
		metodo.clicar(elMacPage.macBook);

	}

	@Given("seleciono o modelo")
	public void selecionoOModelo() {
		 metodo.clicar(elMacPage.BuyProdutoPro13);
		

	}

	@Given("seleciono o tamanho")
	public void selecionoOTamanho() {
		mPage.selecionarTamanho("14");
		metodo.scroll(0, 500);

	}

	@Given("seleciono a cor")
	public void selecionoACor() {
		metodo.clicar(elMacPage.btnCor);
		metodo.scroll(0, 1000);
		metodo.clicar(elMacPage.btnSelect);

	}

	@Then("valido informacao de modelo escolhido")
	public void validoInformacaoDeModeloEscolhido() throws Exception {
		metodo.validarTexto();
		metodo.fecharNavegador();

	}

	@Then("Inclusao na mala de compras")
	public void inclusaoNaMalaDeCompras() {

	}

	// steps iphone

	@Given("que eu clico em iphone")
	public void queEuClicoEmIphone() {
		metodo.clicar(elIpage.btnIphone);

	}

	@Given("clico em iphone")
	public void clicoEmIphone() {
		metodo.clicar(elIpage.btnIP14);
		metodo.clicar(elIpage.btnBuy);

	}

	@Given("seleciono aparelho")
	public void selecionoAparelho() {
	metodo.clicar(elIpage.model);
	}

	@Given("seleciono a cor Gold")
	public void selecionoACorGold() {

		// metodo.clicar(elIpage.btnGold);

	}

	@Given("seleciono memoria")
	public void selecionoMemoria() {

	}

	@Given("seleciono trade")
	public void selecionoTrade() {

	}

	@Given("seleciono opcao de pagamento")
	public void selecionoOpcaoDePagamento() {

	}

	@Given("seleciono a transportadora")
	public void selecionoATransportadora() {

	}

	@Given("escolha protecao sem cobertura")
	public void escolhaProtecaoSemCobertura() {

	}

	@Then("adiciono no carrinho")
	public void adicionoNoCarrinho() {

	}

	@Then("valido descricao")
	public void validoDescricao() {

	}

}
