## Como criar uma chave SSH

1. No terminal digite: **ssh-keygen -t ed25519 -C exemplo@gmail.com**

2. Navegue até a pasta informada no terminal após a criação da chave. 
   
   Exemplo: **/home/tiago4neres/.ssh/id_ed25519**

3. Ainda no terminal, dentro da pasta `.ssh`, digite: **cat id_ed25519.pub**

4. Copie o conteúdo exibido no terminal (essa é sua chave pública) e adicione no GitHub em: *Settings > SSH and GPG keys > New SSH key*

5. No terminal, inicie o agente SSH: **eval #(ssh-agent -s)** 

6. Em seguida, adicione sua chave privada ao agente: **ssh-add id_ed25519**

7. Pronto! Agora você pode usar comandos como o **git clone**
