# Fitness API

Boas-vindas ao repositório do exercício Fitness API

Para realizar o exercício, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**, nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu exercício a partir desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos
Ao iniciar este exercício, você concorda com as diretrizes do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu exercício, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79) e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

Neste projeto você deverá implementar uma API para gerenciar exercícios físicos.

Você deve implementar a API REST utilizando o Spring e aplicando os conceitos que aprendeu, incluindo camada de serviço, DTOs, record e as anotações para mapeamento de rotas.

</details>

<details>
  <summary><strong>:memo: Habilidades a serem trabalhadas</strong></summary>

Neste exercício, verificamos se você é capaz de:

- Compreender os princípios e conceitos fundamentais do desenvolvimento de APIs RESTful utilizando o Spring Framework;
- Projetar e configurar mapeamentos de rotas para diferentes operações HTTP, como GET, POST, PUT e DELETE

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`  

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu exercício:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-exercício`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do exercício os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do exercício:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o exercício. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_ do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste exercício o `Checkstyle`. Assim o código estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção! Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos

### 1 - Implemente os DTOs

<details>
  <summary>Neste requisito você deve implementar os DTOs `WorkoutDto` e `WorkoutCreationDto`</summary><br />

Os atributos dos DTOs deverão seguir a mesma nomenclatura e tipos de atributos já definidos no modelo `Workout`, classe já disponibilizada com o projeto.

Os DTOs devem seguir os seguintes critérios:
 - Devem ser implementados no pacote `com.betrybe.fitness.dto`;
 - Devem ser implementados utilizando a funcionalidade `record` do Java;
 - Devem ser diferenciados do modelo original da seguinte maneira:
   - `WorkoutDto` não deve ter o atributo `secretTechnique`;
   - `WorkoutCreationDto` não deve ter o atributo `id`.

</details>

### 2 - Crie uma classe para a camada de serviço

<details>
  <summary>Neste requisito você deve criar uma classe para representar a camada de serviço.</summary><br />

A classe da camada de serviço:
- Deve implementar a interface `com.betrybe.fitness.service.FitnessServiceInterface`;
    - Aqui basta a criação dos métodos, a implementação deles será feita em outros requisitos;
- Pode ter qualquer nome, mas sugerimos `FitnessService`;
- Deve ser marcada como um componente Spring, especificamente com a anotação para camada de serviço;
    - Isso quer dizer que a classe deverá funcionar como um bean, para ser injetado automaticamente pelo Spring onde for necessário;
- Deve receber, **por injeção de dependência** do Spring, um bean do tipo `FakeFitnessDatabase` (veja abaixo).

O projeto já disponibiliza um componente chamado `com.betrybe.fitness.database.FakeFitnessDatabase`, que representa um banco de dados falso (ele carrega dados de um arquivo). Neste requisito, você apenas precisa receber esse componente por injeção de dependência, ainda não há necessidade de utilizá-lo. Ele será usado em outros requisitos, durante a implementação dos métodos da classe criada aqui.

</details>

### 3 - Crie uma classe de controle REST

<details>
  <summary>Criar uma classe para representar a camada de controle e que seja um componente do Spring.</summary><br />

A classe da camada de controle:
- Deve implementar a interface `com.betrybe.fitness.controller.FitnessControllerInterface`;
- Pode ter qualquer nome, mas sugerimos `FitnessController`;
- Deve ser marcada como um componente Spring, especificamente com a anotação de controle REST;
    - Isso quer dizer que a classe deverá funcionar como um bean, para ser injetado automaticamente pelo Spring onde for necessário;
- Deve ter como mapeamento principal a rota `/fitness`;
  - Cuidado para não incluir uma barra final indevida nos seus mapeamentos;
- Deve receber, **por injeção de dependência** do Spring, o bean definido no requisito anterior, que implementa `FitnessServiceInterface`.

</details>

### 4 - Crie a rota GET /fitness

<details>
  <summary>Crie a rota GET /fitness da API, que retornará uma mensagem.</summary><br />

A rota GET `/fitness` da sua aplicação deve retornar apenas a seguinte mensagem: `Boas vindas à API de Fitness!`.

</details>

### 5 - Implemente o método getWorkout da camada de serviço

<details>
  <summary>Na classe de serviço, implemente o método `getWorkout`, que receberá um ID e retornará o objeto correspondente</summary><br />

Para implementar este requisito, você deverá utilizar o bean do tipo `FakeFitnessDatabase`, que está recebendo na classe.

O método `getWorkout` a ser implementado aqui deve:

- Receber um ID
- Fazer a busca pelo objeto do tipo `Workout` no banco de dados falso (`FakeFitnessDatabase`)
- Criar um objeto do tipo `WorkoutDto` correspondente ao resultado encontrado;
  - Você pode fazer a conversão entre o modelo e o DTO manualmente, ou então implementar um método para isso.

