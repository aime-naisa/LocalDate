import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Data Atual
        LocalDate hoje = LocalDate.now(); // FUNÇÃO QUE BUSCA A DATA ATUAL, LOCAL DO JAVA

        System.out.println("\nData de Hoje: " + hoje); // formato padrão ano-mes-dia

        //formatar data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // FUNÇÃO DE FORMATAÇÃO DE DATA

        System.out.println("Data de hoje formatada: " + hoje.format(formato)); // hoje.format(formato) - hoje = data atual; 
                                                                               // format(formato) = para formatar com base na informação dada

       //CONTAGEM = X DIAS PARA TAL DIA
       LocalDate ultimoDiaFURB = LocalDate.of(hoje.getYear(), 12, 3); // of para pegar os parametros de dia, mês e ano
       long dias = ChronoUnit.DAYS.between(hoje, ultimoDiaFURB); // long = tipo de dado inteiro, maior que a capacidade do INT
                                                                 // ChronoUnit.DAYS.between = FUNÇÃO PARA COMPARAR DARA E HORA | between (entre dois valores)

       System.out.println("Faltam " + dias + " dias para o ultimo dia de aula!");

       //Calcular dias até o natal
       LocalDate natal = LocalDate.of(hoje.getYear(), 12, 24);
       dias = ChronoUnit.DAYS.between(hoje, natal);

       System.out.println("Faltam " + dias + " dias para o Natal!\n");

    }
}
