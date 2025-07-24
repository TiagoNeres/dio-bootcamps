# # Tipos e Variáveis

## **Tipos de Dados em Java**

Java possui **8 tipos primitivos** (não são objetos e armazenam valores diretamente na memória *stack*):

| Tipo      | Tamanho | Valores                        |
| --------- | ------- | ------------------------------ |
| `byte`    | 1 byte  | -128 a 127                     |
| `short`   | 2 bytes | -32.768 a 32.767               |
| `int`     | 4 bytes | -2.147.483.648 a 2.147.483.647 |
| `long`    | 8 bytes | Números inteiros muito grandes |
| `float`   | 4 bytes | ±3,4028E+38 (6–7 dígitos)      |
| `double`  | 8 bytes | ±1,7976E+308 (15 dígitos)      |
| `boolean` | 1 bit   | `true` ou `false`              |
| `char`    | 2 bytes | Um único caractere Unicode     |

> **Dica:** Use `int` para inteiros e `double` para decimais na maioria dos casos.

---

## **Declaração de Variáveis**

**Sintaxe:**

`<Tipo> <nomeVariavel> = <valorOpcional>;`

**Exemplos:**

`int idade; int anoFabricacao = 2025; double salarioMinimo = 1400.00;`

**Atenção a sufixos obrigatórios:**

- `long` → termina com `L`: `long cpf = 12345678901L;`

- `float` → termina com `F`: `float pi = 3.14F;`

---

## **Regras de Tipagem**

- Java é **fortemente tipado**: não permite conversões implícitas de tipos maiores para menores sem casting.

`short numeroCurto = 1;`

`int numeroNormal = numeroCurto;`

`short numeroCurto2 = numeroNormal; // ERRO!`

---

## **Constantes**

- Declaradas com a palavra-chave `final`.

- Valor **não pode ser alterado** após a atribuição.

- Nome por convenção: **em CAIXA ALTA**.

`final double VALOR_DE_PI = 3.14;`

`VALOR_DE_PI = 3.15; // Erro de compilação!`
