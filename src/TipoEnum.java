import java.util.ArrayList;
import java.util.Arrays;

public enum TipoEnum {
    DRACO(0,"Draco",new ArrayList<String>(Arrays.asList("Sputafuoco","Volo"))),
    ELEMENTALE(1,"Elementale",new ArrayList<String>(Arrays.asList("Necromanzia","Voodoismo"))),
    FOLLETTO(2,"Folletto",new ArrayList<String>(Arrays.asList("Invisibilità","Cura")));

    private int numerazione;
    private String tipo;

    private ArrayList<String> abilitaSpeciali;

    TipoEnum(int numerazione,String tipo, ArrayList<String> abilitaSpeciali){
        this.tipo = tipo;
        this.abilitaSpeciali = abilitaSpeciali;
    }

    public int getNumerazione() {
        return numerazione;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<String> getAbilitaSpeciali() {
        return abilitaSpeciali;
    }
//    public TipoEnum convertiNumeroInTipo(int numero) {
//
//        for (TipoEnum tipo : TipoEnum.values()) {
//            if (numero == tipo.getNumerazione()) {
//                return tipo;
//            }else{
//                return
//            }
//        }
//    }

    @Override
    public String toString() {
        return "TipoEnum{" +
                "tipo='" + tipo + '\'' +
                ", abilitaSpeciali=" + abilitaSpeciali +
                '}';
    }
}
