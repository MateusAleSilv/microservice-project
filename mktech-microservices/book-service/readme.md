
---

# Módulo Cambio Service

O Módulo Cambio Service é uma aplicação que fornece funcionalidades essenciais para conversão de moedas. Ele permite aos usuários converter um valor de uma moeda para outra com base nos fatores de conversão armazenados no banco de dados. Desenvolvido utilizando Spring Boot e integrado com o Spring Cloud Netflix Eureka Client para descoberta de serviços, o Cambio Service oferece uma solução robusta e escalável para necessidades de conversão de moeda em uma arquitetura de microserviços.

## Visão Geral

Este módulo foi criado com o objetivo de fornecer uma solução eficiente e confiável para converter valores monetários entre diferentes moedas. Ao integrar-se com o serviço Eureka, o Cambio Service pode ser facilmente descoberto e consumido por outros microserviços dentro de uma arquitetura distribuída. Sua integração com o banco de dados MySQL permite o armazenamento e recuperação eficientes dos fatores de conversão, garantindo precisão e consistência nas operações de conversão de moeda.

## Detalhes do Módulo

O módulo Cambio Service é composto por diversos componentes, cada um desempenhando um papel específico no funcionamento da aplicação:

### 1. Módulo da Aplicação Principal

- **Pacote:** `br.com.mktech`
- **Descrição:** Este módulo contém a classe principal da aplicação Spring Boot responsável por inicializar o Cambio Service.

#### `Application.java`
- **Descrição:** Classe principal responsável por inicializar a aplicação Spring Boot.

### 2. Módulo do Controlador

- **Pacote:** `br.com.mktech.controller`
- **Descrição:** Contém a classe do controlador responsável por lidar com requisições HTTP relacionadas à conversão de moeda.

#### `CambioController.java`
- **Descrição:** Classe do controlador com endpoints para conversão de moeda.

### 3. Módulo do Modelo

- **Pacote:** `br.com.mktech.model`
- **Descrição:** Contém a classe de entidade que representa os detalhes da conversão de moeda.

#### `Cambio.java`
- **Descrição:** Classe de entidade que representa os detalhes da conversão de moeda.

### 4. Módulo do Repositório

- **Pacote:** `br.com.mktech.repository`
- **Descrição:** Contém a interface de repositório para operações CRUD na entidade de conversão de moeda.

#### `CambioRepository.java`
- **Descrição:** Interface de repositório que estende JpaRepository para operações CRUD na entidade `Cambio`.

### 5. Módulo de Configuração

- **Pacote:** `br.com.mktech.configuration`
- **Descrição:** Contém classes de configuração para a aplicação.

#### `OpenApiConfiguration.java`
- **Descrição:** Classe de configuração para a documentação OpenAPI usando Springdoc.

## Estrutura do Projeto

A estrutura do projeto segue as práticas recomendadas do Spring Boot, organizando os arquivos e pacotes de forma lógica e intuitiva.

## Configuração

O Cambio Service possui diversas configurações, incluindo configurações do servidor, cliente Eureka, banco de dados, Hibernate, Flyway e Springdoc OpenAPI. As configurações podem ser ajustadas conforme necessário para atender aos requisitos específicos do ambiente de implantação.

## Uso

Para utilizar o Cambio Service, siga as seguintes etapas:

1. Garanta que todas as dependências sejam resolvidas pelo Maven.
2. Configure o banco de dados MySQL e certifique-se de que esteja em execução.
3. Execute a classe `Application` para iniciar o Cambio Service.
4. Acesse a documentação do Swagger UI em `http://localhost:8000/cambio-service/swagger-ui.html`.
5. Utilize os endpoints fornecidos para realizar a conversão de moeda conforme necessário.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para enviar problemas ou solicitações de pull para melhorar o Cambio Service.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE), o que significa que você tem permissão para usar, copiar, modificar, mesclar, publicar, distribuir, sublicenciar e/ou vender cópias do Software, sujeito às condições estabelecidas na licença.

---

