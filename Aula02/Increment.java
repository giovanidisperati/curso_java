package Aula02;

public class Increment {
    public static void main(String[] args) {
    
        int c = 5;

        System.out.printf("c before postincrement: %d%n", c); // imprime 5
        System.out.printf(" postincrementing c: %d%n", c++); // imprime 5
        System.out.printf(" c after postincrement: %d%n", c); // imprime 6
        System.out.println(); // pula uma linha
        
        c = 5;

        System.out.printf(" c before preincrement: %d%n", c); // imprime 5
        System.out.printf(" preincrementing c: %d%n", ++c); // imprime 6
        System.out.printf(" c after preincrement: %d%n", c); // imprime 6
    }
}

/* O código acima demonstra a diferença entre as versões de pré-incremento e de 
pós-incremento do operador de incremento ++. O operador de decremento (––) 
funciona de forma semelhante.

A linha 6 inicializa a variável c como 5 e a linha 8 gera a saída do valor inicial da c. 
A linha 9 gera a saída do valor da expressão c++. 
Essa expressão pós-incrementa a variável c, assim o valor original de c (5) é enviado 
para a saída e, então, o valor de c é incrementado (para 6). 
Portanto, a linha 9 gera a saída do valor inicial de c (5) novamente. 

A linha 10 gera a saída do novo valor de c (6) para provar que o valor da variável foi 
de fato incrementado na linha 9.

A linha 13 reinicializa o valor da c como 5 e a linha 15 envia o valor de c para a saída. 
A linha 16 gera a saída do valor da expressão ++c. Essa expressão pré-incrementa c, 
assim seu valor é incrementado; então, o novo valor (6) é enviado para a saída. 

A linha 17 gera a saída do valor de c novamente para mostrar que o valor de c ainda é 6 
depois que a linha 16 é executada. */