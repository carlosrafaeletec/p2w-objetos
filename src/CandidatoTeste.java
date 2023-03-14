import java.time.LocalDate;

public class CandidatoTeste {
    public static void main(String[] args) {
        Candidato cadastro = new Candidato();
        cadastro.nome = "Horácio Augusto da Silveira";
        cadastro.dataNascimento = LocalDate.of(2004, 10, 05);
        cadastro.email = "horacioaugusto@etec.sp.gov.br";
        cadastro.celular = "(11) 97777-7777";
        cadastro.escolaridade = "Ensino Médio Completo";
        cadastro.funcao = "Auxiliar administrativo";
        cadastro.pretensaoSalarial = 2300.00;
        cadastro.empregado = true;
        cadastro.estagio = true;
    }
}
