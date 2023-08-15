# ecommerce

## Sobre o projeto
Esse projeto foi desenvolvido em Java, utilizando o Spring.

- Versão JDK: 20
- IDE: IntelliJ Community

### Arquitetura
Para esse projeto, a arquitetura adotada foi a de monolito modular, onde foi subdividido o projeto em módulos de acordo com o domínio de negócio. Além disso esse projeto está dividido em dois modulos mais externo(app e core).

A camada de core é responsável pelo domínio da aplicação, é nele onde fica as regras de negócios e modelos de entidades, ele não tem comunicação direta com o app.
Já a camada de app é reponsável pela comunicação com o "Mundo externo", é nele onde fica os controllers com os endpoints, o acesso ao banco de dados e outros provedores que exijam conexão externa. 

Quando o core precisa se comunicar com o app, é utilizado a inversão de controle por meio de interfaces e implementações, um exemplo disso é como o core da aplicação utiliza os repositórios do app.

Foi adotado também uma arquitetura voltada para Domínios (DDD), dessa forma conseguimos garantir uma escalabilidade maior para o projeto.

### Desenvolvimento
Para o desenvolvimento foi utilizado o desenvolvimento dirigido por testes (TDD), no qual consiste em criar um caso de teste primeiro e a partir dele criar as implementações de negócio.

- Testes: para os testes foram utilizados o JUnit e o SpringBootTest
- Consulta de CEP: para a consulta de CEPs foi criado duas estratégias dentro do módulo App (Postmon e ViaCEP), a escolha entre uma estratégia ou outra é feito através do arquivo .properties, que através de uma Factory consegue retornar a consulta de qualquer um dos dois provedores.

### Como executar
Você pode executar o projeto através do IntelliJ Community, ao abrir o projeto é possível iniciar a execução dos testes. Os testes estão dentro do projeto e executam de forma independente, pois a base de dados h2 é criada em tempo de execução.

Para executar a aplicação é necessário configurar o projeto através do arquivo application.properties. O arquivo já está configurado para uma conexão MySQL em localhost com usuário root e senha vazia, essas propriedades podem ser alteradas de acordo com as suas configurações do MySQL.

A última propriedade do arquivo é de escolha do provedor de CEP, e ela pode ser configurada da seguinte forma:

app.config.cep-provider=VIACEP

ou 

app.config.cep-provider=POSTMON



