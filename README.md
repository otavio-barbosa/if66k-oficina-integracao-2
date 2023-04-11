# Configuração para Desenvolvedores


-------------------- TUTORIAL DE COMO CONFIGURAR O PROJETO --------------------

1 - Crie um novo projeto no NetBens (ou IDE desejada para a Linguagem Java) utilizando Java Application.

![image](https://user-images.githubusercontent.com/85796227/224822726-4f7b341a-b58a-4fe7-89f8-694b8930fe52.png)

2 - Faça o download da pasta "TrabalhoOficina" disponível no git e envie os arquivos presentes dentro da pasta "src" para o src do projeto criado.

  2.1 - Para encontrar o src do projeto criado vá em: DOCUMENTOS -> NETBEANSPROJECTS -> SEU PROJETO -> SRC

![image](https://user-images.githubusercontent.com/85796227/224824563-777086b3-d188-4afe-bb3b-012a2a0fc9a6.png)

3 - Faça o download e configure o PostgreeSQL junto com o pgAdmin para executar as queryes necessárias.

4 - Altere os dados de conexão presentes no arquivo: NOMEPROJETO -> SRC -> DAO -> configbd (SE ESTIVER COM OS DADOS PADRÕES DE CONFIG. NÃO É NECESSÁRIO ALTERAR OS DADOS DO ARQUIVO).

![image](https://user-images.githubusercontent.com/85796227/224826589-88fca01d-5844-4a99-b1e5-996c11ce0507.png)

5 - Com o download da pasta "TrabalhoOficina" realizado, vá até o bloco de notas "scriptBd" copie, cole e execute os comandos necessários no pgAdmin (Query Tool).

![image](https://user-images.githubusercontent.com/85796227/224827839-260655d5-e27c-4747-b4ea-f5630bdf7b10.png)

6 - Com o download da pasta "TrabalhoOficina" realizado, utilize o JDBC do postgree ("postgresql-42.5.3.jar") ou faça o download na web do JDBC do seu BD.

  6.1 - Adicione o JDBC em seu projeto: clique com direito no seu projeto -> properties -> libraries -> adicione o driver JDBC no "Classpath" -> ok
  
  ![image](https://user-images.githubusercontent.com/85796227/224829030-4fad82cd-1125-4ba3-bde6-2add30a1df73.png)
  
  7 - Agora é só executar o projeto indo em: PROJETO -> VIEW -> BOTÃO DIREITO DO MOUSE -> RUN PROJECT
  
  7 - Com o projeto aberto vá em: ARQUIVO -> ABRIR. Caso carregue os dados na tabebla do projeto, deu tudo certo como o esperado!
  
  ![image](https://user-images.githubusercontent.com/85796227/224830130-8d09405d-c286-4e40-83b1-b9a84c5c5e22.png)

  
  



