# Microservices

Bem-vindo ao repositório de Microservices! Este repositório contém vários módulos para construir microservices usando Spring Boot e Spring Cloud. Abaixo, você encontrará informações detalhadas sobre cada módulo e como usá-los de forma eficaz.

## Módulos

1. [Módulo API Gateway](#módulo-api-gateway)
2. [Módulo Serviço de Câmbio](#módulo-serviço-de-câmbio)
3. [Módulo Chat GPT](#módulo-chat-gpt)
4. [Módulo Servidor de Configuração](#módulo-servidor-de-configuração)
5. [Módulo Serviço de Saudação](#módulo-serviço-de-saudação)
6. [Módulo Servidor de Nomes](#módulo-servidor-de-nomes)

---

## Módulo API Gateway

### Visão Geral
O módulo API Gateway atua como um gateway para rotear solicitações para vários microservices dentro do sistema. Ele utiliza o Spring Cloud Gateway e o Springdoc OpenAPI para roteamento eficiente e geração de documentação.

### Recursos
- Roteamento de solicitações para microservices
- Geração de documentação OpenAPI
- Registro global de solicitações

### Configuração
- **Porta do Servidor:** 8765
- **URL do Servidor Eureka:** http://localhost:8761/eureka

### Uso
1. Garanta que todas as dependências sejam resolvidas pelo Maven.
2. Execute a classe `Application` para iniciar o API Gateway.
3. Acesse o Swagger UI para documentação da API em `http://localhost:8765/swagger-ui.html`.

### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar problemas ou solicitações de pull.

---

## Módulo Serviço de Câmbio

### Visão Geral
O módulo Serviço de Câmbio fornece funcionalidade de conversão de moeda dentro da arquitetura de microservices. Ele utiliza Spring Boot, Spring Cloud Netflix Eureka Client para descoberta de serviços e integra-se com um banco de dados MySQL para armazenar fatores de conversão.

### Recursos
- Conversão de moeda
- Integração com o Eureka Client para descoberta de serviços
- Integração MySQL para armazenamento de fatores de conversão

### Configuração
- **Porta do Servidor:** 8000
- **Configuração do Cliente Eureka:**
    - **URL do Serviço:** http://localhost:8761/eureka
- **Configuração do Banco de Dados:**
    - **Nome do Driver:** com.mysql.cj.jdbc.Driver
    - **URL:** jdbc:mysql://localhost:3306/cambio_service?useTimezone=true&serverTimezone=UTC
    - **Nome de Usuário:** root
    - **Senha:** admin123

### Uso
1. Garanta que todas as dependências sejam resolvidas pelo Maven.
2. Configure o banco de dados MySQL e certifique-se de que ele esteja em execução.
3. Execute a classe `Application` para iniciar o Serviço de Câmbio.
4. Acesse a documentação do Swagger UI em `http://localhost:8000/cambio-service/swagger-ui.html`.
5. Utilize os endpoints fornecidos para realizar a conversão de moeda.

### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar problemas ou solicitações de pull.

---

## Módulo Chat GPT

### Visão Geral
O módulo Chat GPT integra o modelo OpenAI GPT para processamento de linguagem natural para fornecer uma interface de conversação automatizada. Ele utiliza Spring Boot para desenvolvimento de aplicativos e integra-se com a API do OpenAI para geração de texto.

### Recursos
- Interface de conversação em linguagem natural
- Integração com o OpenAI GPT-3.5 para geração de texto

### Configuração e Uso
1. Garanta que todas as dependências sejam resolvidas pelo Maven.
2. Configure a chave da API do OpenAI como uma variável de ambiente com o nome `OPENAI_API_KEY`.
3. Execute a classe `Application` para iniciar o serviço Chat GPT.
4. Interaja com o serviço usando os endpoints REST fornecidos.

### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar problemas ou solicitações de pull.

---

## Módulo Servidor de Configuração

### Visão Geral
O módulo Servidor de Configuração atua como um servidor de configuração centralizado usando o Spring Cloud Config. Ele permite que os microservices externalizem sua configuração, facilitando o gerenciamento e implantação.

### Recursos
- Gerenciamento de configuração centralizado
- Integração com o Spring Cloud Config
- Armazenamento de configuração baseado em Git

### Configuração
- **Porta do Servidor:** 8888
- **Nome da Aplicação Spring:** config-server
- **Configurações do Spring Cloud Config:**
    - **URI do Git:** https://github.com/mateusaledev/mktech-microservices/config-server
    - **Label Padrão:** main
    - **Caminhos de Busca:**
        - 'greeting-service*'

### Uso
1. Garanta que todas as dependências sejam resolvidas pelo Maven.
2. Execute a classe `Application` para iniciar o Servidor de Configuração.
3. Acesse os arquivos de configuração para microservices fazendo solicitações ao Servidor de Configuração.

### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar problemas ou solicitações de pull.

---

## Módulo Serviço de Saudação

### Visão Geral
O módulo Serviço de Saudação fornece funcionalidade de saudação personalizada dentro da arquitetura de microservices. Ele utiliza Spring Boot e integra-se com o Spring Cloud Config para gerenciamento de configuração externalizado.

### Recursos
- Geração de saudações personalizadas
- Integração com o Spring Cloud Config para gerenciamento de configuração

### Configuração
- **Porta do Servidor:** 8080
- **Nome da Aplicação Spring:** greeting-service
- **Configurações do Spring Cloud Config:**
    - **Perfil:** perf
    - **Importação:** optional:configserver:http://localhost:8888/

### Uso
1. Garanta que todas as dependências sejam resololvidas pelo Maven.
2. Execute a classe `GreetingServiceApplication` para iniciar o Serviço de Saudação.
3. Acesse o endpoint de saudação em `http://localhost:8080/greeting`.

### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar problemas ou solicitações de pull.

---

## Módulo Servidor de Nomes

### Visão Geral
O módulo Servidor de Nomes atua como um registro de serviços e servidor de descoberta usando o Netflix Eureka. Ele permite que os microservices se registrem e descubram outros serviços dentro do sistema.

### Recursos
- Registro e descoberta de serviços
- Integração com o Netflix Eureka Server

### Configuração
- **Porta do Servidor:** 8761
- **Nome da Aplicação Spring:** naming-server
- **Configurações do Servidor Eureka:**
    - **Registrar com Eureka:** false
    - **Buscar Registro:** false

### Uso
1. Garanta que todas as dependências sejam resolvidas pelo Maven.
2. Execute a classe `Application` para iniciar o Servidor de Nomes.
3. Acesse o painel do Eureka em `http://localhost:8761`.

### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar problemas ou solicitações de pull.

---

Sinta-se à vontade para explorar cada módulo e contribuir para a melhoria de nossa arquitetura de microservices! Se tiver alguma dúvida ou precisar de assistência, não hesite em entrar em contato. Feliz codificação! 🚀