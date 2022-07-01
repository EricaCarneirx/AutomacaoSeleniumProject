 #language: pt
@PesquisaProdutos
Funcionalidade: Pesquisa de produtos no e-commerce

  @CT01 @finalizados 
  Esquema do Cenario: pesquisa de produtos com sucesso
    Dado que acesso a página principal do e-commerce "http://automationpractice.com/index.php"
    Quando é realizado uma pesquisa de um produto <produto>
    Então deve ser exibido o produto
    E deve ser exibido com o preço correto <preço>


    Exemplos: 
      | produto                       | preco |
      | "Faded Short Sleeve T-shirts" | "R$16.51"|
      | "Blouse"                      | "R$16.56"|
      | "Printed Dress"               | "R$16.12"|
 