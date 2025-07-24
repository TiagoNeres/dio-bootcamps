# Conceito básico

## Programação Orientada a Objeto:

Torna o código mais organizado, reutilizável e fácil de manter.

### Classe:

 É o **molde** para criar objetos, definindo com os seguintes `membros`**atributos** e **métodos** (conceitos do mundo real). 

1. O nome da classe deve ser **significativo** e geralmente escrito com a **primeira letra maiúscula** e logo após em **CamelCase**.

2. **Contrução da classe**: Atributos - Construtor - Gets e Sets - Métodos

### Atributo:

São as **características** (dados) de um objeto, definidas e usadas em **classes e objetos**. Diferem-se das variáveis comuns porque estão diretamente ligadas a uma classe(variáveis de instância).

1.    Devem ter **nomes significativos**, geralmente usando **substantivos** ou **adjetivos**,
que representem claramente o que armazenam. 

### Método:

São as **ações** ou **comportamentos** de um objeto, **executadas quando há uma
requisição** (chamada). Devem ter nomes significativos com **verbos**, pois representam o que o objeto faz.

1. **Construtor**: Método especial que **inicializa** o objeto ao ser criado.
   
   * **Construtor simples**: Quando você deseja fornecer **valores padrões** para o objeto.
   
   * **Construtor com** **this**: Quando você quer criar o objeto com
     **valores específicos**, fornecidos pelo usuário (ou outro código) ao instanciá-lo.

2. **Destrutor**: Método chamado quando o objeto é **removido
   da memória.**

3. **Sobrecarga (Overload)**: Permite definir, `na mesma classe`, são **métodos com o mesmo nome**, mas com **parâmetros diferentes**(resolvida em tempo de compilação).

4. **Sobrescrita (Override)**: Permite que uma **subclasse** modifique o comportamento de um **método herdado** da superclasse. Usa a anotação `@Override` (resolvida em tempo de execução).

**Obs**: `@Override` indica que um método está sobrescrevendo um método da superclasse, garantindo que o método seja compatível e evitando erros de compilação.

### Objeto:

É uma **instância de uma classe**; um ser individual com atributos e métodos.  

### Mensagem:

É o pedido feito a um objeto para que ele execute uma ação (chamada de método).

---

### Visibilidade

- Private: Só dentro da classe

- Protected: Dentro da classe, mesmo pacote e subclasses(herança)

- Public: em qualquer lugar

### Organização de pacotes

### `package`

Um **package** é como uma **pasta** onde você organiza suas classes Java. Ele ajuda a **organizar o código** e **evitar conflitos** de nomes.

### `import`

O `import` serve para **usar uma classe** que está em outro pacote.
