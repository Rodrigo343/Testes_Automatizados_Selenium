# Testes_Automatizados_Selenium

## :information_source: Informações Gerais 

Neste projeto nosso foco é utilizar o selenium WebDrive para criar teste de aceitação (E2E/End to End), para validar as facilidades já existentes do projeto. Por esse motivo o projeto inicial foi fornecido pelo curso.

---
### :information_source: Informações do selenium WebDrive

1. Biblioteca open source para testes end-to-end
2. Abstração do protocolo de integração com Browsers
3. Suporte a diversos Browsers (Chrome, FireFox, Opera, etc.)
4. APi simples de utilizar

### :heavy_exclamation_mark: Desvantagens

Algumas das desvantagens dos testes de aceitação é que são muito frágeis por serem muito acoplados com a tela. E caso tiver qualquer mínima alteração em tela pode afetar e até mesmo quebrar os teste criados.

### :information_source: Teste Implementados

Como primeiro passo do curso, implementamos alguns testes na funcionalidade de Login. Onde por ser a primeira implementação do nosso projeto, tivemos que configurar o selenium WebDrive. Após sua configuração, partimos para o desenvolvimento dos testes na tela de login, para validar se o sistema logava corretamente, bloqueava acesso a URL restritas e caso ocorresse algum login com credencial invalida ocorreria algum retorno de que não foi possível realizar a autenticação. Tudo descrito anteriormente foi implementado na classe LoginTeste.java.

### :information_source: Page Object

Com a implementação do selenium nos teste começamos a ter uma mistura da API do selenium com nossos testes. E isso é ruim, pois caso algum dia formos trocar o selenium por outra biblioteca teríamos que alterar todos os teste que se utilizam dele. Para resolver essa mistura de código, realizaremos a implementação do Page Object. Ele é um padrão de projeto o qual seu objetivo é criar uma classe que representa uma pagina do seu projeto, ou seja, tudo relacionado a tela de login no cenário atual e que tem relação a selenium, ficara em uma classe e a parte dos testes ficara em outra classe. Assim realizando a separação de funcionalidades, facilitando a manutenção e compreensão do código.

