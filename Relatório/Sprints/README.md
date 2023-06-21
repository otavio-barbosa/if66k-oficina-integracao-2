<h1> RELATÓRIO SPRINT 1 </h1>

<p>
  Nessa primeira etapa (sprint 1), foi escolhido o software no qual a equipe irá trabalhar, programa onde é realizado o cadastro e a listagem de filmes. Baseado nisso, foi realizado o planejamento de como a aplicação seguiria, pensando na melhor forma de gestão. Assim, fazendo a definição dos requisitos funcionais do sistema, arquitetura em alto nível do sistema, escolha das estratégias para a realização dos testes na aplicação (como caixa preta e branca) e a definição das tecnologias que serão utilizadas ao longo das sprints.
</p>

<p>
  Após a realização do planejamento inicial, foram executados os testes iniciais, chamados de teste de caixa preta. Que por sua vez mostram a comparação de resultados esperados com resultados obtidos, assim, sendo possível notar que o software alvo possui diversos deslizes. Os erros mais comuns encontrados foram erros textuais nas mensagens de retorno, onde se demonstraram incompletos e com palavras genéricas para trechos que deveriam ser específicos, além disso, foi possível notar a ausência de mensagens de erros em algumas partes e a falta de limitação para entrada de números inteiros que correspondem ao ano do filme que está prestes a ser cadastrado.
</p>

<p>
  Para a próxima fase (sprint 2), a equipe irá se dividir para reparar os trechos de código que se demonstraram incorretos diante o teste de caixa preta. Após isso, os testes desse gênero serão realizados novamente, para verificar se ainda existe alguma saída diferente da esperada. Na etapa seguinte também será realizado a criação das classes de testes automatizados para que seja possível fazer testes unitários utilizando a ferramenta JUnit, provando se o código do projeto está passando ou reprovando nos experimentos.
</p>

<h1> RELATÓRIO SPRINT 2 </h1>

<p>
  Durante a segunda etapa, o grupo de desenvolvedores corrigiu os erros descobertos nos testes de caixa preta da sprint anterior e, em seguida, os testes de caixa preta foram repetidos para confirmar que os defeitos foram realmente corrigidos. Com os testes realizados novamente, foi possível confirmar que as funcionalidades estão corretas e as respostas estão de acordo com o esperado para o funcionamento normal da aplicação. Dessa forma, foi possível prosseguir para outro tipo de validação do programa, que envolveu a criação de classes de testes automatizados usando a ferramenta JUnit.
</p>

<p>
  O squad conseguiu criar a classe necessária para avaliar os principais métodos do software com pouca dificuldade e obteve resultados positivos em relação ao procedimento das funções.
</p>

<p>
  Na próxima fase (Sprint 3), o grupo irá preparar os testes de caixa branca e analisar o código novamente como um todo, caso surjam problemas ou anomalias encontradas pelos testes finais. Se houver algum problema, o grupo irá refiná-lo para garantir que tudo esteja funcionando perfeitamente.
</p>

<h1>RELATÓRIO SPRINT 3</h1>

<p>
  Na fase final do projeto, nossa equipe desempenhou um papel crucial ao criar grafos de fluxo/programa com base no teste de caixa branca. Essa abordagem de teste foi adotada para obter um melhor entendimento das sequências (fluxo) das linhas de código nas principais funções do projeto, conhecidas como CRUD (Create, Read, Update e Delete).

Os grafos gerados também registram os tipos de variáveis encontradas nos métodos, sendo eles: D (Definição), UP (Uso Predicativo) e UC (Uso Computacional). Essa abordagem permitiu identificar e analisar com mais precisão as interações e dependências entre as variáveis.

Além disso, durante essa etapa, aplicamos critérios baseados no fluxo de controle, como todos-nós, todos-arcos e todos-caminhos, para a execução do teste de caixa branca. Esses critérios nos ajudaram a garantir uma cobertura abrangente do código, explorando todas as possíveis ramificações e condições lógicas.

Em suma, a utilização dos grafos de fluxo de teste de caixa branca proporcionou uma visão clara e estruturada do fluxo das linhas de código do CRUD. Essa abordagem nos permitiu entender melhor as interações entre as variáveis e garantir uma cobertura adequada do código-fonte, seguindo critérios de fluxo de controle.
</p>
