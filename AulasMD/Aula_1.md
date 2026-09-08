# Conteúdo da aula 1

Link da Aula: [Aula 1: Implementação de CRUD com API REST](https://www.youtube.com/watch?v=iBGkJln9BPo&list=PLcs1FElCmEu121gqGwlQt47d0SqNkzSTK)

Para iniciar um projeto Spring Boot, você pode utilizar o Spring Initializr, uma ferramenta online que gera a estrutura básica do projeto com as dependências necessárias. Acesse [start.spring.io](https://start.spring.io/) e configure o projeto conforme suas necessidades, escolhendo o tipo de projeto (Maven ou Gradle), a versão do Spring Boot, as dependências desejadas e outras configurações. 

## REST API

API: Application Programming Interface, ou Interface de Programação de Aplicações, é um conjunto de rotinas e padrões estabelecidos por uma aplicação para que outras aplicações possam utilizar as funcionalidades desta aplicação.  

REST ou RESTful: Representational State Transfer, ou Transferência de Estado Representacional, é um estilo de arquitetura de software que define um conjunto de restrições a serem aplicadas para criar serviços web.  

- REST é um estilo de arquitetura de software que define um conjunto de restrições a serem aplicadas para criar serviços web. Desenvolvedores podem criar APIs RESTful que permitem que diferentes sistemas se comuniquem entre si de forma eficiente e escalável.

- Uma aplicação RESTful é aquela que segue os princípios do REST, utilizando métodos HTTP (GET, POST, PUT, DELETE) para realizar operações em recursos representados por URLs.


## Spring Boot

Spring Boot é um framework baseado no Spring que simplifica o processo de desenvolvimento de aplicações Java, fornecendo uma configuração automática e uma estrutura pronta para uso. Ele permite criar aplicações independentes e prontas para produção com facilidade, eliminando a necessidade de configuração manual extensa.

Tomcat é um servidor web e contêiner de servlets que implementa as especificações Java Servlet, JavaServer Pages (JSP) e Java Expression Language (EL). Ele é amplamente utilizado para hospedar aplicações web Java, incluindo aquelas desenvolvidas com Spring Boot. O Tomcat fornece um ambiente de execução para aplicações web, gerenciando solicitações HTTP, sessões e recursos relacionados.

Jetty é outro servidor web e contêiner de servlets que também implementa as especificações Java Servlet, JSP e EL. Assim como o Tomcat, o Jetty é usado para hospedar aplicações web Java, incluindo aquelas desenvolvidas com Spring Boot. Ele é conhecido por sua leveza, desempenho e facilidade de integração em diferentes ambientes.

Provê dependencias e configurações automáticas para o desenvolvimento de aplicações web, incluindo suporte a servidores embutidos como Tomcat e Jetty, facilitando a criação de APIs RESTful. Bibliotecas como Spring MVC, Spring Data e Spring Security são integradas, permitindo o desenvolvimento rápido e eficiente de aplicações web robustas.

Possui health checks e métricas integradas, permitindo monitorar o estado da aplicação e coletar informações sobre seu desempenho. Isso é útil para garantir a disponibilidade e a confiabilidade da API REST.  

Sem XML de configuração, o Spring Boot utiliza convenções e anotações para configurar automaticamente a aplicação, reduzindo a quantidade de código necessário para iniciar um projeto. Isso simplifica o desenvolvimento e acelera o processo de criação de APIs RESTful.

## Anotações do Spring Boot

- @SpringBootApplication: Indica que a classe é a principal do Spring Boot e habilita a configuração automática, o escaneamento de componentes e outras funcionalidades do framework. (@EnableAutoConfiguration, @ComponentScan e @Configuration são incluídas implicitamente)  

- @RestController: Indica que a classe é um controlador REST, permitindo que ela manipule solicitações HTTP e retorne respostas JSON ou XML.

- @RequestMapping: Define o mapeamento de URLs para métodos do controlador, permitindo que diferentes endpoints sejam tratados por métodos específicos. Pode ser usado em nível de classe ou método.

- @GetMapping: Mapeia solicitações HTTP GET para métodos do controlador, permitindo recuperar recursos.

- @PostMapping: Mapeia solicitações HTTP POST para métodos do controlador, permitindo criar novos recursos.

- @PutMapping: Mapeia solicitações HTTP PUT para métodos do controlador, permitindo atualizar recursos existentes.

- @DeleteMapping: Mapeia solicitações HTTP DELETE para métodos do controlador, permitindo excluir recursos.

## Spring Initializr

Para iniciar um projeto Spring Boot, você pode utilizar o Spring Initializr, uma ferramenta online que gera a estrutura básica do projeto com as dependências necessárias. Acesse [start.spring.io](https://start.spring.io/) e configure o projeto conforme suas necessidades, escolhendo o tipo de projeto (Maven ou Gradle), a versão do Spring Boot, as dependências desejadas e outras configurações.

### Comandos CLI para spring 

Docs: [Spring.io CLI Reference Guide](https://docs.spring.io/spring-cli/reference/0.8/initializr.html)

### Postman 
O Postman é uma ferramenta popular para testar APIs RESTful. Ele permite enviar solicitações HTTP para endpoints da API, visualizar respostas, adicionar cabeçalhos e parâmetros, e automatizar testes. Com o Postman, você pode criar coleções de solicitações, salvar ambientes de teste e compartilhar configurações com sua equipe. [Postman](https://www.postman.com/)
