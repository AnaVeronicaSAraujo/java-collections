# JAVA Collections (SET, LIST e MAP)

1. Operações Básicas com List
2. Pesquisa em List
3. Ordenação nas List

## Operações Básicas com List

### 1. Lista de Tarefas
<p>Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

- adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
- removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
- obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
- obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
</p>

## Pesquisa em List

### 1. Cat…
[10:42, 21/05/2024] Ana: # JAVA Collections (LIST, SET e MAP)

1. Operações Básicas com LIST, SET e MAP
2. Pesquisa em LIST, SET e MAP
3. Ordenação em LIST, SET e MAP

# LIST

## Operações Básicas com List

### Lista de Tarefas
<p>Criar uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implementar os seguintes métodos:

- adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
- removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
- obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
- obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
</p>

## Pesquisa em List

### Catálogo de Livros

<p>Criar uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implementar os seguintes métodos:

- adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
- pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
- pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
- pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
</p>

## Ordenação em List

### Ordenação de Pessoas

<p>Criar uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. Implementar os seguintes métodos:

- adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
- ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
- ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
</p>

# SET
## Operações Básicas com Set

### Conjunto de Convidados

<p>Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.
- removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do conjunto com base no código do convite.
- contarConvidados(): Conta o número total de convidados no Set.
- exibirConvidados(): Exibe todos os convidados do conjunto.
</p>

## Pesquisa em Set
### Lista de Tarefas

<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
- removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente. 
- exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
- contarTarefas(): Conta o número total de tarefas na lista de tarefas.
- obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
- obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
- marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
- marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
- limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
</p>

---

## Ordenação em Set
### Lista de Alunos

<p>
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
- removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
- exibirAlunos(): Exibe todos os alunos do conjunto.
</p>

# MAP

## Operações Básicas com Map

### Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

- adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
- exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
</p>

## Pesquisa em Map

### Estoque de Produtos com Preço

<p>
Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

- adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preços.
- calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
- obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
- obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
- obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
</p>

## Ordenação nos Map

### Agenda de Eventos

<p>
Crie uma classe chamada "AgendaEventos" que utilize um Map para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

- adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
- exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
- obterProximoEvento(): Retorna o próximo evento que ocorrerá.
</p>
