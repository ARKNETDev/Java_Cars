import java.util.*;
import com.iia.shop.entity.Voiture;
import java.io.Console;
import java.util.ArrayList;

public class Shop {
	
	public static void main(String[] args) {
		ArrayList<Voiture> listvoiture = new ArrayList<Voiture>();
		Console console = System.console();
		Voiture Car = new Voiture();	
		int i = 0;
		
		String marque =  Car.getMarque();
		String model= Car.getModel();
		String color= Car.getColor();
		int speed = Car.getSpeed();
		int year = Car.getYear();
		double prix = Car.getPrix();
		Car = new Voiture(marque, model, color, speed, year, prix);
		
		System.out.println("Bienvenue à notre magasin de voiture !");
		System.out.println("");
		System.out.println("1 - Afficher le tableau de Voiture !");
		System.out.println("");
		System.out.println("0 - Quitter le magasin !");

		int application = 1;
		System.out.println("");
		int choix = Integer.parseInt(console.readLine("Veuillez choisir une operation : "));
		System.out.println("");
		/*Voiture Car = new Voiture();
		
		String marque =  Car.getMarque();
		String model= Car.getModel();
		String color= Car.getColor();
		int speed = Car.getSpeed();
		int year = Car.getYear();
		double prix = Car.getPrix();
		Car = new Voiture(Car.getMarque(), Car.getModel(), Car.getColor(),
				Car.getSpeed(), Car.getYear(), Car.getPrix());*/
		switch (choix) {
		case 1:
			while (application == 1) {
				System.out.println("");			
				for (i = 0; i < listvoiture.size(); i++) {
					System.out.println("");				
					Car.Read(i, marque, model, color, speed, year, prix);
					System.out.println("");
				}
				System.out.println("");
				System.out.println("1 - Create | 2 - Update | 3 -Delete | 4 - Démarrer | 5 - Quitter");
				System.out.println("");
				int action = Integer.parseInt(console.readLine("Choisissez une action : "));
				System.out.println("");
				switch (action) {
				case 1:
					Car = new Voiture(marque, model, color, speed, year, prix);
					Car.Ajouter();
					listvoiture.add(Car);
					break;
				case 2:
					i = Integer.parseInt(console.readLine("Veuillez choisir une voiture : "));
					Car.Modifier(i);
					break;
				case 3:
					i = Integer.parseInt(console.readLine("Veuillez choisir une voiture : "));
					Car.Supprimer(i);
					
					break;
				case 4:
					i = Integer.parseInt(console.readLine("Veuillez démarrer une voiture parmi les " + i + " : "));
					Car.Start(i);
					break;
				case 5:
					application = 0;
					break;

				}

			}
			break;

		case 2:
			application = 0;
			break;
		}

	}
}
