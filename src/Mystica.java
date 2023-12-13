//import java.util.Scanner;
//
//public class Mystica {
//    private RegistroCreature registro;
//    Scanner scanner = new Scanner(System.in);
//    public void mystica(int selezione,String nome) {
//        do {
//            //iniziamo il minigioco con le seguenti opzioni , se viene selezionata un oopzione errata andra in errore
//            //se viene selezionata un oopzione errata andra in errore e tornera all'inizio
//            System.out.println("-- Operazioni Disponibili --");
//            System.out.println("1. Aggiungi creatura magica");
//            System.out.println("2. Rimuovi creatura magica");
//            System.out.println("3. Visualizza elenco creature magiche");
//            System.out.println("4. Cerca creatura magica");
//            System.out.println("5. Sfida una creatura");
//            System.out.println("6. Esci");
//            //dichiaro una variabile d'appoggio
//            String errore = "\nERRORE! inserire una corretta selezione\n";
//            //selezione di quello che si vuole fare
//
//            switch (selezione) {
//                case 1:
//                    System.out.println("Inserisci il nome: ");
//                    int numero = scanner.nextInt();
//                    TipoEnum tipo = minigame.sceltaTipo(numero);
//                    //lasciamo scegliere l'abilita speciale tra quelle presenti nell'array del tipo
//                    //se non presente andrà in loop fino ad una corretta selezione
//                    Integer sceltaAbilita = null;
//                    boolean loopAbilita = true;
//                    while (loopAbilita) {
//                        System.out.println("Inserisci l'abilità speciale: ");
//                        registro.elencoAbilita(tipo);
//                        sceltaAbilita = scanner.nextInt() - 1;
//                        if (sceltaAbilita < 0) {
//                            System.out.println(errore);
//                        } else if (sceltaAbilita >= tipo.getAbilitaSpeciali().size()) {
//                            System.out.println(errore);
//                        } else {
//                            loopAbilita = false;
//                        }
//                    }
//                    System.out.println("Inserisci il livello di potenza: ");
//                    Integer livelloPotenza = scanner.nextInt();
//                    System.out.println("Creatura magica aggiunta con successo al registro!");
//                    registro.setCreatura(new CreaturaMagica(nome, tipo, sceltaAbilita, livelloPotenza));
//                    break;
//                case 2:
//                    System.out.println("Inserisci il nome della creatura che vuoi rimuovere");
//                    String nomeToRemove = scanner.next();
//                    registro.removeCreatura(nomeToRemove);
//                    break;
//                case 3:
//                    registro.elenco();
//                    break;
//                case 4:
//                    System.out.println("Inserisci il nome della creatura che vuoi cercare");
//                    String cercaNome = scanner.next();
//                    registro.cercaNome(cercaNome);
//                    break;
//                case 5:
//                    if (registro.getSize() < 2) {
//                        System.out.println("Aggiungere almeno due creature prima di effettuare la sfida");
//                    } else {
//                        System.out.println("Scegli due personaggi: ");
//                        registro.elenco();
//                        int primoSfindate = scanner.nextInt();
//                        System.out.println();
//                        int secondoSfidante = scanner.nextInt();
//                        registro.sfida(primoSfindate, secondoSfidante);
//                    }
//                    break;
//                case 6:
//                    break;
//                default:
//                    System.out.println(errore);
//            }
//            System.out.println("-------------------------------------------");
//        } while (selezione != 6);
//    }
////    //lasciamo scegliere il tipo tra quelli presenti in TipoEnum
////    //se non presente andrà in loop fino ad una corretta selezione
////    TipoEnum tipo = null;
////    boolean loopTipo = true;
////        while (loopTipo) {
//
//}
// Integer sceltaAbilita = null;
//         boolean loopAbilita = true;
//         while (loopAbilita){
//         System.out.println("Inserisci l'abilità speciale: ");
//         mystica.getRegistro().elencoAbilita(tipo);
//         sceltaAbilita = scanner.nextInt()-1;
//         if(sceltaAbilita < 0){
//        System.out.println(errore);
//        }else if (sceltaAbilita >= tipo.getAbilitaSpeciali().size()){
//        System.out.println(errore);
//        }else{
//        loopAbilita = false;
//        }
//        }
//        System.out.println("Inserisci il livello di potenza: ");
//        Integer livelloPotenza = scanner.nextInt();
//        System.out.println("Creatura magica aggiunta con successo al registro!");
//        mystica.getRegistro().setCreatura(new CreaturaMagica(nome, tipo, sceltaAbilita, livelloPotenza));
