O Projeto foi feito no intuito de aprender Spring MVC, Thymeleaf e banco de dados
Conhecendo o padrão MVC com o Spring MVC

Use o Spring Data para persistência

Crie views melhores com Thymeleaf

Validando os seus dados com o BeanValidation

Estilize o HTML com Bootstrap

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


--------------------------------
começando de cima para baixo, um “Controller” principal, que é o HomeController. É ele quem recebe uma requisição, um GetMapping para home.
Ele vai utilizando Spring Data, vai no banco de dados, pegando os pedidos e mandando para a view chamada de home

Então temos a “HomeController”. Ela recebe uma requisição do usuário para “/home”. É para isso que serve esse “@RequestMapping”.

E quando o usuário faz uma requisição via Browser, que é uma requisição do tipo “Get”, uma requisição onde você preenche a URL lá em cima. Essa é uma requisição “Get” e aí o processamento vem para esse método.

A Class pedidoRepository” que é quem sabe se comunicar com o banco de dados e pedir uma lista de pedidos. Eu adicionei essa lista de pedidos dentro do model através do método AddAttribute.

RESUMINDO : O HomeController é um método que recebe essa requisição, que processa essa requisição, que é esse aqui. 
Ele usa o “PedidoRepository” para poder buscar os pedidos, através do método “findAll” lá no banco de dados.

Então ele vai no banco; busca os dados; usando o JPA, ele mapeia esses dados, esses registros de tabelas, para uma lista de pedido, que é retornada para a HomeController

Depois que o usuário preencher o formulário, ele vai fazer uma requisição que é do tipo post E também para pedido, 
uma requisição para um novo pedid, e é aqui que fazemos as validações dos dados para poder apresentar os erros para o usuário. 
Se tudo estiver certo, nós criamos um pedido, salvamos no banco de dados e redirecionamos o usuário para home.
