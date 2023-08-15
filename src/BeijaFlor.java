public class BeijaFlor implements Voador{
    private String tipoDeFlor;
    public BeijaFlor (String tipoDeFlor){
        super();
        this.tipoDeFlor = tipoDeFlor;

    }

    @Override
    public String toString() {
        return "Beija-Flor";
    }

    @Override
    public double voar() {
        System.out.println("Voa Beija-flor.");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana Beija-flor.");

    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa Beija-flor.");
        return true;
    }
}
