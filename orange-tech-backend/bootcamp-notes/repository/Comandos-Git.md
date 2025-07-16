# Comandos Git

### 📁 **Inicialização e configuração**

| Comando                                          | Descrição                                                                       |
| ------------------------------------------------ | ------------------------------------------------------------------------------- |
| `git init`                                       | Inicia um repositório Git local.                                                |
| `git clone <url>`                                | Clona um repositório remoto (ex: do GitHub).                                    |
| `git config --global user.name "Seu Nome"`       | Configura seu nome de usuário.                                                  |
| `git config --global user.email "seu@email.com"` | Configura seu e-mail.                                                           |
| `git config --list`                              | Exibe todas as configurações do Git em uso (nome, e-mail, editor, aliases etc). |

---

### 💾 **Trabalhando com arquivos**

| Comando                      | Descrição                                                               |
| ---------------------------- | ----------------------------------------------------------------------- |
| `git status`                 | Mostra o status dos arquivos (modificados, staged, etc).                |
| `git add <arquivo>`          | Adiciona um arquivo para a área de staging.                             |
| `git add *`                  | Adiciona todos os arquivos modificados.                                 |
| `git commit -m "mensagem"`   | Cria um commit com uma mensagem descritiva.                             |
| `git rm <arquivo>`           | Remove um arquivo do Git **e** do seu disco local.                      |
| `git rm --cached <arquivo>` | Remove um arquivo **somente do Git**, mas mantém ele no disco.          |
| `git rm -r <pasta>/`         | Remove uma **pasta e todos os arquivos dentro** dela do Git e do disco. |
| `git mv <antigo> <novo>`     | Move ou renomeia um arquivo/diretório no repositório Git.               |

---

### 🌐 **Repositórios remotos**

| Comando                       | Descrição                                                                   |
| ----------------------------- | --------------------------------------------------------------------------- |
| `git remote add origin <url>` | Conecta seu repositório local ao GitHub.                                    |
| `git push -u origin main`     | Envia o branch principal pela primeira vez.                                 |
| `git push`                    | Envia commits para o GitHub.                                                |
| `git pull`                    | Puxa atualizações do repositório remoto.                                    |
| `git remote -v`               | Mostra a lista os repositórios remotos conectados ao seu repositório local. |
