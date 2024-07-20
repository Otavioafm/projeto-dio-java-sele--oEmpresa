import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int somatoriaDePontos=0;
        int salarioMaximo=3500;


        Scanner nome=new Scanner(System.in);
        Scanner idade=new Scanner(System.in);
        Scanner salario=new Scanner(System.in);
        Scanner experienciaT=new Scanner(System.in);
        Scanner experienciaJ=new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeParticipante=nome.next();

        System.out.println("Digite a sua idade: ");
        int idadeParticipante=idade.nextInt();
        if (idadeParticipante<18)
        {
            System.out.println("Infelizmente você é menor de idade então será eliminado!");
            return;
        }
        else
        {
            somatoriaDePontos=+1;
            System.out.println("\nMuito bem ["+nomeParticipante+"] você está disputando a vaga com Programador Java júnior");
            System.out.println("Responda as perguntas corretamente e no final vamos analisar o melhor candidato! Boa sorte.");
        }

        System.out.println("Qual a sua pretenção salarial? ");
        int salarioRequisitado=salario.nextInt();
        if (salarioMaximo<salarioRequisitado)
        {
            somatoriaDePontos-=1;
            System.out.println(somatoriaDePontos);
        }
        else
        {
            somatoriaDePontos+=1;
        }

        System.out.println("você já trabalhou na area de programação? [sim]/[não]");
        String experienciaTrabalho=experienciaT.next().toLowerCase();
        if (experienciaTrabalho.equals("não"))
        {
            somatoriaDePontos-=1;
            System.out.println(somatoriaDePontos);
        }
        else
        {
            somatoriaDePontos+=1;
        }

        System.out.println("Pergunta final, você tem nivel experiencia em Java? [sim]/[não]");
        String experienciaJava=experienciaJ.next().toLowerCase();
        if (experienciaJava.equals("não"))
        {
            somatoriaDePontos-=1;
            System.out.println(somatoriaDePontos);
        }
        else
        {
            somatoriaDePontos+=1;
        }

        System.out.println("Aguarde! nossa equipe ira analisar o seu curriculo...");
        if (somatoriaDePontos==3)
        {
            System.out.println("Meus parabens , você fo iaprovado na seleção!");
        }
        else if (somatoriaDePontos==2 ||somatoriaDePontos==1 )
        {
            System.out.println("Vamos conversar com a nossa equipe sobre a contratação ...");
        }
        else
        {
            System.out.println("infelizmente não daremos continuidade para a sua candidatura, obg pela atenção!");    
        }


    }
}
