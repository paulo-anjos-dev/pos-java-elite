# Variáveis, Operadores e Condicionais em Java

Neste capítulo, vamos mergulhar nos fundamentos da programação em Java: como armazenar dados, como manipulá-los e como fazer o programa tomar decisões.

---

## 1. Tipos de Dados: Primitivos vs. Referência

Em Java, os tipos de dados são divididos em dois grandes grupos: **Primitivos** e **Tipos de Referência**.

### Tipos Primitivos
Os tipos primitivos são os blocos de construção básicos. Eles armazenam valores puros e possuem tamanho fixo na memória.

| Tipo | Tamanho | Valor Mínimo | Valor Máximo | Exemplo |
| :--- | :--- | :--- | :--- | :--- |
| **byte** | 8 bits | -128 | 127 | `byte b = 10;` |
| **short** | 16 bits | -32.768 | 32.767 | `short s = 1000;` |
| **int** | 32 bits | -2.147.483.648 | 2.147.483.647 | `int i = 50000;` |
| **long** | 64 bits | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 | `long l = 100L;` |
| **float** | 32 bits | 1.4e-45 | 3.4e+38 | `float f = 10.5F;` |
| **double** | 64 bits | 4.9e-324 | 1.8e+308 | `double d = 10.5D;` |
| **char** | 16 bits | '\u0000' (0) | '\uffff' (65.535) | `char c = 'A';` |
| **boolean**| 1 bit* | `false` | `true` | `boolean b = true;` |

*\*O tamanho do boolean não é definido de forma exata pela JVM, mas conceitualmente representa 1 bit.*

#### Observações Importantes:
*   **Identificadores de Literais:** Para o tipo `float`, é **obrigatório** usar o sufixo `F` ou `f` (ex: `10.5f`). Para o `double`, o sufixo `D` ou `d` é opcional, pois ele é o padrão para números decimais. Para `long`, usamos `L`.
*   **Underscore (Java 7+):** A partir do Java 7, você pode usar o sublinhado (`_`) para melhorar a legibilidade de números grandes: `int populacao = 200_000_000;`. O compilador ignora os underscores.

### Por que String não é Primitivo?
A `String` é uma **Classe** (Tipo de Referência). Enquanto um `int` guarda apenas o número, uma `String` é um objeto que guarda uma sequência de caracteres e possui vários métodos úteis (como `.length()`, `.toUpperCase()`, etc.). Primitivos não possuem métodos.

---

## 2. Operadores

Os operadores permitem realizar operações sobre as variáveis. Eles são divididos em categorias dependendo da funcionalidade.

| Categoria | Operadores | Descrição | Exemplo |
| :--- | :--- | :--- | :--- |
| **Sufixo** | `expr++`, `expr--` | Pós-incremento e decremento | `i++` |
| **Unário** | `++expr`, `--expr`, `+`, `-`, `!`, `~` | Pré-incremento/decremento, sinal, negação lógica | `!true` |
| **Multiplicativo**| `*`, `/`, `%` | Multiplicação, divisão e resto | `10 % 3` (1) |
| **Aditivo** | `+`, `-` | Soma e subtração | `5 + 2` |
| **Mudança (Shift)**| `<<`, `>>`, `>>>` | Deslocamento de bits | `8 >> 1` (4) |
| **Relacional** | `<`, `>`, `<=`, `>=`, `instanceof` | Comparação de valores e tipo | `x > 10` |
| **Igualdade** | `==`, `!=` | Verifica se é igual ou diferente | `a == b` |
| **Bitwise** | `&`, `^`, `|` | E, OU exclusivo e OU (bit a bit) | `5 & 1` |
| **Lógico** | `&&`, `||` | E e OU lógico (curto-circuito) | `cond1 && cond2` |
| **Ternário** | `? :` | Atalho para if-else | `(x > y) ? x : y` |
| **Atribuição** | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `^=`, `|=`, `<<=`, `>>=`, `>>>=` | Atribui valor | `x += 5` |

### Detalhando os Operadores

