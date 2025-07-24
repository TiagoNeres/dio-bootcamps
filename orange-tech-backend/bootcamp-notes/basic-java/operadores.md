## 

# Operadores

---

### Atribuição

Representado pelo símbolo de igualdade `=`.
---

### Aritméticos

Os operadores aritméticos são: `+` (adição), `-` (subtração), `*` (multiplicação), `/` (divisão) e `%` (resto).

* **ATENÇÃO!** O operador de **adição (+)**, quando utilizado em variáveis do tipo texto, realizará a “**concatenação de textos**”. 

---

### Unários

Esses operadores são aplicados juntamente com um outro operador aritmético.

* (+) **Operador unário de valor positivo** – números são positivos sem esse operador explicitamente;
- (-) **Operador unário de valor negativo** – nega um número ou expressão aritmética;
- (++) **Operador unário de incremento de valor** – incrementa o valor em 1 unidade;
- (--) **Operador unário de decremento de valor** – decrementa o valor em 1 unidade;
- (!) **Operador unário lógico de negação** – nega o valor de uma expressão booleana;
  <mark>**Ordem importa:**</mark> `++num` incrementa antes, `num++` depois.

---

### **Operador Ternário**

Usado como atalho para `if/else`.
` <Expressão Condicional>`` ` **?**` ``<Caso condição seja true>` **:**`  ``<Caso condição seja false> ;`

---

### Operadores Relacionais

Os operadores relacionais avaliam a **relação entre duas variáveis ou expressões**. Neste caso, **retornando um valor booleano** como resultado.

- `==` Quando desejamos verificar se uma variável é IGUAL A outra.
- `!=` Quando desejamos verificar se uma variável é DIFERENTE da outra.
- `>` Quando desejamos verificar se uma variável é MAIOR QUE a outra.
- `>=` Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
- `<` Quando desejamos verificar se uma variável é MENOR QUE outra.
- `<=` Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

---

### Comparações Avançadas: `==` **VS** `equals()`

`==` : Compara **endereços de memória (referência)** em objetos.
`.equals()` : Compara o **conteúdo** dos objetos.

#### **Dica Geral:**

- Use `==` apenas com **tipos primitivos**.

- Para **objetos** e **strings**, prefira sempre **`.equals()`** para garantir a comparação correta de conteúdo. 
  
  **Exemplo**: string1.equals(string2)

---

### Operadores Lógicos

| Operador | Nome          | Função                                                  |
| -------- | ------------- | ------------------------------------------------------- |
| `&&`     | E (AND)       | Verdadeiro se **ambas** as expressões forem verdadeiras |
| `\|      | `             | OU (OR)                                                 |
| `!`      | Negação (NOT) | Inverte valor booleano                                  |

* A **duplicidade** nos operadores lógicos é um recurso conhecido como ***Operador Abreviado***, isso quer que se a *condição1* atender aos critérios não será necessário validar a *condição2*.

---

# 
