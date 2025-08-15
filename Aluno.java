public class Aluno {
 String nome;
 int matricula;
 double notaAv1;   
 double notaAv2; 
 double notaFinal;

 void mostrarDados(){
    System.out.println("Nome: " + nome);
    System.out.println("Matricula: " + matricula);
    System.out.println("Nota da AV1: " + notaAv1);
    System.out.println("Nota da AV2: " + notaAv2);
    if (notaFinal > 0){
        System.out.println("Nota final: " + notaFinal);
    }
 }

 double calcularMedia(){
    return (notaAv1 + notaAv2) / 2;
 }

 void verificarAprovacao(){
    double media = calcularMedia();
    System.out.println("Média: " + media);

    if (media >= 7){
        System.out.println("Aprovado");
    } 
    else if (media >= 4){
        System.out.println("Prova final");

        double mediaFinal = (media + notaFinal) / 2;
        System.out.println("Média final: " + mediaFinal);

        if (mediaFinal >= 5){
            System.out.println("Aprovado");
        }

        else{
            System.out.println("Reprovado");
        }
    } else {
        System.out.println("Reprovado direto");

    }
 }
 }


