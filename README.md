# Conversor de Moedas em Java -  ALURA ONE

Neste projeto, você encontrará um Conversor de Moedas desenvolvido em Java, que utiliza a API da ExchangeRate-API para obter taxas de câmbio atualizadas dinamicamente. A aplicação oferece uma experiência interativa via console, permitindo ao usuário realizar conversões entre diversas moedas de forma prática e eficiente.

> Status do Projeto: :heavy_check_mark: (concluído)

## Configuração

Antes de iniciar, é necessário configurar uma API key da ExchangeRate-API como variável de ambiente no IntelliJ IDEA. Isso permite que a aplicação acesse as taxas de câmbio atualizadas.

Para configurar a variável de ambiente:
1. Abra o IntelliJ IDEA.
2. Vá para `Run` > `Edit Configurations...`.
3. Na janela de configurações, adicione `-my_exchange_rate_api_key=SUAPIKEYAQUI` nas `VM options`, substituindo `SUAPIKEYAQUI` pela sua API key.

## Instalação e Uso

1. Clone o repositório para sua máquina local.
2. Abra o projeto no IntelliJ IDEA.
3. Compile e execute a classe `Principal.java`.
4. Siga as instruções no console para realizar conversões de moeda.

## Exemplo de Uso

Após iniciar a aplicação, você será guiado por um menu interativo onde poderá escolher as moedas de conversão e o valor a ser convertido. As taxas de câmbio serão obtidas em tempo real através da ExchangeRate-API, garantindo precisão nas conversões.


## Histórico de Conversões

As conversões realizadas são registradas automaticamente e podem ser acessadas através da opção de exibir o histórico no menu.

## Demonstração em Vídeo

Assista ao vídeo demonstrativo do funcionamento do projeto no console:

[![Assista ao vídeo](https://img.youtube.com/vi/wb68ad9gIl4/0.jpg)](https://youtube.com/shorts/wb68ad9gIl4?feature=share)

No vídeo, você verá como realizar conversões de moeda, acessar o histórico de conversões e interagir com o menu interativo da aplicação.

## Contribuições e Licença

Este projeto está licenciado sob a Licença MIT. Contribuições são bem-vindas. Para contribuir, crie um fork do repositório e envie um pull request.
