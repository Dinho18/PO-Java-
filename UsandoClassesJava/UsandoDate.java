import java.util.Date;

public class UsandoDate {
    public static void main(String[] args) {
        // entrada
        Date agora; // declarar o objeto agora
        agora = new Date(); // instanciar o objeto agora

        // processamento
        int dia = agora.getDate();
        int mes = agora.getMonth();
        int ano = agora.getYear();

        Date aniversario = new Date();

        aniversario.setDate(17);
        aniversario.setMonth(0);
        aniversario.setYear(90);

        Date amanha = new Date(124, 2, 28);

        // saida

        System.out.println(aniversario.toString());
        System.out.println(amanha);
        System.out.println(dia + "/" + (mes + 1) + "/" + (ano + 1900));
    }
}