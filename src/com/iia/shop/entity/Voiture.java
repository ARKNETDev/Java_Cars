package com.iia.shop.entity;

import java.io.Console;
import java.util.ArrayList;

public class Voiture {

	Console console = System.console();
	private String Marque;
	private String Model;
	private String Color;
	private int speed;
	private int year;
	private double prix;

	public Voiture() {
		super();
	}

	public Voiture(String marque, String model, String color, int speed, int year, double prix) {
		super();
		this.Marque = marque;
		this.Model = model;
		this.Color = color;
		this.speed = speed;
		this.year = year;
		this.prix = prix;
	}

	// Getters---------------------------------------------------------------------------------------------------
	public String getMarque() {
		return this.Marque;
	}

	public String getModel() {
		return this.Model;
	}

	public String getColor() {
		return this.Color;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getYear() {
		return this.year;
	}

	public double getPrix() {
		return this.prix;
	}
	// ----------------------------------------------------------------------------------------------------------

	// Setters---------------------------------------------------------------------------------------------------
	public void setMarque(String marque) {
		this.Marque = marque;
	}

	public void setModel(String model) {
		this.Model = model;
	}

	public void setColor(String color) {
		this.Color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void Read(int i, String Marque, String Model, String Color, int speed, int year, double prix) {
		i++;
		Marque = getMarque();
		Model = getModel();
		Color = getColor();
		speed = getSpeed();
		year = getYear();
		prix = getPrix();
		System.out.println("Véhicule N° " + i + " - " + Marque + " - " + Model + " - " + Color + " - " + speed + " - "
				+ year + " - " + prix);
	}

	public void Ajouter( /* ArrayList<Car> CarList */) {
		// Voiture car = new Voiture();
		// ajout++;
		int ajout = 0;
		ajout = ajout + 1;
		String marque = Voiture.this.Marque;
		marque = console.readLine("Ajouter une marque : ");
		System.out.println("");
		String model = Voiture.this.Model;
		model = console.readLine("Ajouter un modéle : ");
		System.out.println("");
		String color = Voiture.this.Color;
		color = console.readLine("Ajouter une couleur : ");
		System.out.println("");
		int speed = Voiture.this.speed;
		speed = Integer.parseInt(console.readLine("Ajouter une vitesse : "));
		System.out.println("");
		int year = Voiture.this.year;
		year = Integer.parseInt(console.readLine("Ajouter une année de création : "));
		System.out.println("");
		double prix = Voiture.this.prix;
		prix = Integer.parseInt(console.readLine("Ajouter un prix : "));
		System.out.println("");
		// ---------------------------------------------------------------------
		/*
		 * String marque = Voiture.this.Marque; car.Marque =
		 * console.readLine("Ajouter une marque : "); System.out.println("");
		 * //String model = Voiture.this.Model; car.Model =
		 * console.readLine("Ajouter un modéle : "); System.out.println("");
		 * //String color = Voiture.this.Color; car.Color =
		 * console.readLine("Ajouter une couleur : "); System.out.println("");
		 * //int speed = Voiture.this.speed; car.speed =
		 * Integer.parseInt(console.readLine("Ajouter une vitesse : "));
		 * System.out.println(""); //int year = Voiture.this.year; car.year =
		 * Integer.parseInt(console.readLine("Ajouter une année de création : ")
		 * ); System.out.println(""); //double prix = Voiture.this.prix;
		 * car.prix =
		 * Double.parseDouble(console.readLine("Ajouter un prix : "));
		 * System.out.println("");
		 */
		setMarque(marque);
		setModel(model);
		setColor(color);
		setSpeed(speed);
		setYear(year);
		setPrix(prix);
		new Voiture(marque, model, color, speed, year, prix);
		// new Voiture(this.Marque, this.Model, this.Color, this.speed,
		// this.year, this.prix);
		// return car;
	}

	public void Modifier(int i) {
		System.out.println("");
		System.out.println("vous voulez modifier la voiture N°" + i);
		System.out.println("");
		String marque = Voiture.this.Marque;
		marque = console.readLine("Ajouter une marque : ");
		System.out.println("");
		String model = Voiture.this.Model;
		model = console.readLine("Ajouter un modéle : ");
		System.out.println("");
		String color = Voiture.this.Color;
		color = console.readLine("Ajouter une couleur : ");
		System.out.println("");
		int speed = Voiture.this.speed;
		speed = Integer.parseInt(console.readLine("Ajouter une vitesse : "));
		System.out.println("");
		int year = Voiture.this.year;
		year = Integer.parseInt(console.readLine("Ajouter une année de création : "));
		System.out.println("");
		double prix = Voiture.this.prix;
		prix = Integer.parseInt(console.readLine("Ajouter un prix : "));
		System.out.println("");

		setMarque(marque);
		setModel(model);
		setColor(color);
		setSpeed(speed);
		setYear(year);
		setPrix(prix);

		// new Voiture(marque, model, color, speed, year, prix);
	}

	public void Supprimer(int i) {
		ArrayList<Voiture> listvoiture = new ArrayList<Voiture>();
		System.out.println("");
		System.out.println("vous voulez supprimer la voiture N°" + i);
		System.out.println("");
		listvoiture.remove(i);
	}

	public void Start(int i) {
		Console console = System.console();
		ArrayList<Voiture> listvoiture = new ArrayList<Voiture>();
		System.out.println("la voiture N°" + i + " a démarré !");
		System.out.println("");
		int on = 1;
		do {
			int vitesse = Voiture.this.speed;
			System.out.println("la voiture N°" + i + " à " + vitesse + "km/h !");
			System.out.println("");
			System.out.println("1 - OUI");
			System.out.println("");
			System.out.println("2 - NON");
			System.out.println("");
			int continuer = Integer.parseInt(console.readLine("voulez-vous continuer ? "));

			switch (continuer) {
			case 1:
				System.out.println("");
				System.out.println("accelerer | ralentir");
				System.out.println("");
				String choisir = console.readLine("vous voulez Accélerer ou Ralentir ? :");
				System.out.println("");
				switch (choisir) {
				case "accelerer":
					SpeedUp(i);
					break;

				case "ralentir":
					SpeedDown(i);
					break;
				}
				break;

			case 2:
				Stop(i);
				on = 0;
				break;
			}
		} while (on == 1);

	}

	public void Stop(int i) {
		int vitesse = Voiture.this.speed;
		setSpeed(vitesse);
	}

	public void SpeedUp(int i) {
		System.out.println("");
		Console console = System.console();
		int vitesse = Voiture.this.speed;
		System.out.println("La voiture roule à " + vitesse + "km/h. ");
		System.out.println("");
		vitesse = Integer
				.parseInt(console.readLine("Jusqu'à quelle vitesse le voiture N°" + i + " devra atteindre : "));
		setSpeed(vitesse);
	}

	public void SpeedDown(int i) {
		System.out.println("");
		Console console = System.console();
		int vitesse = Voiture.this.speed;
		System.out.println("La voiture roule à " + vitesse + "km/h");
		System.out.println("");
		vitesse = Integer
				.parseInt(console.readLine("Jusqu'à quelle vitesse le voiture N°" + i + " devra descendre : "));
		setSpeed(vitesse);
	}
}