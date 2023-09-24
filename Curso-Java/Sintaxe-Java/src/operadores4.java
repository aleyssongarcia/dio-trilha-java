public class operadores4 {
    public static void main(String[] args){
        String nomeUm = "Aleysson";
        String nomeDois = "Aleysson";

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));





        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println(numero1 + " É MENOR QUE " + numero2);
        }

        simNao = numero1 != numero2;

        System.out.println(simNao);

        simNao = numero1 > numero2;
        System.out.println(simNao);

    }
}
