public class Account {

    private String name;

    private double balance;

    public Account() {}

    public Account(String name, double balance) {
        this.name = name;

        if(this.balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {

        if(depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}


/* 
Declaração de classe
    public class Account

    A palavra-chave public é um modificador de acesso. 
    
    Por enquanto, simplesmente declaramos toda classe public. 
    
    Cada declaração de classe public deve ser armazenada em um arquivo com o mesmo nome 
    que a classe e terminar com a extensão .java; do contrário, ocorrerá um erro de compilação. 
    
    Assim, as classes public Account e AccountTest devem ser declaradas nos arquivos separados 
    Account.java e AccountTest.java, respectivamente. Cada declaração de classe contém a palavra-chave 
    class seguida imediatamente pelo nome da classe, nesse caso, Account. Cada corpo de classe é 
    inserido entre um par de chaves esquerda e direita como nas linhas 6 e 20 da Figura 3.1.

Identificadores e nomeação usando a notação camelo (camelCase)
    Nomes de classes, de método e de variável são identificadores e, por convenção, 
    todos usam o mesmo esquema de nomeação com a notação camelo. 
    
    Também por convenção, os nomes de classe começam com uma letra maiúscula, e os de métodos e 
    de variáveis iniciam com uma letra minúscula.


Variável de instância name 
    Lembre-se: um objeto tem atributos, implementados 
    como variáveis de instância que o acompanham ao longo da sua vida. As variáveis de 
    instância existem antes que os métodos sejam chamados em um objeto, enquanto eles são 
    executados e depois que a execução deles foi concluída. 
    
    Cada objeto (instância) da classe tem sua própria cópia das variáveis de instância 
    da classe. Uma classe normalmente contém um ou mais métodos que manipulam as variáveis 
    de instância pertencentes aos objetos particulares dela.

    Variáveis de instância são declaradas dentro de uma declaração de classe, 
    mas fora do corpo dos métodos da classe. A linha 
        
        private String name; // variável de instância
    
    declara uma variável de instância name do tipo String fora do corpo dos métodos 
    setName e getName. Variáveis String podem conter valores de string de caracteres 
    como "Jane Green". 
        
    Se houver muitos objetos Account, cada um tem seu próprio name. Como name é uma variável 
    de instância, ele pode ser manipulado por cada um dos métodos da classe. 
    
Modificadores de acesso public e private
    A maioria das declarações de variável de instância é precedida pela palavra-chave private (como na linha 7). 
    Da mesma forma que public, private é um modificador de acesso. As variáveis ou métodos declarados 
    com o modificador de acesso private só são acessíveis a métodos da classe em que isso ocorre. 
    
    Assim, a variável name só pode ser empregada nos métodos de cada objeto Account (nesse caso, setName e getName). 
        Você verá mais adiante que isso apresenta oportunidades poderosas de engenharia de software.

Método setName da classe Account
    Analisaremos o código da declaração do método setName:
    
    public void setName(String name) – Esta linha é o cabeçalho do método
    {
        this.name = name; // armazena o nome
    }

    Nós nos referimos à primeira linha de cada instrução de método como cabeçalho do método. O tipo de
    retorno do método (que aparece antes do nome deste) especifica a qualidade dos dados que o método 
    retorna ao chamador depois de realizar sua tarefa. 
    O tipo de retorno void (linha 10) indica que setName executará uma tarefa, mas não retornará (isto é, fornecerá)
    nenhuma informação ao seu chamador. 
    
    Anteriormente você usou métodos que retornam informações — por exemplo, adotou Scanner do método nextInt para inserir um 
    número inteiro digitado pelo usuário no teclado. Quando nextInt lê um valor, ele o retorna para utilização no programa. 
    
    Como veremos mais adiante, o método Account getName retorna um valor. O método setName recebe um parâmetro name do tipo String — 
    que representa o nome que será passado para o método como um argumento. Você verá como parâmetros e argumentos 
    funcionam em conjunto ao discutir a chamada de métodos. 

    Os parâmetros são declarados em uma lista de parâmetros que está localizada entre os parênteses que seguem o nome do 
    método no título dele. Quando existem múltiplos parâmetros, cada um é separado do seguinte por uma vírgula. 
    Cada parâmetro deve especificar um tipo (nesse caso, String) seguido por um nome da variável (nesse caso, name).

Parâmetros são variáveis locais 

    Anteriormente declaramos todas as variáveis de um aplicativo no método main. 
    Variáveis declaradas no corpo de um método específico (como main) são variáveis locais que somente podem ser utilizadas nele. 
    
    Cada método só pode acessar suas próprias variáveis locais, não aquelas dos outros. 
    Quando esse método terminar, os valores de suas variáveis locais são perdidos. Os parâmetros de um método também são variáveis locais dele.

Corpo do método setName
    Cada corpo de método é delimitado por um par de chaves contendo uma ou mais
    instruções que executam tarefa(s) do método. Nesse caso, o corpo do método contém uma única instrução que atribui o
    valor do parâmetro name (uma String) à variável de instância name da classe, armazenando assim o nome da conta no objeto.
    
    Se um método contiver uma variável local com o mesmo nome de uma variável de instância ,
    o corpo desse método irá referenciar a variável local em vez da variável de instância. Nesse caso, diz-se que a variável local
    simula a variável de instância no corpo do método. O corpo do método pode usar a palavra-chave this para referenciar a variável
    de instância simulada explicitamente, como mostrado à esquerda da atribuição na linha 12.
        

Construtores não podem retornar valores
    Uma diferença importante entre construtores e métodos é que os construtores não podem retornar valores, portanto, não podem
    especificar um tipo de retorno (nem mesmo void). Normalmente, os construtores são declarados public — mais adiante no
    livro explicaremos quando usar construtores private.

    qualquer classe que não declare explicitamente um construtor, o compilador fornece um tipo padrão (que
    sempre não tem parâmetros). Quando uma classe tem somente o construtor padrão, as variáveis de instância da classe 
    são inicializadas de acordo com seus valores padrões. 
*/