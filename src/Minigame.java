import java.util.ArrayList;

public class Minigame {
    private RegistroCreature registro;

    public Minigame(RegistroCreature registro) {
        this.registro = registro;
    }

    public RegistroCreature getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroCreature registro) {
        this.registro = registro;
    }
    public TipoEnum sceltaTipo(Integer sceltaTipo) {
        TipoEnum tipo = TipoEnum.DRACO;
        System.out.println("Scegli il tipo tra i seguenti: ");
        registro.elencoTipi();
        sceltaTipo -= 1;
        if (sceltaTipo < 0) {
            System.out.println("\nERRORE! inserire una corretta selezione\n");
        } else if (sceltaTipo >= TipoEnum.values().length) {
            System.out.println("\nERRORE! inserire una corretta selezione\n");
        } else {
            for (TipoEnum tipoVar : TipoEnum.values()) {
                if (sceltaTipo == tipoVar.getNumerazione()) {
                    tipo = tipoVar;
                }
            }
        }
        return tipo;
    }
}
