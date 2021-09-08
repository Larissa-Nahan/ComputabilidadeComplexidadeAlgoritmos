import java.util.Scanner;

public class ExercicioAula02 {
    
    public static int fibonacci(int numero){
        if (numero <= 1){
            return 1;
        }
        
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
    
    public static int somando(int numero, int soma){
        if (numero < 1){
            return soma;
        }
        
        soma += (numero%10);
            /*(ex: 1111)
                = 0 + 1
                = 1 + 1
                = 2 + 1
                = 3 + 1
            */
        return somando(numero/10, soma);
            /*(ex: 1111)
                111, 1
                11 , 2
                1  , 3
                0.1, 4
            */
    }
    
    public static void binario(int numero){
        if (numero > 0){
            binario(numero/2);
            System.out.print(numero % 2);
        }
    }
    
    public static int fatorial(int numero){
        if (numero == 1){
            return 1;
        }
        
        return numero * fatorial(numero - 1);
    }
    

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int opcao;
        int quantidade;
        int numero;
        
        do{
            System.out.print("Selecione uma opção:\n" +
                             "1 - Fibonacci\n" + 
                             "2 - Soma dos dígitos\n" +
                             "3 - Decimal para binário\n" +
                             "4 - Fatorial\n" +
                             "0 - Sair\n" +
                             "Opção: ");
            opcao = teclado.nextInt();
                             
            switch(opcao){
                case 0:
                    System.out.print("\n\n==> Fim");
                break;
                case 1:
                    System.out.print("\n\n==> Digite a quantidade de valores que deseja da sequência de Fibonacci: ");
                    quantidade = teclado.nextInt();
                    System.out.print("\n==> Sequência de Fibonacci:\n");
                    for(int i = 0; i < quantidade; i++){
                        System.out.print(fibonacci(i) + " | ");
                    }
                break;
                case 2:
                    System.out.print("\n\n==> Digite o número que deseja saber a soma de seus dígitos: ");
                    numero = teclado.nextInt();
                    System.out.print("\n==> A soma dos dígitos do número " + numero + " é: " + somando(numero, 0));
                break;
                case 3:
                    System.out.print("\n\n==> Digite o número que deseja saber seu binário: ");
                    numero = teclado.nextInt();
                    System.out.print("\n==> O binário do número " + numero + " é: ");
                    binario(numero);
                break;
                case 4:
                    System.out.print("\n\n==> Digite o número que deseja saber seu fatorial: ");
                    numero = teclado.nextInt();
                    System.out.print("\n==> O fatorial do número " + numero + " é: " + fatorial(numero));
                break;
                default:
                    System.out.print("\n\n==> Selecione uma opção válida!");
            }
            
            numero = 0;
            System.out.print("\n\n==========================================\n");
        }while(opcao != 0);
        
        teclado.close();
    }
}