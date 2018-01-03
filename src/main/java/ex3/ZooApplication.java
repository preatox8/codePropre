package ex3;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class ZooApplication {

	public static void main(String[] args) {
		
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Panthere", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Zebre", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Truite doree", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Boa constrictor", "REPTILE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Python", "REPTILE", "CARNIVORE"));
		
		zoo.afficherListeAnimaux();
		Scanner scanner = new Scanner(System.in);
		int choixmenu = 0;
		
		while (choixmenu != 99) {
			
			System.out.println(" ");
			System.out.println("******* Menu *******");
			System.out.println("1 - ajouter un animal");
			System.out.println("2 - afficher la liste des animaux");
			System.out.println("99 - Quitter");
			
			choixmenu = scanner.nextInt();
					switch (choixmenu) {
					case 1:
							System.out.println("Nom de l'animal : ");
							String nomanimal = scanner.next();
							System.out.println("Type de l'animal (MAMMIFERE, POISSON, REPTILE ) : ");
							String typeanimal = scanner.next();
							System.out.println("Comportement alimentaire de l'animal (CARNIVORE, HERBIVORE) : ");
							String comportementanimal = scanner.next();
							Animal ajoutanimal = new Animal(nomanimal, typeanimal, comportementanimal);
							if(nomanimal instanceof String && typeanimal instanceof String && comportementanimal instanceof String) {
								zoo.addAnimal(ajoutanimal);
							}else {
								System.out.println("veuillez rentrer des informations valides");
							}
						break;
						case 2 :
							zoo.afficherListeAnimaux();
							break;
						case 99:
							System.out.println("Au revoir");
						break;
					}
				
		}						
		scanner.close();

	}
}
