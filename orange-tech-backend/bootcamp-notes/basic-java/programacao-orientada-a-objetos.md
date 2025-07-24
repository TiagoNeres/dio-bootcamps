# Programação Orientada a Objetos

### Encapsulamento:

Esconde os **detalhes internos de implementação** e expõe apenas o que é **necessário para o uso de um objeto**. Isso ajuda a **proteger os dados** e manter a **integridade do sistema**, permitindo que as **modificações** sejam feitas de forma **controlada**.

### Abstração:

Simplifica o modelo, permitindo que você se concentre apenas nas características **essenciais** de um objeto, sem se preocupar com a **implementação detalhada**. Ela ajuda a representar **conceitos do mundo real** de maneira simplificada.

### Herança:

Permite que uma classe herde características e comportamentos de outra, promovendo a **reutilização de código**. Isso cria uma **relação hierárquica** entre as classes, com classes mais gerais que são especializadas por classes mais específicas.

1. Upcasting é quando um **objeto da subclasse** é tratado como **superclasse**.

```java
Animal a = new Cachorro(); // Upcasting
a.fazerSom();              // Imprime "Latido"
```

2. Downcasting é quando uma **referência da superclasse** é convertida de volta para a **subclasse real**.

### Polimorfismo:

Permite usar o **mesmo nome de método** com **diferentes comportamentos**, seja pela **sobrecarga** (parâmetros diferentes) ou pela **sobrescrita** (classes diferentes, mesmo nome e assinatura), com `upcasting `sendo essencial para o polimorfismo em tempo de execução.

1. **<u>Polimorfismo de sobrecarga</u>** (tempo de compilação) é quando você tem **métodos com o mesmo nome**, mas com **parâmetros diferentes**, **na mesma classe**.

2. **<u>Polimorfismo de sobrescrita</u>** (tempo de execução) é quando uma **subclasse sobrescreve** um método da superclasse, **mantendo o mesmo nome e parâmetros**.

---

**RESUMO**

| **Conceito**       | **Descrição**                                                                         |
| ------------------ | ------------------------------------------------------------------------------------- |
| **Encapsulamento** | Proteger os dados do objeto, tornando atributos privados.                             |
| **Herança**        | Uma classe pode herdar atributos e métodos de outra classe.                           |
| **Polimorfismo**   | Objetos de diferentes classes podem ter o mesmo método com comportamentos diferentes. |
| **Abstração**      | Esconder os detalhes complexos e mostrar apenas o necessário.                         |
