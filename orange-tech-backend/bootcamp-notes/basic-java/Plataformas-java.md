# Plataformas

A linguagem Java permite desenvolver aplicações para diversas finalidades, como **desktop**, **web**, **dispositivos móveis** e **embarcados**, graças às suas plataformas organizadas.

## Principais Plataformas

![alt](/home/tiago3neres/Documentos/dio-bootcamps/orange-tech-backend/bootcamp-notes/basic-java/images/plataformas-java.png)

- **JSE (Java Standard Edition)** 
  Base da linguagem. Para PCs e servidores. Inclui bibliotecas básicas e o **Swing** para interfaces gráficas.

- **JEE (Java Enterprise Edition)** 
  Voltada para aplicações **corporativas e web**. Inclui frameworks como **JPA**, **JSP**, entre outros.

- **JME (Java Micro Edition)** 
  Para dispositivos **móveis e embarcados**.

- **JFX (JavaFX)** 
  Criação de aplicações com **interface moderna**, áudio e vídeo.

---

## Componentes da Plataforma Java

### JDK (Java Development Kit) – Para desenvolvimento

- Compilador (`javac`)
- Máquina virtual (JVM)
- Bibliotecas de desenvolvimento
- Ferramentas como `javadoc` e depurador
- **Inclui a JRE**

### JRE (Java Runtime Environment) – Para execução

- JVM + bibliotecas de execução
- Necessário para **rodar** aplicativos Java (ex: arquivos `.jar`)
- **Não permite programar**, apenas executar

---

## ⚙️ Processo de Desenvolvimento Java

![alt](/home/tiago3neres/Documentos/dio-bootcamps/orange-tech-backend/bootcamp-notes/basic-java/images/processo-de-desenvolvimento.png)

1. O código é escrito em arquivos `.java`
2. Compilado com `javac`, gerando arquivos `.class` com **bytecode**
3. A **JVM (Java Virtual Machine)** interpreta esse bytecode e o executa
