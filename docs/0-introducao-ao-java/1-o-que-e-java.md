# Introdução ao Java

## 1. A Origem do Java

A história do Java começa em 1991, na **Sun Microsystems**, com um grupo de engenheiros liderado por **James Gosling**, conhecido como "Green Team". O objetivo inicial não era criar uma linguagem para a internet, mas sim para dispositivos eletrônicos de consumo (como caixas de TV a cabo e eletrodomésticos inteligentes).

A linguagem original chamava-se **Oak** (em homenagem a um carvalho que Gosling via da sua janela). Mais tarde, foi renomeada para **Java** (inspirada no café consumido pela equipe) e lançada oficialmente em **1995**. Com o crescimento da World Wide Web, o Java encontrou o seu lugar como uma linguagem ideal para a internet devido à sua portabilidade e segurança.

> **Curiosidade:** O mascote do Java chama-se *Duke*.

---

## 2. O que é Java?

Quando falamos "Java", geralmente estamos nos referindo a um ecossistema composto por três pilares fundamentais:

1.  **A Linguagem Java**: A sintaxe, palavras-chave e regras que usamos para escrever o código.
2.  **A Plataforma Java**: O ambiente de software onde os programas Java são executados (inclui a JVM e bibliotecas).
3.  **As Especificações Java**: Documentos que definem como a linguagem e a plataforma devem se comportar, garantindo compatibilidade.

---

## 3. Entendendo a Sopa de Letrinhas: JVM, JRE e JDK

Para entender como o Java funciona, precisamos distinguir três componentes essenciais. Veja a tabela abaixo:

| Sigla | Nome Completo | O que é? | Para que serve? |
| :--- | :--- | :--- | :--- |
| **JVM** | *Java Virtual Machine* | Máquina Virtual Java | É o "motor" que executa o código Java. Ela traduz o código compilado (bytecode) para a linguagem de máquina do seu computador. |
| **JRE** | *Java Runtime Environment* | Ambiente de Execução | Contém a **JVM** + Bibliotecas padrão do Java. É o mínimo necessário para **rodar** um programa Java. |
| **JDK** | *Java Development Kit* | Kit de Desenvolvimento | Contém a **JRE** + Ferramentas de desenvolvimento (como o compilador `javac`). É necessário para **criar** programas Java. |

### O Lema: "Write Once, Run Anywhere"
O grande trunfo do Java é o lema **"Escreva uma vez, execute em qualquer lugar"**.
Isso é possível graças à **JVM**. Você escreve e compila o seu código no Windows, por exemplo, e esse mesmo código compilado (bytecode) roda no Linux, Mac ou qualquer dispositivo que tenha uma JVM compatível, sem precisar alterar uma linha de código.

---

## 4. Especificações e Evolução

O Java não é propriedade de uma única empresa no sentido de evolução; ele segue processos abertos de especificação:

*   **JSR (*Java Specification Request*)**: São documentos formais que descrevem propostas de novas tecnologias ou mudanças na plataforma Java.
*   **JEP (*JDK Enhancement Proposal*)**: É o roteiro de melhorias para o JDK e o OpenJDK. É através das JEPs que novas funcionalidades (como *Records*, *Pattern Matching*) são introduzidas.

---

## 5. Como Instalar o Java

Hoje em dia, existem várias distribuições do JDK. Abaixo, o guia recomendado para diferentes sistemas.

### No Windows
Recomendamos o uso do **Eclipse Adoptium (Temurin)**, que fornece binários OpenJDK de alta qualidade.

1.  Acesse o site [Adoptium.net](https://adoptium.net/).
2.  Baixe o instalador `.msi` da versão LTS mais recente (ou a que desejar).
3.  Execute o instalador. **Importante:** Na tela de customização, certifique-se de marcar a opção **"Set JAVA_HOME variable"** ou **"Add to PATH"**.

### No Linux e macOS (Via SDKMAN!)
A melhor forma de gerenciar versões do Java em sistemas baseados em Unix é usando o **SDKMAN!**.

1.  **Instale o SDKMAN!** (abra o terminal e cole):
    ```bash
    curl -s "https://get.sdkman.io" | bash
    ```
2.  Siga as instruções na tela e depois reinicie o terminal ou rode:
    ```bash
    source "$HOME/.sdkman/bin/sdkman-init.sh"
    ```
3.  **Instale o Java**:
    Para listar as versões disponíveis:
    ```bash
    sdk list java
    ```
    Para instalar a versão **Amazon Corretto 25** (jdk utilizada no curso):
    ```bash
    sdk install java 25-amzn
    ```

---

### Links Úteis e Referências
*   [História do Java (por: Giuliana Bezerra)](https://giulianabezerra.medium.com/uma-breve-historia-do-java-f58d1761154)
*   [Site Oficial do SDKMAN!](https://sdkman.io/)
*   [Eclipse Adoptium (Temurin)](https://adoptium.net/)
*   [OpenJDK JEPs](https://openjdk.org/jeps/0)
