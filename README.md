
<h2 align="center"> EXERCÍCIOS INTERFACE OOP - AULA 28</h2>
<hr>

## Exercício 1:

### **_Lógica implementada:_**

## Interface Lampada:

<li> Possui métodos do tipo String ligar() e desligar() como solicitado</li>

## Classe FabricaLampada:

<li> Possui método estático construir(int decisao) que espera um valor int no parâmetro</li>
<li> Criei as classes Fluorescente e Incandescente que implementam o meu contrato da interface</li>
<li> Sobreescrevi os métodos Ligar e Desligar e imprimi "ligada" e "desligada"</li>
<li> Foi gerado uma estruta de decisão (Switch) que traça o destino do meu sistema.</li>
<li> Para caso 1: um objeto do tipo Incandescente é criado e retorna uma mensagem, junto aos métodos ligar() e desligar()</li>
<li> Para caso 2: um objeto do tipo Fluorescente é criado e retorna uma mensagem, junto aos métodos ligar() e desligar()</li>
<li> Para default: retorna uma mensagem "Não foi possível gerar uma Lâmpada"</li>

## Classe Fluorescente:

<li> Recebe contrato da interface Lampada</li>
<li> Possui os métodos ligar() e desligar() sobreescritos com a mensagem "Lâmpada ligada" e "Lâmpada desligada"</li>

## Classe Incandescente

<li> Recebe contrato da interface Lampada</li>
<li> Possui os métodos ligar() e desligar() sobreescritos com a mensagem "Lâmpada ligada" e "Lâmpada desligada"</li>


## Classe Exercicio01


<li> Possui método main </li>
<li> Possui Scanner declarado </li>
<li> Possui saída de dados para captar a decisão do usuário</li>
<li> O programa recebe a entrada do usuário pelo scanner, chama o método construir (que espera um parâmetro) que vem da classe FabricaLampada e exibe os retornos através da saída de dados</li>

<hr>

## Exercício 2:

### **_Lógica implementada:_**

## Interface CalculoTributos:

<li> Possui o método "calcularTributo()" do tipo double </li>

## Classe Conta

<li> Contém um atributo "protected double saldo" </li>
<li> Método Construtor com this.saldo recebendo o valor de 1000 para conseguir manipular o atributo saldo</li>
<li> Método do tipo double chamado "decisao()" que exibe o meu saldo atual (1000), possui uma estrutura de decisão (Switch) que espera a resposta do usuário, no caso, 1, 2 ou 3, para decidir qual destino do meu sistema</li>
<li> Para caso 1: um objeto do tipo ContaPP chamado accP é criado e retorna accP.getSaldo(), para exibir o saldo atual da conta poupança do usuário</li>
<li> Para caso 2: um objeto do tipo ContaCC chamado accC é criado e retorna accC.calcularTributo(), para executar o método que realiza o cálculo de conta corrente</li>
<li> Para caso 3: um objeto do tipo SeguroDeVida chamado seguro é criado e retorna seguro.calcularTributo(), para executar o método que realiza o cálculo do seguro de vida</li>
<li> Para default: há uma saída de dados dizendo "Inválido", simulando que a entrada de dados do usuário não corresponde com o esperado</li>

## Classe ContaPP

<li> É extends de Conta, porque iremos fazer uso do atributo saldo</li>
<li> Possui o método getSaldo() que exibe a mensagem "Seu saldo atual é R$" e retorna saldo, para que o usuário possa ver qual o saldo atual da conta Poupança dele. </li>

## Classe ContaCC

<li> É extends de Conta e possui contrato com a interface CalculoTributos, pois herdará o atributo e método das classes<</li>
<li> Sobreescreve o método calcularTributo, tendo em seu corpo uma saída de dados com a mensagem ""O valor do tributo é: R$" + (saldo * 0.01)", para exibir o valor do tributo, que seria 1% da minha quantia (saldo)</li>
<li> Após, há outra saída de dados com a seguinte mensagem "Seu saldo ficará:" e abaixo, retorna saldo - (saldo * 0.01), para que o sistema possa exibir qual valor meu saldo passará a ter após a cobrança do tributo</li>

## Classe SeguroDeVida

<li> É extends de Conta e possui contrato com a interface CalculoTributos, pois herdará o atributo e método das classes</li>
<li> Sobreescreve o método CalcularTributo(), tendo em seu corpo uma saída de dados com a mensagem "O valor da taxa fixa é: R$ " + 42, para mostrar que o valor da minha taxa vale 42 reais, como o enunciado solicita.</li>
<li> Abaixo, há outra saída de dados com a mensagem "Seu saldo ficará: " e em seguida retorna saldo - 42, para que o sistema possa exibir qual valor meu saldo passará a ter após a cobrança da taxa fixa</li>

## Classe Exercicio02

<li> Possui método main </li>
<li> Possui um novo objeto do tipo Conta que instancia a classe Conta </li>
<li> Possui saída de dados para captar a decisão do usuário, recebendo em seu corpo o comando "acc.decisao()"</li>
<br>
<li> Quando o sistema é iniciado, todo o processo de passar para classe conta, executar o método de decisão, gerar novos objetos e retornar os métodos que exibem ou calculam os tributos é iniciado. </li>
