public class Drone implements Voador{
    private String tipo;
    public Drone(String tipo){
        super();
        this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "Drone";
    }

    @Override
    public double voar() {
        System.out.println("Voa Drone.");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana Drone.");

    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa Drone.");
        return true;
    }
}
