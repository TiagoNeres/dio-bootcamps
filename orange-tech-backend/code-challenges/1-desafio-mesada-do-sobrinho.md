# 1 - Desafio: Mesada do Sobrinho

## **Desafio**

Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês, ele quer saber quanto terá se juntar todo o dinheiro, sem gastar nada, durante alguns meses. E você, como um bom tio com habilidades de programação, vai criar um programa que com as entradas do seu sobrinho vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses.

```java
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int entrada = leitor.nextInt();
        int resultado = valorFinal(entrada);
        System.out.println(resultado);

    }
    public static int valorFinal(int mes) {
        return mes * 50;
    }
}
```
