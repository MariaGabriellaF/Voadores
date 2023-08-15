import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        List<Voador> voadores = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
           voadores.add(colocarVoadorNaLista());
        }
        for (Voador voador : voadores) {
           voador.voar();//chamadas polimorficas
           voador.planar();//chamadas polimorficas
           voador.pousar();//chamadas polimorficas
            System.out.println();
        }
    }

    public static Voador colocarVoadorNaLista() {
        Random random = new Random();
        int numero = random.nextInt(3)+1;
        if (numero ==1){
            return new GalinhaVoadora();
        }else if(numero ==2){
            return new Drone("Bom");
        }else{
            return new BeijaFlor("Margarida.");
        }


    }

}
