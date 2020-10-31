# language: pt

  @programacao
  Funcionalidade: validar programação SKY
    Validar se o texto e a hora que aparecem na programação é o mesmo
    que aparece no modal

    Cenario: Validar texto e hora com sucesso
      Dado que tenha acessado a tela do site
      E devo clicar no link de programacao
      Quando eu selecionar a programacao que estiver passando na hora
      Entao validar se o texto e a hora que aparecem na programacao é o mesmo que aparece no modal
      E devo clicar em fechar o modal



