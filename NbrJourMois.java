/** Exercice 2  
 *  Saisir une année  et un mois 
    puis determiner le nombre de jour de ce mois
    dans l'année
    Sans classe Java */ 
import java.util.Scanner;
    class NbrJourMois {
        public static void main(String[] args) {
            Scanner Clavier=new Scanner(System.in);

            System.out.println("Entrez Une année : ");
            int annee = Clavier.nextInt();
            
            System.out.println("CHOISSIZEZ LE NUMRO DE VOTRE MOIS ");
            System.out.println("******************* MENU *********************");
            System.out.println("1- Janvier");
            System.out.println("2- Fevrier");
            System.out.println("3- Mars");
            System.out.println("4- Avril");
            System.out.println("5- Mai");
            System.out.println("6- Juin");
            System.out.println("7- Juillet");
            System.out.println("8- Aout");
            System.out.println("9- Septembre");
            System.out.println("10- Octobre");
            System.out.println("11- Novembre");
            System.out.println("12- Decembre");
            System.out.println("entrer le numero correspondant au mois de votre choix ");
            int mois = Clavier.nextInt();
            switch(mois)
            {
            case 1:
             System.out.println("Le mois de Janvier de l'année : "+annee+" compte 31 jours ");break;
             case 2:

                    if((annee % 100 == 0) && (annee % 400 == 0)) 
                    {
                        System.out.println("Le mois de Février de l'année : "+annee+" compte 29 jours ");  
                        
                    }
                    else {
                        System.out.println("Le mois de Février de l'année : "+annee+" compte 28 jours ");   
                    }

                    break;
             case 3:
             System.out.println("Le mois de Mars de l'année : "+annee+" compte 31 jours ");break;
             case 4:
             System.out.println("Le mois de Avril de l'année : "+annee+" compte 30 jours ");break;
             case 5:
             System.out.println("Le mois de Mai de l'année : "+annee+" compte 31 jours ");break;
             case 6:
             System.out.println("Le mois de Juin de l'année : "+annee+" compte 30 jours ");break;
             case 7:
             System.out.println("Le mois de Juillet de l'année : "+annee+" compte 31 jours ");break;
             case 8:
             System.out.println("Le mois de Aout de l'année : "+annee+" compte 31 jours ");break;
             case 9:
             System.out.println("Le mois de Septembre de l'année : "+annee+" compte 30 jours ");break;
             case 10:
             System.out.println("Le mois de Octobre de l'année : "+annee+" compte 31 jours ");break;
             case 11:
             System.out.println("Le mois de Novembre de l'année : "+annee+" compte 30 jours ");break;
             case 12:
             System.out.println("Le mois de Décembre de l'année : "+annee+" compte 31 jours ");break;
            
            default:{ System.out.println("vous n'avez selectionné‚ aucun choix ");}
            }
            
        }
    }