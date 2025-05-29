# Comandos do Terminal (Linux)

## **Comandos básicos**

---

📁 **Navegação no sistema de arquivos**

| Comando | Nome (Significado)          | Descrição                                      |
| ------- | --------------------------- | ---------------------------------------------- |
| `pwd`   | **Print Working Directory** | Mostra o caminho completo do diretório atual   |
| `ls`    | **List**                    | Lista arquivos e pastas no diretório atual     |
| `ls -l` | **List (long format)**      | Lista arquivos em formato detalhado            |
| `ls -a` | **List (All)**              | Lista arquivos, incluindo ocultos              |
| `cd`    | **Change Directory**        | Muda para outro diretório                      |
| `cd ..` | &mdash;(volta um nível)     | Volta um nível na estrutura de diretórios      |
| `cd ~`  | &mdash;(home)               | Vai para o diretório pessoal do usuário (home) |
| `cd /`  | &mdash;(raiz)               | Vai para o diretório raiz do sistema           |

---

📂 **Manipulação de arquivos e pastas**

| Comando                     | Nome (Significado)     | Descrição                           |
| --------------------------- | ---------------------- | ----------------------------------- |
| `mkdir`                     | **Make Directory**     | Cria uma nova pasta                 |
| `touch`                     | **Touch**              | Cria um novo arquivo vazio          |
| `cp <NomeAtual> <novoNome>` | **Copy**               | Copia arquivos ou pastas            |
| `mv <origem> <destino>`     | **Move / Rename**      | Move ou renomeia arquivos ou pastas |
| `rm <arquivo>`              | **Remove**             | Remove arquivos                     |
| `rm -r <pasta>`             | **Remove Recursively** | Remove pastas e todo seu conteúdo   |
| `cat`                       | **Concatenate**        | Exibe o conteúdo de arquivos        |

| Comando        | Cria arquivo | Apaga conteúdo | Escreve conteúdo      |
| -------------- | ------------ | -------------- | --------------------- |
| `touch`        | ✅            | ❌              | ❌                     |
| `echo > file`  | ✅            | ✅              | ✅ (sobrescreve)       |
| `echo >> file` | ✅            | ❌              | ✅ (adiciona ao final) |

**Exemplos:**

```bash
echo "Olá, mundo!" > arquivo.txt        # sobrescreve todo o conteúdo
echo "Mais uma linha" >> arquivo.txt    # adiciona ao final
```

---

🔍 **Busca e localização (interno)**

| Comando  | Nome (Significado)        | Descrição                                          |
| -------- | ------------------------- | -------------------------------------------------- |
| `find`   | **Find**                  | Busca arquivos e pastas por nome                   |
| `locate` | &mdash;(localizar rápido) | Busca arquivos usando banco de dados (mais rápido) |

---

📦 **Pacotes (Debian/Ubuntu)**

| Comando       | Nome (Significado)         | Descrição                               |
| ------------- | -------------------------- | --------------------------------------- |
| `apt`         | **Advanced Package Tool**  | Gerenciador de pacotes do sistema       |
| `apt update`  | &mdash;(atualizar lista)   | Atualiza a lista de pacotes disponíveis |
| `apt upgrade` | &mdash;(atualizar pacotes) | Atualiza os pacotes instalados          |
| `apt install` | &mdash;(instalar pacote)   | Instala um novo pacote                  |
| `apt remove`  | &mdash;(remover pacote)    | Remove um pacote instalado              |
