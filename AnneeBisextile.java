    // Exercice 1
    //Saisir une année qui est un entier positif puis 
    //déterminant si l'année est bisextile ou pas 
 
import  java.util.Scanner ;
class  AnneeBisextile {
    public  static  void  main ( String [] args ) {
       
        Scanner  Clavier = new  Scanner ( System . In );
        System.out.println ( " Entrez Une année pour vérification: " );
       
        int annee =  Clavier.nextInt ();
    
        if ((annee %  100  ==  0 ) && (annee %  400  ==  0 ))
        {
            System.out.println ( " L'année: " + annee + " est Bisextile " );
            
        }
        else {
            System.out.println ( " L'année: " + annee + " n'est Bisextile " );  
           }
}
}