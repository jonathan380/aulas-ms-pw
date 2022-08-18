package br.edu.cpti;

public class TesteAlunos {

	public static void main(String[] args) {
    Aluno aluno1 = new Aluno();
    
    aluno1.nome="joaquim";
    aluno1.telefone="2245-1090";
    aluno1.email="joaquim@gmail.com";
    
    System.out.println("dados do aluno"+aluno1.nome);
    
    Aluno aluno2= new Aluno();
    Aluno aluno3= new Aluno();
    Aluno aluno4= new Aluno();
    
   if (aluno2==aluno3) {
	   System.out.println("sao iguais");
   }else {
	   System.out.println("sao diferentes");
   }

	}

}
