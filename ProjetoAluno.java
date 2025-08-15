public class ProjetoAluno {
public static void main(String[] args) {
    
    Aluno aluno1 = new Aluno();
    aluno1.nome = "Camila Bomfim";
    aluno1.matricula = 589;
    aluno1.notaAv1 = 8.0;
    aluno1.notaAv2 = 7.5;

    Aluno aluno2 = new Aluno();
    aluno2.nome = "Manoel Fárias";
    aluno2.matricula = 123;
    aluno2.notaAv1 = 4.5;
    aluno2.notaAv2 = 5.0;

    aluno2.notaFinal = 7.0;

    System.out.println("\n Dados do aluno 1");
    aluno1.mostrarDados();
    aluno1.verificarAprovacao();

    System.out.println("\n Dados do aluno 2");
    aluno2.mostrarDados();
    aluno2.verificarAprovacao();

}
}
