import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        // analisarCandidato(1900.00);
        // analisarCandidato(2000.00);
        // analisarCandidato(2200.00);
    }

    static void selecaoCandidatos () {
        String[] candidatos = {"felipe", "marcia", "julia", "augusto", "monica", "fabricio", "mirela", "daniela", "jorge", "isadora"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else { 
            System.out.println("AGUARDANDO O RESULTADO DE DEMAIS CANDIDATOS");
        }
    }
}
