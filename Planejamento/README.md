
<h1>PLANEJAMENTO</h1>

<h2>Definição de requisitos funcionais;</h2>


<h3>Requisitos Funcionais Aplicação Desktop CRUD JAVA</h3>

1. Cadastro de filmes: a aplicação deve permitir que o usuário cadastre novos filmes, inserindo informações como nome, gênero e ano.

2. Edição de filmes: a aplicação deve permitir que o usuário edite informações de filmes já cadastrados, como nome, gênero e ano.

3. Exclusão de filmes: a aplicação deve permitir que o usuário exclua filmes já cadastrados.

4. Listagem de filmes: a aplicação deve permitir que o usuário visualize todos os filmes cadastrados, com as informações básicas (nome, gênero e ano).

5. Pesquisa de filmes: a aplicação deve permitir que o usuário pesquise por filmes cadastrados, utilizando o nome como critério.

6. Validação de campos: a aplicação deve validar os campos obrigatórios para o cadastro de filmes, como nome e gênero, impedindo o cadastro de filmes com informações incompletas.
7.Persistência de dados: a aplicação deve armazenar os dados de filmes cadastrados em um banco de dados, garantindo que as informações não sejam perdidas ao fechar a aplicação.

8. A entrada para o campo ano deve ser um número inteiro.

9. Ao cadastrar, o valor para o campo ano deve ser menor que 2023 e maior que 1895.


<h2>Definição da arquitetura em alto nível do sistema;<h2>
		
![WhatsApp Image 2023-03-15 at 7 33 47 PM](https://user-images.githubusercontent.com/85796227/225634389-c3521443-75a4-49d7-8daa-6dc4b252b968.jpeg)


<h2>Definição da estratégia de automação de testes do sistema;</h2>
	
<h3>CAIXA PRETA</h3>


Particionamento de Equivalência e Análise de valor limite

Esses tipos de testes serão baseados nas regras de negócio ou requisitos funcionais do sistema, onde será possível verificá-los adicionando a coluna de resultados obtidos e compará-los com as saídas esperadas .


Ex:  RF5 - Pesquisa de filmes: a aplicação deve permitir que o usuário pesquise por filmes cadastrados, utilizando o nome como critério.

![image3](https://user-images.githubusercontent.com/85796227/225636875-ca99c01f-b167-4fcd-ada7-882b9080aab2.png)

RF5 - Ao cadastrar, o valor para o campo ano deve ser menor que 2023 e maior que 1895

![image1](https://user-images.githubusercontent.com/85796227/225637062-25d2b4e2-9d40-46f0-88cb-11f7cb2af2dd.png)
  
<h3>CAIXA BRANCA</h3>

Teste de Unidade - Será realizado pelos desenvolvedores, focalizado em cada componente do sistema para garantir que cada um funcione como deveria, utilizando a ferramenta JUnit para testes automatizados.
		
		
<h2>Definição das tecnologias a serem utilizadas no projeto.</h2>


	Java, JDBC, PostgreSQL, PgAdmin, Java Swing e NetBeans.





