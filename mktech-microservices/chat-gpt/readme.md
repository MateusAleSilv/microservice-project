
---

# Chat GPT

O **Chat GPT** é um módulo que integra a tecnologia de processamento de linguagem natural (PLN) do OpenAI GPT para fornecer uma interface de conversação automatizada. Ele permite que os usuários interajam com um modelo de linguagem treinado para gerar respostas com base em prompts de entrada.

## Configuração do Projeto

O projeto é construído usando o framework Spring Boot, facilitando o desenvolvimento e a implantação de aplicativos Java. Ele também se integra ao OpenAI API para aproveitar o poder do GPT-3.5 para gerar respostas inteligentes.

### Tecnologias Utilizadas:

- **Spring Boot 3.1.5**: Framework Java para criar aplicativos de forma rápida e fácil.
- **OpenAI GPT-3.5**: Modelo de linguagem natural avançado para geração de texto.
- **Maven**: Gerenciador de dependências e construção de projetos.

## Estrutura do Projeto

O projeto é organizado em pacotes que correspondem às diferentes partes da aplicação:

- **br.com.pulsewarp.controller**: Contém classes que definem os endpoints REST para interagir com o serviço Chat GPT.
- **br.com.pulsewarp.service**: Inclui a lógica de negócios para processar solicitações e gerar respostas usando o modelo GPT.
- **br.com.pulsewarp.vo.request**: Classes de objetos de transferência de dados (DTOs) para representar solicitações de entrada.
- **br.com.pulsewarp.vo.response**: DTOs para representar as respostas geradas pelo serviço Chat GPT.
- **br.com.pulsewarp.config**: Configurações do aplicativo, incluindo a integração com a API do OpenAI.

## Configuração e Uso

Para configurar e executar o projeto, siga estas etapas:

1. **Configuração do Maven**: Certifique-se de que o Maven esteja instalado e configurado no seu sistema.
2. **Configuração da API do OpenAI**: Obtenha uma chave de API do OpenAI e defina-a como uma variável de ambiente com o nome `OPENAI_API_KEY`.
3. **Execução do Projeto**: Use o comando `mvn spring-boot:run` para iniciar a aplicação.
4. **Interagindo com o Serviço**: Acesse os endpoints REST fornecidos pelo serviço Chat GPT para enviar prompts e receber respostas geradas pelo modelo GPT.

## Contribuição

Contribuições para o projeto são bem-vindas! Sinta-se à vontade para enviar problemas ou solicitações de pull para melhorar o módulo Chat GPT.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE), permitindo uso livre e modificação do código-fonte.

---

