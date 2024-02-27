public class Scanner {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Rota 66", "24562");
        System.out.println(livro1);

        Cliente cliente1 = new Cliente("Marta", "45878963255");
        System.out.println(cliente1);


        // Tarefa 4  Scanner

        Scanner leituraNumero = new Scanner(System.in);
        System.out.println("Digite o ISBN: ");
        int livro = leituraNumero.nextInt();
        System.out.println("ISBN: ");

       // Tarefa 5 Exceção
    }
    catch (InputMismatchException e){
        System.out.println("Erro! o valor digitado não é um número");
    }
}
