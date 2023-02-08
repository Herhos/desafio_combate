package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;		
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vida = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque = sc.nextInt();
		System.out.print("Armadura: ");
		int escudo = sc.nextInt();
		Champion campeao1 = new Champion(nome, vida, ataque, escudo);
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		vida = sc.nextInt();
		System.out.print("Ataque: ");
		ataque = sc.nextInt();
		System.out.print("Armadura: ");
		escudo = sc.nextInt();
		Champion campeao2 = new Champion(nome, vida, ataque, escudo);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		n = sc.nextInt();
		System.out.println();
		
		for (i = 0; i < n; i++)
		{
			if (campeao1.getLife() <= 0 || campeao2.getLife() <= 0)
			{
				System.out.println("FIM DO COMBATE");
				System.exit(0);
			}
			else
			{				
				campeao1.takeDamage(campeao2);
				campeao2.takeDamage(campeao1);
				
				System.out.println("Resultado do turno " + (i + 1) +":"); 
				
				if (campeao1.getLife() < 0)
				{
					System.out.println(campeao1.getName() + ": " + " 0 de vida (morreu)");					
				}
				else
				{
					System.out.println(campeao1.status());					
				}
				if (campeao2.getLife() < 0)
				{
					System.out.println(campeao2.getName() + ": " + " 0 de vida (morreu)");					
				}
				else
				{									
					System.out.println(campeao2.status());
				}				
				System.out.println();
			}			
		}
		
		System.out.println("FIM DO COMBATE");
		sc.close();
	}
}
