# DIO-Projeto-Java-1
# Conta Bancária em Terminal - Simulação de Operações Bancárias

Este projeto em Java implementa um sistema simples para simular operações bancárias em um terminal. O programa coleta informações básicas da conta de um usuário, exibe essas informações e permite que o usuário realize operações como depósitos e saques. Ele também lida com entradas inválidas e oferece uma experiência de repetição até que o usuário escolha uma operação válida ou opte por sair do programa.

# Descrição Geral

O programa inicia solicitando ao usuário informações sobre sua conta bancária, como nome, sobrenome, saldo inicial, número da agência e número da conta. Essas informações são exibidas ao usuário de forma clara, simulando a apresentação de um extrato bancário. Após isso, o programa oferece a opção de realizar operações de depósito ou saque. Caso o usuário insira um número inválido, o programa informa que a operação é inválida e solicita novamente a escolha de uma operação, mantendo o fluxo de interação até que uma escolha válida seja feita.

# Funcionamento do Programa

O programa é dividido nas seguintes etapas principais:

Solicitação de informações básicas do usuário, como nome, sobrenome, saldo inicial, número da agência e número da conta.

Apresentação das informações coletadas de forma estruturada.

Exibição de um menu de operações disponíveis:

Depósito (opção 1).

Saque (opção 2).

Caso o usuário insira qualquer outro valor, uma mensagem de "Operação inválida" será exibida, e ele será solicitado a escolher novamente até que insira uma opção válida.

Implementação das operações de depósito e saque, com atualização e exibição do saldo após cada operação.

Como Executar

Certifique-se de ter o JDK instalado na sua máquina.

Compile o código-fonte usando o comando javac ContaTerminal.java no terminal.

Execute o programa com o comando java ContaTerminal.

Siga as instruções exibidas no terminal para interagir com o programa.

# Melhorias Futuras

Implementação de uma interface gráfica para tornar o programa mais amigável e visual.

Adição de autenticação por senha para simular maior segurança.

Criação de uma classe separada para gerenciar as operações bancárias, seguindo os princípios de Orientação a Objetos.

Implementação de testes automatizados para garantir a confiabilidade do sistema.

# Conclusão

Este programa serve como um exemplo prático e educativo de como implementar um sistema simples de gerenciamento bancário em Java. Ele oferece uma base sólida para o aprendizado de conceitos fundamentais de programação, como entrada de dados, controle de fluxo e manipulação de variáveis. O código é facilmente extensível, permitindo a adição de novas funcionalidades e refinamentos no futuro.
