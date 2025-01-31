import java.util.Scanner;

public class Main {
    import Scanner;

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o ID do quarto: ");
            int idQuarto = teclado.nextInt();
            scanner.nextLine(); //rsp

            System.out.print("Digite o tipo do quarto: ");
            String tipoQuarto = teclado.nextLine();

            System.out.print("Digite o preço da diária: ");
            double precoDiaria = teclado.nextDouble();

            Quarto quarto = new Quarto(idQuarto, tipoQuarto, precoDiaria, true);
            quarto.exibirDetalhes();

            System.out.print("Digite o ID do hóspede: ");
            int idHospede = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Digite o nome do hóspede: ");
            String nomeHospede = teclado.nextLine();

            System.out.print("Digite o telefone do hóspede: ");
            String telefoneHospede = teclado.nextLine();

            Hospede hospede = new Hospede(idHospede, nomeHospede, telefoneHospede);
            hospede.exibirHospede();

            System.out.print("Digite a quantidade de diárias: ");
            int diarias = teclado.nextInt();

            Reserva reserva = new Reserva(1, hospede, quarto, diarias);

            System.out.println("Total da reserva: R$" + reserva.calcularTotal());
            reserva.finalizarReserva();
            quarto.marcarIndisponivel();
            reserva.exibirResumo();

            // Simulando liberação do quarto após checkout
            System.out.println("Liberando o quarto...");
            quarto.marcarDisponivel();
            quarto.exibirDetalhes();

            teclado.close();
        }
    }

}
