public class App {
    public static void main(String[] args) throws Exception {
       //array multidimensionali
       String[][] classi = new String[3][3];
       classi[0][0] = "Luca";
       classi[0][1] = "Anna";
       classi[0][2] = "Marco";
       classi[1][0] = "Luca";
       classi[1][1] = "Anna";
       classi[1][2] = "Marco";
       classi[2][0] = "Luca";
       classi[2][1] = "Anna";
       classi[2][2] = "Marco";

       String[][] classi2 = {
           {"Luca", "Anna", "Marco"},
           {"Luca", "Anna", "Marco"},
           {"Luca", "Anna", "Marco"}
       };

       System.out.println(classi[2][1]);

       for (int classe = 0; classe < classi.length; classe++){
           System.out.println();
           for(int studente = 0; studente < classi[classe].length; studente++) {
               System.out.print(classi[classe][studente] + " ");
           }
       }

       for (String[] classe: classi) {
            System.out.println();
            for (String studente: classe) {
                System.out.print(studente + " ");
            }
       }
    }
}
