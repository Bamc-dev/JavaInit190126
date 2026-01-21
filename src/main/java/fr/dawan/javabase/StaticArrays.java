package fr.dawan.javabase;

public class StaticArrays {
    public static void main(String[] args) {
        //1 Dimension --> [x, y , z]

        double[] notes = {12, 7, 16.3, 6.7};

        System.out.println("Premier element du tableau "+notes[0]);
        System.out.println("Deuxieme element du tableau "+notes[1]);

        System.out.println("Taille du tableau : "+notes.length);

        double[] prix = new double[4];

        System.out.println(prix[2]);
        prix[2] = 72.2;
        System.out.println(prix[2]);

        System.out.println("============ Les boucles =================");

        System.out.println("----------- For -------------");
        for (byte i = 0; i < notes.length; i++) {
            System.out.println(i + " : "+notes[i]);
        }

        System.out.println("------------- Foreach ----------------");
        for (double note : notes)
        {
            System.out.println(note);
        }

        System.out.println("-------------- Boucle For vs Boucle Foreach ----------------");
        System.out.println("Modification avec For");
        for (int i = 0; i < prix.length; i++) {
            prix[i] = 47.2;
            System.out.println(prix[i]);
        }
        System.out.println("Modification avec forEach");
        for (double note : notes){
            note *= 2;
            System.out.println(note);
        }

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Valeur de note index "+i+" Valeur :"+notes[i]);
            System.out.println("Valeur de prix index "+i+" Valeur :"+prix[i]);
        }

        System.out.println("---------- While -----------------");
        int i = 0;
        while (i<notes.length)
        {
            System.out.println(notes[i]);
            i++;
        }
        System.out.println("---------- Do While -----------------");
        //S'execute au moins une fois
        int f = 0;
        do {
            System.out.println(notes[f]);
            f++;
        }while (f<notes.length);

        System.out.println("--------- Tableau a deux dimensions --------------");
        int[][] scores = {
                {5, 25, 78, 24}, //row1 (0)
                {80, 6, 18, 74}, //row2 (1)
                {37, 65, 44} //row3 (2)
        };

        System.out.println("Score "+scores[1][1]);

        for (int[] scoreRow : scores)
        {
            System.out.print("[");
            for (int value : scoreRow)
            {
                System.out.print(value+" ");
            }
            System.out.println("]");
        }
    }
}
