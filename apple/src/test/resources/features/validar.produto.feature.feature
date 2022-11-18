@testes
Feature: Escolher modelo de Macbook
  Eu como usuario 
  Quero escolher um modelo de Macbook
  Para validar minhas informacoes

  @mac
  Scenario: Validar modelo MacBook
    Given que eu clico em Mac
    And clico em Macbook Pro
    And seleciono o modelo
    And seleciono o tamanho
    And seleciono a cor
    Then valido informacao de modelo escolhido
    And Inclusao na mala de compras
    
   @iphone
   Scenario: Validar modelo iphone
    Given que eu clico em iphone
    And clico em iphone
    And seleciono aparelho
    And seleciono a cor Gold
    And seleciono memoria
    And seleciono trade
    And seleciono opcao de pagamento
    And seleciono a transportadora
    And escolha protecao sem cobertura
    Then adiciono no carrinho
    And valido descricao
    

  