**_Importante_**: note que o retorno do método `getWorkout` da classe `FakeFitnessDatabase` não é `Workout`, mas sim `Optional<Workout>`. Caso não exista um objeto com o ID passado, o método irá retornar um objeto `Optional` indicando que ele está vazio. Você deve fazer o mesmo no método da sua camada de serviço. 

Não se preocupe se você ainda não conhece o `Optional`, veremos mais sobre ele depois. Por enquanto, basta saber que ele representa uma resposta que pode ou não existir. 

Para verificar se o objeto retornado está vazio, você pode utilizar o método `isEmpty()`, respectivamente. Caso esteja presente, você pode recuperar o objeto `Workout` utilizando o método `get()`. Da mesma forma, você pode criar um objeto `Optional` utilizando os métodos `of()` (contendo algo) e `empty()`.

Veja um exemplo de uso:

```java
Optional<String> myOptional;

// Cria um Optional a partir de uma string
myOptional = Optional.of("Uma string");

myOptional.isEmpty()  // Retorna false
myOptional.get()  // Retorna o objeto original (neste caso, a string)

// Agora substitui por um Optional vazio
myOptional = Optional.empty();

myOptional.isEmpty()  // Retorna true
```

Utilize esses métodos para tratar a resposta que irá receber do "banco de dados" e para gerar o retorno correto da sua implementação.

</details>

### 6 - Crie a rota GET /fitness/workouts/{id}

<details>
  <summary>Crie a rota GET /fitness/workouts/{id} da API, que retornará os dados correspondentes ao ID passado.</summary><br />

A rota GET `/fitness/workouts/{id}` da sua aplicação deve:
- Receber um ID através de uma variável de caminho `id`
- Fazer uma busca pelo treino (workout) correspondente ao ID, utilizando o bean de serviço
- Caso não exista um treino com o ID indicado, a rota deve retornar o status code `404` ("not found").
- Caso o treino exista, ele deve ser retornado juntamente com o status code `200` ("ok")

Dicas:
- Utilize a classe `ResponseEntity` para controlar o retorno da rota;
- Utilize o que aprendeu sobre `Optional` no requisito anterior para fazer a verificação.

</details>

### 7 - Implemente o método saveWorkout da camada de serviço

<details>
  <summary>Na classe de serviço, implemente o método `saveWorkout`, que receberá um novo treino e deverá salvá-lo.</summary><br />

Para implementar este requisito, você deverá utilizar o bean do tipo `FakeFitnessDatabase`, que está recebendo na classe.

O método `saveWorkout` a ser implementado aqui deve:

- Receber um objeto do tipo `WorkoutCreationDto`
- Salvar o objeto no banco de dados falso;
  - Note que o método `saveWorkout` do `FakeFitnessDatabase` retorna um novo objeto;
- Retornar um objeto do tipo `WorkoutDto` correspondente ao que o banco de dados retornou.

</details>


### 8 - Crie a rota POST /fitness/workouts

<details>
  <summary>Crie a rota POST /fitness/workouts da API, que vai receber dados de um novo treino, salvar os dados, e retornar o que foi salvo.</summary><br />

A rota POST `/fitness/workouts` da sua aplicação deve:
- Receber dados pelo corpo da requisição, correspondente ao tipo `WorkoutCreationDto`
- Salvar o novo treino utilizando o bean de serviço;
- Retornar o novo objeto que foi salvo, utilizando o status code `201` ("created").

</details>

### 9 - (`Bônus`) Implemente o método getAllWorkouts da camada de serviço

<details>
  <summary>Na classe de serviço, implemente o método `getAllWorkouts`, que retornará todos os treinos disponíveis.</summary><br />

O método `getAllWorkouts` a ser implementado aqui deve:

- Utilizar o banco de dados falso para pegar uma lista com todos os treinos disponíveis;
- Gerar uma lista nova contendo objetos do tipo `WorkoutDto` correspondentes aos objetos do tipo `Workout` retornados pelo banco.

Você pode fazer a conversão da forma que preferir, por exemplo utilizando um `for`. Mas se quiser, também há formas de programação funcional que podem ser utilizadas, inclusive dos chamados `streams` do Java (aprenderemos mais sobre eles depois).

</details>

### 10 - (`Bônus`) Crie a rota GET /fitness/workouts

<details>
  <summary>Crie a rota GET /fitness/workouts da API, que vai retornar uma lista de todos os treinos disponíveis.</summary><br />

A rota GET `/fitness/workouts` da sua aplicação deve:
- Retornar todos os treinos disponíveis, utilizando o bean de serviço

</details>

<details>
<summary><strong> 🗣 Nos dê feedbacks sobre o exercício!</strong></summary>

Ao finalizar e submeter o exercício, não se esqueça de avaliar sua experiência preenchendo o [formulário](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH1&template=betrybe/java-0x-exercicio-fitness-api).
**Leva menos de 3 minutos!**

</details>

---

<!-- mdi versão 1.0 exercício como projeto ⚠️ não exclua esse comentário -->