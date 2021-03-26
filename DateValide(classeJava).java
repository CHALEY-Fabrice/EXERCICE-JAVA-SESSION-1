    //Exercice 3
    //Saisir une date (jj-mm-aaaa) puis determiner si la date 
    //est valide ou pas 
    //Sans  classe de java 

import java.util.Scanner;
class DateValideSansClasse {
    public static void main(String[] args) {
        Scanner exo = new Scanner(System.in);
        System.out.println("veuille saisir une année : ");
        int annee = exo.nextInt();
        System.out.println("veuille saisir un mois : ");
        int mois = exo.nextInt();
        System.out.println("veuille saisir une date : ");
        int jour = exo.nextInt();

        if ((1<=jour && jour <= 31) && (mois==1) || (mois==3)|| (mois==5) || (mois==7) || (mois==8) || (mois==10)||(mois==12)){
            System.out.println("la date est valide");
        }else if((1<=jour && jour <= 30) && (mois==4) || (mois==6)|| (mois==9) || (mois==11)){

            System.out.println("Date valide");

        }
        else if (mois==2){

            if(((annee%4==0) && (annee%100!=0)) || (annee%400==0)){
                if (1<=jour && jour <= 29 ){
                    System.out.println("Date valide");
                }
                else{
                    System.out.println("Date invalide");
                }
            } 
        }
        else{
            System.out.println("Date invalide");
        }   
    }
}