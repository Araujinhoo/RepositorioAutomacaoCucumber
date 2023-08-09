#language : pt

@tag
Funcionalidade: Testando Site Sauce

  @tag1
  Cenario: teste de login
    Dado que eu esteka na tela de login do site "https://www.saucedemo.com/"
    Quando preencho os campos com usuario e senha 
    E clico em login
    Entao devo logar no site com sucesso
   
