package cours.poo;

public class Complex {

    /**
     * ask for user input to determine the real & imaginairy values of complex numbers
     * add them up
     * display both parts of the sum
     */

    public int real;
    public int unreal;

   public Complex(int real,int unreal){
        this.real = real;
       this.unreal = unreal;
}


    public void sum(Complex arg){
        int sumReal = this.real + arg.real;
        int sumUnreal = this.unreal + arg.unreal;
        System.out.println("la somme est " + sumReal + " + " + sumUnreal+"i");
    }
}
