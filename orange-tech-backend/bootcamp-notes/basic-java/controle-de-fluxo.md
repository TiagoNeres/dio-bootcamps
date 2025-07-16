# Controle de Fluxo

### Condicional: `if`, `else if`, `else`

```
int idade = 20;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### Estrutura `switch`

```
int dia = 2;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    default:
        System.out.println("Outro dia");
}
```

### Laços de Repetição

### `while`

```
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### `for`

```
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### `do-while`

```
int x = 0;
do {
    System.out.println(x);
    x++;
} while (x < 5);
```

### Bloco de Código

Conjunto de comandos agrupados entre `{ }`. Define escopos e estruturas.

```
if (true) {
    int valor = 10;
    System.out.println(valor);
}
```

- **Variáveis declaradas dentro de um bloco só existem dentro dele (escopo local).**

---
