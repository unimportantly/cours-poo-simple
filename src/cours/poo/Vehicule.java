	package cours.poo;

	public class Vehicule {

		public String couleur;
		public String marque;
		public double prix;

		public Vehicule(String marque, String couleur){
			this.marque = marque;
			this.couleur = couleur;
		}

		public Vehicule(String couleur, String marque, double prix) {
			this(marque, couleur);
			this.prix = prix;
		}
		public void repeindre(String newCouleur) {
			this.couleur = newCouleur;
			this.prix += 100;
		}
		@Override
		public String toString() {
			return "Vehicule [couleur=" + couleur + ", marque=" + marque + ", prix=" + prix + "]";
		}


	}
