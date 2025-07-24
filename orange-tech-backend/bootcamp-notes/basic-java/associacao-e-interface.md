### Associação

é a interação entre **classe** e **objeto**.

#### Tipos:

* Associação de forma **Estrutural**(Atributos)
  
  * <u>Composição</u> "Com parte todo"
    
    EX: pessoa e endereço
  
  ```java
  class Pessoa {
      Endereco endereco; // Cria um atributo derivado da classe Endereço
  }
  ```
  
  * <u>Agregação </u>"Sem parte todo" 
    
    EX: Disciplina e Aluno
    
    ```java
    class Disciplina {
        Aluno aluno; // Cria um atributo derivado da classe Aluno
    }
    ```
    
    **Agregação x Composição**
    
    - **Agregação:** relação onde um objeto pode existir independentemente do todo.
    
    - **Composição:** relação onde o objeto parte depende totalmente do todo para existir.

* Associação de forma **Comportamental** (Métodos)
  
  * <u>Dependência</u> "Depende de"

```java
class Compra {
    ...
finalizar(...){ ... }
finalizar(Cupom cupom, ...){ ... } // Usa o objeto Cupom como parâmetro
}
```

**Herança x Associação**

| Conceito       | Relação        | Exemplo Simples        |
| -------------- | -------------- | ---------------------- |
| **Herança**    | "é um"         | Cachorro é um Animal   |
| **Associação** | "usa"/"tem um" | Pessoa tem um Endereco |

### Interface

É um **contrato** que define **métodos que uma classe deve implementar**, fazendo **apenas a assinatura dos métodos**.  Diferente da **herança**, a interface **não herda comportamento**, apenas **obriga a seguir um padrão**. É usada para **padronizar ações entre classes diferentes**. o que facilita o uso de **polimorfismo**

```java
interface Operacao {
    void somar(double valor1, double valor2); // Assinatura do método
    void subtrair(double valor1, double valor2);
}

class Calcular implements Operacao {
    // Implementação dos métodos da interface
    @Override 
    public void somar(double valor1, double valor2) {
        ...
    }
    // @Override garanti a sobrescrição do método.
    @Override
    public void subtrair(double valor1, double valor2) {
       ...
    }
}
```