#### 2.1. Operadores de Sufixo e Unários
Estes operadores trabalham com apenas um operando.
- **`expr++` / `expr--` (Pós-fixado):** O valor é usado na expressão primeiro e depois incrementado/decrementado.
- **`++expr` / `--expr` (Pré-fixado):** O valor é incrementado/decrementado primeiro e depois usado na expressão.
- **`+` / `-`:** Indica valor positivo (padrão) ou negativo.
- **`!`:** Inverte um valor booleano (Negação Lógica).
- **`~`:** Inverte os bits de um valor (Complemento de bit).

#### 2.2. Operadores Aritméticos (Multiplicativos e Aditivos)
Usados para cálculos matemáticos básicos.
- **`*`, `/`, `+`, `-`:** As quatro operações básicas.
- **`%` (Módulo):** Retorna o resto da divisão. Ex: `10 % 3` resulta em `1`.

#### 2.3. Operadores de Mudança (Shift)
Trabalham com a representação binária dos números, movendo os bits para a esquerda ou direita.
- **`<<`:** Desloca bits para a esquerda (multiplica por 2 a cada casa).
- **`>>`:** Desloca bits para a direita preservando o sinal (divide por 2).
- **`>>>`:** Desloca bits para a direita preenchendo com zero (sempre positivo).

#### 2.4. Operadores Relacionais e de Igualdade
Usados para comparar valores. O resultado é sempre um `boolean` (`true` ou `false`).
- **`<`, `>`, `<=`, `>=`:** Comparações matemáticas tradicionais.
- **`instanceof`:** Verifica se um objeto é de um determinado tipo (Classe).
- **`==`:** Verifica se dois valores são iguais.
- **`!=`:** Verifica se dois valores são diferentes.

#### 2.5. Operadores Lógicos e Bitwise
- **`&`, `|`, `^`:** Operações de E, OU e OU Exclusivo. Quando usados com números, operam bit a bit. Quando usados com booleanos, operam logicamente mas avaliam ambos os lados.
- **`&&` (AND) / `||` (OR):** Operadores lógicos de **curto-circuito**. Se o resultado já puder ser determinado pelo primeiro operando, o segundo não é nem avaliado. É o mais comum em condições `if`.

#### 2.6. Operador Ternário
Uma forma compacta de escrever um `if-else`.

> 💡 **Exemplo prático:** Veja o código completo em [`VariaveisOperadoresCondicionais.java`](../../src/modulo0/VariaveisOperadoresCondicionais.java)

```java
// Estrutura: condição ? valor_se_verdadeiro : valor_se_falso;
int nota = 8;
String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
```

#### 2.7. Operadores de Atribuição
Além do `=`, existem os operadores compostos que realizam uma operação e atribuem o resultado de uma vez.
- `x += 5` é o mesmo que `x = x + 5`.
- Funciona com quase todos os operadores aritméticos e de bit.

---

## 3. Estruturas Condicionais

As condicionais controlam o fluxo de execução do código.

### If, Else If e Else
Usado quando você quer testar condições lógicas.
```java
int idade = 18;

if (idade < 13) {
    System.out.println("Criança");
} else if (idade < 18) {
    System.out.println("Adolescente");
} else {
    System.out.println("Adulto");
}
```

### Switch Case
Ideal para quando você tem múltiplos valores fixos para testar na mesma variável.
```java
String dia = "SEGUNDA";

switch (dia) {
    case "SEGUNDA":
        System.out.println("Início da semana");
        break;
    case "SEXTA":
        System.out.println("Chegou o fim de semana!");
        break;
    default:
        System.out.println("Dia comum");
}
```
*Dica: Não esqueça do `break` para evitar que o código "atropele" os próximos casos.*

---

## 4. Referências e Links Úteis

*   [Documentação Oficial da Oracle: Tipos de Dados Primitivos](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
*   [Documentação Oficial da Oracle: Operadores](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
*   [W3Schools Java Operators](https://www.w3schools.com/java/java_operators.asp)
*   [Documentação Oficial da Oracle: Java Underscores in Literals](https://docs.oracle.com/javase/8/docs/technotes/guides/language/underscores-literals.html)
