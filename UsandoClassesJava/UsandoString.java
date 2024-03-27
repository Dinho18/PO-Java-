//Exemplo didáico para uso de string
// no qual um texto é convertido em maisculo e minusculo



public class UsandoString {
    public static void main(String[] args) {

        // Entrada
        String texto; // declarando um objeto de nome texto;
        texto = new String("joao da silva"); // instanciando o objeto texto

        String endereco = new String("Rua Xingu"); // declara e instancia na mesma linha

        // Processamento
        String textoMaiusculo = texto.toUpperCase(); // retorna a String em maiuscula e armazena em um novo objeto, sem
                                                     // alterar o conteudo original
        String textoMinusculo = texto.toLowerCase(); // retorna a String em minuscula e armazena em um novo objeto, sem
                                                     // alterar o conteudo original

        endereco = endereco.toUpperCase(); // altera o conteudo original para maiuscula

        if(texto.equalsIgnoreCase("joao")){

        }

        int idade = 19;
        String idadeStr = String.valueOf(idade); 

        // Saida
        System.out.println(textoMaiusculo); // imprime o objeto na tela
        System.out.println(textoMinusculo);// imprime o objeto na tela
        System.out.println(endereco.toLowerCase()); // imprime em letra minuscula sem alterar o conteudo original

    }
}