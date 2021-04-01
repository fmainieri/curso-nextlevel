import java.util.Scanner;
public class NextLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1o Bimestre
		System.out.print("Digite a nota da Prova do 1o Bimestre: ");
		double ProvaB1 = sc.nextDouble();
		System.out.print("Digite a nota da Projeto do 1o Bimestre: ");
		double ProjetoB1 = sc.nextDouble();
		System.out.print("Digite a nota da Lista de Exercicios do 1o Bimestre: ");
		double ExercicioB1 = sc.nextDouble();
		System.out.print("Digite a nota projetos de software livre/ conclusão de MOOCs do 1o Bimestre: ");
		double MoocB1 = sc.nextDouble();
		
		double MediaB1 = ((ProvaB1 * 3)+(ProjetoB1 * 3)+(ExercicioB1 * 2)+(MoocB1 * 3))/(3+3+2+3); 
		
		System.out.println("");
		System.out.println("Media do 1o Bimestre = " + MediaB1);
		
		//2o Bimestre
		System.out.print("Digite a nota da Prova do 2o Bimestre: ");
		double ProvaB2 = sc.nextDouble();
		System.out.print("Digite a nota da Projeto do 2o Bimestre: ");
		double ProjetoB2 = sc.nextDouble();
		System.out.print("Digite a nota da Lista de Exercicios do 2o Bimestre: ");
		double ExercicioB2 = sc.nextDouble();
		System.out.print("Digite a nota projetos de software livre / conclusão de MOOCs do 2o Bimestre: ");
		double MoocB2 = sc.nextDouble();
		
		double MediaB2 = ((ProvaB2 * 3)+(ProjetoB2 * 3)+(ExercicioB2 * 2)+(MoocB2 * 3))/(3+3+2+3); 
		
		System.out.println("");
		System.out.println("Media do 2o Bimestre = " + MediaB2);
		
		//3o Bimestre
		System.out.print("Digite a nota da Prova do 3o Bimestre: ");
		double ProvaB3 = sc.nextDouble();
		System.out.print("Digite a nota da Projeto do 3o Bimestre: ");
		double ProjetoB3 = sc.nextDouble();
		System.out.print("Digite a nota da Lista de Exercicios do 3o Bimestre: ");
		double ExercicioB3 = sc.nextDouble();
		System.out.print("Digite a nota projetos de software livre / conclusão de MOOCs do 3o Bimestre: ");
		double MoocB3 = sc.nextDouble();
		
		double MediaB3 = ((ProvaB3 * 3)+(ProjetoB3 * 3)+(ExercicioB3 * 2)+(MoocB3 * 3))/(3+3+2+3); 
			
		System.out.println("");
		System.out.println("Media do 3o Bimestre = " + MediaB3);
			
		// Calulo da Media do Semestre
		double MediaSemestre = (MediaB1 + MediaB2 + MediaB3)/3;
		boolean Resultado = MediaSemestre >= 8;
			
		System.out.println("Media do Semestre = " + MediaSemestre+" Aluno Aprovado? Resposta: "+Resultado);
		
		// Calculo da Nota Final, se necessário
		if (MediaSemestre<8) {
			double NotaFinal = 10 - MediaSemestre;
			System.out.println("Nota minima na Prova final deverá ser = " + NotaFinal);
		}
				
		sc.close();
	}

}
