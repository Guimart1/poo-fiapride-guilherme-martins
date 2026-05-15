# Projeto FiapRide - [Seu Nome Completo]

## 👤 Informações do Aluno

- **Nome:** [Guilherme Martins dos Santos]  
- **RM:** [566570]  
- **Turma:** [2CCPX]  
- **Curso:** [Ciência da Computação]  
- **GitHub:** [@guimart1]  

---

## 📌 Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).

---

## ✅ Checklist de Implementação

- [x] Aula 1 - Classes e Objetos  
- [x] Aula 2 - Métodos  
- [x] Aula 3 - Encapsulamento  
- [x] Aula 4 - Construtores  
- [x] Aula 5 - Associação  
- [x] Aula 6 - Herança  
- [x] Aula 7 - Polimorfismo  
- [x] Aula 8 - Classes Abstratas  
- [x] Aula 9 - Interfaces  

---

## 🧠 Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:**  
Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas?

**Sua Resposta:**  
A classe Passageiro ajuda a organizar os dados e representar melhor o mundo real dentro do sistema. Usar variáveis soltas funcionaria apenas em casos muito simples, mas em um sistema com muitos usuários ficaria desorganizado e difícil de manter. Com a classe, podemos criar vários objetos com a mesma estrutura de forma prática, deixando o código mais organizado, escalável e fácil de entender.

---

### Aula 2 - Métodos

**Pergunta:**  
Por que criar métodos em vez de alterar atributos diretamente?

**Sua Resposta:**  
Os métodos são importantes porque controlam como os dados podem ser alterados. Em vez de modificar atributos diretamente, usamos métodos que aplicam regras, como validar valores. Isso evita erros e possíveis problemas no sistema, tornando o código mais seguro e confiável.

---

### Aula 3 - Encapsulamento

**Pergunta:**  
Por que atributos são `private`, mas métodos `get` são públicos?

**Sua Resposta:**  
O uso de atributos private impede que qualquer parte do código altere os dados diretamente, protegendo a integridade das informações. Já os métodos get permitem acessar esses dados de forma segura. Assim, o sistema mantém controle sobre os valores e evita alterações incorretas.

---

### Aula 4 - Construtores

**Pergunta:**  
Por que não devemos gerar getters e setters para tudo automaticamente?

**Sua Resposta:**  
Nem todos os atributos devem ter setters, pois alguns dados não devem ser alterados após a criação do objeto. Controlar isso evita erros e mantém a lógica próxima da realidade. Criar métodos específicos para alteração garante mais segurança e evita mudanças indevidas no sistema.

---

### Aula 5 - Associação

**Pergunta:**  
Por que usar objetos em vez de apenas Strings em associações?

**Sua Resposta:**  
Usar objetos permite acessar não só o nome, mas também outras informações e comportamentos relacionados. Se fosse apenas uma String, o sistema ficaria limitado e não conseguiria, por exemplo, acessar o saldo do passageiro. A associação com objetos deixa o sistema mais completo e funcional.
---

### Aula 6 - Herança

**Pergunta:**  
Por que a classe filha não pode acessar diretamente atributos privados da mãe?

**Sua Resposta:**  
A classe filha não acessa diretamente atributos privados da mãe para manter o encapsulamento. Isso garante que os dados sejam manipulados apenas de forma controlada, evitando erros e protegendo a consistência do sistema.

---

### Aula 7 - Polimorfismo

**Pergunta:**  
Por que o método precisa estar na classe base?

**Sua Resposta:**  
O método precisa estar na classe base porque é ela que define o que todos os objetos devem ter em comum. Isso permite tratar diferentes tipos de objetos de forma uniforme, garantindo que o código funcione corretamente mesmo usando referências genéricas.

---

### Aula 8 - Classes Abstratas

**Pergunta:**  
Por que uma classe deve ser abstrata?

**Sua Resposta:**  
A classe abstrata impede a criação de objetos incompletos. Ela serve como base para outras classes mais específicas. Isso ajuda a manter a lógica correta, garantindo que apenas objetos completos e válidos sejam criados.

---

### Aula 9 - Interfaces

**Pergunta:**  
Por que Java permite múltiplas interfaces, mas não múltipla herança?

**Sua Resposta:**  
Interfaces permitem que uma classe siga vários contratos sem causar conflitos. Já a herança múltipla poderia gerar problemas quando dois métodos têm o mesmo nome. As interfaces evitam isso e trazem mais flexibilidade ao sistema.
---

## 🚀 Desafios Técnicos Implementados

### Projeto Pessoal

- **Domínio escolhido:** Aeroporto
- **Classes criadas:** 
Passageiro
Voo
Operavel
VeiculoAeroporto
Aviao
Helicoptero
Main

**Maior desafio técnico:**  
O maior desafio foi entender vários detalhes ao mesmo tempo enquanto montava o código. No começo, fiquei meio perdido sobre o que deveria ser private ou public, porque dá vontade de deixar tudo público só pra “funcionar rápido”. Mas depois percebi que isso não é seguro, principalmente no caso do saldo do passageiro, que precisa ser controlado por métodos.
Também tive dificuldade em organizar os arquivos nos packages, porque se colocar errado ou esquecer um import, o programa já para de funcionar. Isso acabou me fazendo prestar mais atenção na estrutura do projeto.
Outra coisa que não foi tão simples foi entender a herança na prática. Saber quando usar extends e como as classes filhas realmente usam o que vem da classe mãe levou um tempo. Além disso, quando a classe é abstrata ou tem interface, também precisei pensar melhor onde cada método deveria ficar.
---

## 📚 Conclusão

**O que você aprendeu nessas 9 aulas?**  
Aprendi principalmente como organizar melhor o código usando Programação Orientada a Objetos. Entendi como classes ajudam a estruturar o sistema, como métodos controlam as ações e como conceitos como encapsulamento, herança e polimorfismo deixam o código mais seguro e reutilizável. Também passei a enxergar melhor como tudo se conecta dentro de um projeto.

**Qual conceito foi mais difícil?**  
O conceito mais difícil foi herança e polimorfismo, porque no começo é meio confuso entender como as classes se relacionam e como os métodos funcionam nas classes filhas. Também tive dificuldade em saber exatamente onde cada método deveria ficar, mas com prática ficou mais claro.

**O que você melhoraria no projeto?**  
Eu melhoraria a organização geral e adicionaria mais funcionalidades, como mais tipos de veículos ou mais validações nos dados. Também deixaria o sistema mais completo, talvez com listas ou interação com o usuário, para simular melhor um sistema real.

---
``
