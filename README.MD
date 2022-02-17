O Projeto foi feito no intuito de aprender Spring MVC, Thymeleaf e banco de dados

PROJETO DE UMA LOJA SIMPLES
=
    Explicando alguns pontos e a intuição do projeto:
Projeto feito na intuição de aprender mais sobre: Spring boot, Bancos de dados, Spring Security e Thymeleaft.

Thymeleaft feito para projetos Java que facilita a criação de páginas HTML. Sendo assim, ele serve para gerar páginas HTML no lado servidor de forma dinâmica, permitindo a troca de informações entre o código Java e as página HTML.

Spring boot que tem como objetivo facilitar esse processo em aplicações Java, trazendo agilidade no projeto

Postgres: bancos de dados usado no projeto.

CLASSES, PACKAGES E ANOTAÇÕES USADAS:
=
Dentro de recursos da aplicação, fica o template que criamos duas paginas htlm para se acossiar com os controllers

Exemplo na classe HomeController, no retorno do método se associa ao html.

Package Controller feito para pôr suas requisições : GET, POST, PUT, DELETE.

Package DTO - feito para transferir dados entre os componentes do projeto

Package Model - usado para criar a base do banco de dados, (conexão com o banco de dados)

Anotações: Nos dar uma agilidade no código e sabe o que fazer quando é invocada

@Controller = Associada para classes que possuem métodos que processam requisições numa aplicação web.

@Repository = anota classes na camada de persistência, que atuará como um repositório de banco de dados.

@Autowired = informa onde deve ser injetada independencias 

