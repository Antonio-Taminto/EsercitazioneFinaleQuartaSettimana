public class CreaturaMagica {
    private String nome;
    private TipoEnum tipo;
    private String abilitaSpeciale;
    private Integer livelloPotenza;

    public CreaturaMagica(String nome, TipoEnum tipo, int abilitaSpeciale, Integer livelloPotenza) {
        this.nome = nome;
        this.tipo = tipo;
        this.abilitaSpeciale = tipo.getAbilitaSpeciali().get(abilitaSpeciale);
        this.livelloPotenza = livelloPotenza;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public String getAbilitaSpeciale() {
        return abilitaSpeciale;
    }

    public void setAbilitaSpeciale(String abilitaSpeciale) {
        this.abilitaSpeciale = abilitaSpeciale;
    }

    public Integer getLivelloPotenza() {
        return livelloPotenza;
    }

    public void setLivelloPotenza(Integer livelloPotenza) {
        this.livelloPotenza = livelloPotenza;
    }

    public void check(){
        try {

            if (livelloPotenza < 0) {
                throw new ArithmeticException();
            }
        }catch (ArithmeticException e){
            livelloPotenza = 0;
            System.out.println(nome + " la potenza non è impostabile in negativo");
        }
    }

    public String stampa(){
        String result ="Nome : " + nome + " - di tipo: " + tipo.getTipo() + " - con l'abilità speciale: " + abilitaSpeciale + " - livello potenza " + livelloPotenza;
        return  result;
    }

    public void setTipoEnum(int x){
        switch (x){
            case 1:
                setTipo(TipoEnum.DRACO);
                break;
            case 2:
                setTipo(TipoEnum.ELEMENTALE);
                break;
            case 3:
                setTipo(TipoEnum.FOLLETTO);
        }

    }
}
