public class GalinhaVoadora implements Voador{

    public void comeMilho(){
        System.out.println("Come milho galinha.");
    }
    @Override
    public String toString() {
        return "Galinha voadora";
    }


    @Override
    public double voar() {
        System.out.println("Voa galinha!");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana galinha!");

    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa galinha!");
        return true;
    }

}
