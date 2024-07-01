Este projeto demonstra o padrão de acesso a dados (DAO) usando JDBC em Java. Cada entidade possui um objeto responsável por fazer o acesso a dados relacionado a esta entidade. A injeção de dependência é feita por meio do padrão de projeto Factory.

Estrutura do Projeto
Entidades e DAOs
Vendedor: SellerDao
Departamento: DepartmentDao
Implementação dos DAOs
Cada DAO é definido por uma interface e implementado utilizando JDBC para acessar o banco de dados. A injeção de dependência é gerenciada por meio da fábrica DaoFactory.

Passos para Criar e Configurar o Projeto
Criar Repositório no GitHub
Crie um novo projeto no GitHub.
Escolha o tipo .gitignore como Java.
Configurar o Projeto no Eclipse
Crie um novo projeto Java no Eclipse com a biblioteca MySQLConnector.
Criar e Sincronizar Repositório Local
Inicialize o repositório local:
git init
Adicione o repositório remoto:
Sincronize o repositório local com o remoto:
git pull origin master
Adicione os arquivos ao controle de versão:
git add .
Faça um commit inicial:
git commit -m "Project created"
Envie as alterações para o GitHub:
git push -u origin master
