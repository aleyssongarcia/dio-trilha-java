public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    String meuNome = "Aleysson Garcia";
    byte idade = 123;
    short ano = 2021;
    int cep = 21070333; // Se for começar em zero, teria que ser string
    long cpf = 98765432109L; // precisa terminar em L para saber que é long e se começar em zero ser string.
    float pi = 3.14F; // precisa terminar em F ou f para saber que é float e não double.
    double salario = 1275.33;
    int numero = 456;
    final double VALOR_DE_PI = 3.14; // adicionando o final e a variavel em caixa alta, eu evidencio que ela não pode ser alterada
    
    System.out.println(meuNome + idade + ano + cep + cpf + pi + salario + VALOR_DE_PI + numero);
    }
}
