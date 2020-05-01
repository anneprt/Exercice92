public class Exercice92 {
    public static void main(String[] args) {
        int plusGrande;
        int plusPetite;
        int somme = 0;
        int iMax = 0;
        int nbMoy = 0;

        double moyenne;
        if (args.length > 0) {
            int[] valeur = new int[args.length];
            for (int i = 0; i < args.length; i++)
                // a. stocke dans un tableau, des valeurs entières
                valeur[i] = Integer.parseInt(args[i]);
            plusGrande = valeur[0];
            for (int i = 0; i < valeur.length; i++) {
                if (plusGrande < valeur[i]) {
                    // d. recherche la plus grande des valeurs
                    plusGrande = valeur[i];
                    // e. détermine la position de la plus grande des valeurs
                    iMax = i;
                }
                // b. calcule la somme de ces valeurs
                somme = somme + valeur[i];
            }
            // c. calcule la moyenne de ces valeurs
            moyenne = (float) somme / valeur.length;
            for (int i = 0; i < valeur.length; i++)
                // f. calcule le nombre de valeurs supérieure à la moyenne
                if (valeur[i] >= moyenne) nbMoy++;
            System.out.println("La plus grande valeur est : " + plusGrande);
            System.out.println("A l'indice : " + iMax + " du tableau ");
            System.out.println("La moyenne de ces valeurs : " + moyenne);
            System.out.println("Nombre de valeurs > a la moyenne : " + nbMoy);
        } else System.out.println("Commande : java Exercice2 listeDesValeursEntières ");
    }
}

