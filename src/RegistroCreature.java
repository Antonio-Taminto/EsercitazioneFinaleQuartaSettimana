import java.util.ArrayList;
import java.util.Objects;
public class RegistroCreature {
    private ArrayList<CreaturaMagica> registro;

    public RegistroCreature() {
        this.registro = new ArrayList<>();
    }

    public ArrayList<CreaturaMagica> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<CreaturaMagica> registro) {
        this.registro = registro;
    }
    public int getSize(){
        return registro.size();
    }

    public void elenco(){
        int i = 1;
        System.out.println("Elenco : ");
        for (CreaturaMagica creatura : registro){
            System.out.println(i + "." + creatura.stampa());
            i++;


        }
        System.out.println();
    }
    public void elencoTipi(){
        for(TipoEnum tipo : TipoEnum.values()){
            System.out.println(tipo.getTipo());
        }
    }
    public void elencoAbilita(TipoEnum tipo){
        for(int j = 0; j < tipo.getAbilitaSpeciali().size(); j++){
            int cont = j+1;
            System.out.println(cont + "." + tipo.getAbilitaSpeciali().get(j));
        }
    }
    public String verificaNome(String nome){
        String verificanome = nome;
        for(CreaturaMagica creaturaMagica : registro){
            if(creaturaMagica.getNome().equalsIgnoreCase(verificanome)){
                verificanome = null;
            }
        }
        return verificanome;
    }
    public void cercaNome(String nome){
        int i = 0;
        boolean presente = false;
        for(CreaturaMagica creatura : registro){
            if(creatura.getNome().equals(nome)){
                presente = true;
                break;
            }else {
                i++;
            }
        }
        if (presente){
            System.out.println(registro.get(i).stampa());
        }else {
            System.out.println("non presente");
        }
    }
    public void cercaTipo(String tipo){
        boolean presente = false;
        for(TipoEnum tipoVar : TipoEnum.values()){
            if(tipoVar.getTipo().equalsIgnoreCase(tipo)){
                System.out.println();
                presente = true;
            }
        }
        if (!presente){
            System.out.println("nessuna cretura presente di quel tipo");
        }
    }


    public void setCreatura(CreaturaMagica creaturaMagica){
        boolean presente = false;
        for(CreaturaMagica creatura : registro) {
            if(creaturaMagica.getNome().equalsIgnoreCase(creatura.getNome())){
                System.out.println(creaturaMagica.getNome() + " è già presente nel registro");
                presente = true;
            }else {
                presente = false;
            }
        }
        if(!presente){
            registro.add(creaturaMagica);
        }
    }
    public void removeCreatura(String nome){
        int i = 0;
        boolean nonPresente = false;
        for(CreaturaMagica creatura : registro){
            if(Objects.equals(creatura.getNome(), nome)){
                registro.remove(i);
                break;
            }else{
                nonPresente = true;
            }
            i++;
        }
        if(nonPresente){
            System.out.println("creatura non presente");
        }
    }

    public void sfida(Integer primoSfidante , Integer secondoSfidante){
            primoSfidante -= 1;
            secondoSfidante -= 1;
            if (registro.get(primoSfidante).getLivelloPotenza() > registro.get(secondoSfidante).getLivelloPotenza()) {
                System.out.println(registro.get(primoSfidante).getNome() + " ha vinto contro " + registro.get(secondoSfidante).getNome());
            } else if (registro.get(primoSfidante).getLivelloPotenza() < registro.get(secondoSfidante).getLivelloPotenza()) {
                System.out.println(registro.get(secondoSfidante).getNome() + " ha vinto contro " + registro.get(primoSfidante).getNome());
            } else {
                System.out.println(registro.get(primoSfidante).getNome() + " e " + registro.get(secondoSfidante).getNome() + " hanno pareggiato nello scontro");
            }
    }


}
