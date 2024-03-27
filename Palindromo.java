import javax.swing.JOptionPane;

public class Palindromo {
    
    public static void main(String[] args) {
        //entrada
        String palavra = JOptionPane.showInputDialog(null, "Digite a palavra ");

        boolean ehPalindromo = true;


        //processamento
for(int i = 0; i < palavra.length() / 2; i++){
    char primeiraLetra = palavra.charAt(i);
    char ultimaLetra = palavra.charAt(palavra.length() - 1 - i);

    if(primeiraLetra != ultimaLetra ){
        ehPalindromo = false;
        break;
    }
}
        //saida

        if(ehPalindromo){
            JOptionPane.showMessageDialog(null, "eh palindromo");
        }
        else{
        JOptionPane.showMessageDialog(null, "nao eh palindromo");
        }
    }
}
