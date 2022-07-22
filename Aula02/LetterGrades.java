package Aula02;

import java.util.Scanner;

public class LetterGrades {
    
    public static void main(String[] args) {
    
        int total = 0; // soma das notas
        int gradeCounter = 0; // número de notas inseridas
        int aCount = 0; // contagem de notas A
        int bCount = 0; // contagem de notas B
        int cCount = 0; // contagem de notas C
        int dCount = 0; // contagem de notas D
        int fCount = 0; // contagem de notas F
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n %s%n %s%n", 
            "Enter the integer grades in the range 0-100.", 
            "Type the end-of-file indicator to terminate input:", 
            "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter", 
            "On Windows type <Ctrl> z then press Enter");
        

        // faz loop até o usuário inserir o indicador de fim do arquivo
        while (input.hasNext())
        {
            int grade = input.nextInt(); // lê a nota
            total += grade; // adiciona nota a total
            ++gradeCounter; // incrementa o número de notas
            
            switch (grade / 10) 
            { 
                case 9: // a nota estava entre 90  e 100, inclusivo 
                case 10:  
                    ++aCount;
                    break; // sai do switch
                
                case 8: // nota estava entre 80 e 89
                    ++bCount;
                    break; // sai do switch
                
                case 7: // nota estava entre 70 e 79
                    ++cCount;
                    break; // sai do switch
                
                case 6: // nota estava entre 60 e 69
                    ++dCount;
                    break; // sai do switch
        
                default: // a nota era menor que 60
                    ++fCount;
                    break; // opcional; fecha switch de qualquer maneira
            } // fim do switch
        } // fim do while
        
        System.out.printf("%nGrade Report:%n");
        
        if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:", "A: ", aCount, "B: ", bCount, "C: ", cCount, 
            "D: ", dCount, "F: ", fCount);
        } else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
        System.out.println("No grades were entered");

        input.close();
    }
}


/* A instrução switch (linhas 33 a 55) determina qual contador incrementar. Supomos que o usuário insere uma nota válida no
intervalo 0 a 100. Uma nota no intervalo 90 a 100 representa A, 80 a 89, B, 70 a 79, C, 60 a 69, D e 0 a 59, F. A instrução switch consiste
em um bloco que contém uma sequência de rótulos case e um caso default opcional. Essas sequências são utilizadas nesse
exemplo para determinar qual contador incrementar com base na nota.
Quando o fluxo de controle alcançar o switch, o programa avalia a expressão nos parênteses (grade / 10) que se segue à palavra-
chave switch. Essa é a expressão de controle do switch. O programa compara o valor dessa expressão (que deve ser avaliada
como um valor integral do tipo byte, char, short ou int, ou como uma String) com cada rótulo case. A expressão controladora
na linha 33 realiza a divisão de inteiro, que trunca a parte fracionária do resultado. Portanto, ao dividirmos um valor de 0 a 100
por 10, o resultado é sempre um valor de 0 a 10. Utilizamos vários desses valores em nossos rótulos case. Por exemplo, se o usuário
inserir o inteiro 85, a expressão controladora é avaliada como 8. A switch compara o 8 com cada rótulo case. Se ocorrer uma correspondência
(case 8: na linha 40), o programa executa essas instruções de case. Para o número inteiro 8, a linha 41 incrementa
bCount, porque uma nota nos 80 é um B. A instrução break (linha 42) faz com que o controle do programa avance para a primeira
instrução após switch — nesse programa, alcançamos o final do loop while, assim o controle retorna para a condição de continuação
de loop na linha 26 para determinar se o loop deve continuar executando.
Os cases no nosso switch testam explicitamente quanto aos valores 10, 9, 8, 7 e 6. Observe os casos nas linhas 35 e 36 que
testam quanto aos valores 9 e 10 (ambos representam a nota A). Listar os casos consecutivamente dessa maneira sem instruções
entre eles permite que executem o mesmo conjunto de instruções — quando a expressão controladora é avaliada como 9 ou 10, as
instruções nas linhas 37 e 38 serão executadas. A instrução switch não fornece um mecanismo para testar séries de valores, então
todo valor que você precisa testar deve ser listado em um rótulo case separado. Cada case pode ter múltiplas instruções. A instrução
switch difere de outras instruções de controle porque não exige que as múltiplas instruções em um case estejam entre chaves. */