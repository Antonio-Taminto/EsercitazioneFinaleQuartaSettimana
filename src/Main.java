import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i ;

        Minigame mystica = new Minigame(new RegistroCreature());



        do {
            //iniziamo il minigioco con le seguenti opzioni , se viene selezionata un oopzione errata andra in errore
            //se viene selezionata un oopzione errata andra in errore e tornera all'inizio
            System.out.println("-- Operazioni Disponibili --");
            System.out.println("1. Aggiungi creatura magica");
            System.out.println("2. Rimuovi creatura magica");
            System.out.println("3. Visualizza elenco creature magiche");
            System.out.println("4. Cerca creatura magica");
            System.out.println("5. Sfida una creatura");
            System.out.println("6. Esci");
            //dichiaro una variabile d'appoggio
            String errore = "\nERRORE! inserire una corretta selezione\n";
            //selezione di quello che si vuole fare
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Inserisci il nome: ");
                    String nome = scanner.next();
                    if(nome == null){
                        System.out.println("creatura con quel nome già presente");
                        nome = scanner.next();
                    }
                    //lasciamo scegliere il tipo tra quelli presenti in TipoEnum
                    //se non presente andrà in loop fino ad una corretta selezione
                    int sceltaTipo;
                    System.out.println("Scegli il tipo tra i seguenti: ");
                    mystica.getRegistro().elencoTipi();
                    sceltaTipo  = scanner.nextInt();
                    mystica.sceltaTipo(sceltaTipo);

                    break;
                case 2:
                    System.out.println("Inserisci il nome della creatura che vuoi rimuovere");
                    String nomeToRemove = scanner.next();
                    mystica.getRegistro().removeCreatura(nomeToRemove);
                    break;
                case 3:
                    mystica.getRegistro().elenco();
                    break;
                case 4:
                    System.out.println("Inserisci il nome della creatura che vuoi cercare");
                    String cercaNome = scanner.next();
                    mystica.getRegistro().cercaNome(cercaNome);
                    break;
                case 5:
                    if(mystica.getRegistro().getSize()<2){
                        System.out.println("Aggiungere almeno due creature prima di effettuare la sfida");
                    }else {
                        System.out.println("Scegli due personaggi: ");
                        mystica.getRegistro().elenco();
                        int primoSfindate = scanner.nextInt();
                        System.out.println();
                        int secondoSfidante = scanner.nextInt();
                        mystica.getRegistro().sfida(primoSfindate, secondoSfidante);
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println(errore);
            }
            System.out.println("-------------------------------------------");
        }while (i != 6);




    }
}

