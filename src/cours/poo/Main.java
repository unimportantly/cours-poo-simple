package cours.poo;

import cours.poo.exo7.Apartment;
import cours.poo.exo7.House;
import cours.poo.exo7.Person;
import cours.poo.pokemon.PokemonEau;
import cours.poo.pokemon.PokemonFeu;
import tools.Tools;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicule v1 = new Vehicule("bleue", "peugeot", 1200);
		//v1.repeindre("blanche");
		//System.out.println(v1);
		//Rectangle r1 = new Rectangle(Tools.inputInt("width"),Tools.inputInt("length"));
		//double area = r1.area();
		//System.out.println(area);
		//Sum s1 = new Sum(Tools.inputDouble("n1"), Tools.inputDouble("n2"));
		//double sum = s1.sum();
		//System.out.println(sum);
	//	List<Integer> marks = new ArrayList<Integer>();
//		Studen s1 = new Studen("Jean", 12,18,19,11,7,14,9);
//		s1.show();
		Points p1 = new Points(5,6);
		Points p2 = new Points(3,2);
		double distance = p1.distance(p2);
	System.out.println("the distance between p1 & p2 is: " + distance);
//		Complex c1 = new Complex(1, 4);
//		Complex c2 = new Complex(2,3);
//		c1.sum(c2);
//		Person p1 = new Person();
//		p1.say("hello");
//		Student s1 = new Student();
//		s1.setAge(15);
//		s1.say("hello");
//		s1.goToClass();
//		s1.displayAge();
//		Teacher t1 = new Teacher();
//		t1.setAge(40);
//		t1.say("hello");
//		t1.explain("Maths");
//		Apartment a1 = new Apartment();
//		House.Door d1 = a1.new Door();
//		Person p1 = new Person("jean", a1);
//		p1.display();
//
//		PokemonFeu p1 = new PokemonFeu("Salamèche",100,20);
//		PokemonEau p2 = new PokemonEau("Carapuce",100,20);
//		p1.roundResult(p2);

		}

	}

