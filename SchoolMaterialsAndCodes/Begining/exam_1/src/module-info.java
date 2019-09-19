public class DriehoekBerekenen { 
    public static void main(String[] args) {
        
        // Declare
        Scanner invoer = new Scanner(System.in);
        String doorgaanAntwoord;
        int basis;
        int hoogte;
        double oppervlakte;
        double gokAntwoord;
        
        // Doorgaan?
        doorgaanAntwoord = vraagDoorgaan(invoer); 
        
        while(doorgaanAntwoord.equals("j")) {
            
            // Stel vraag
            basis = randomAfmeting();
            hoogte = randomAfmeting();
            oppervlakte = oppervlakteBerekenen(basis, hoogte);
            
            System.out.print("Bereken de oppervlakte van een driehoek met basis = " + basis + " en hoogte = " + hoogte + " : ");
            gokAntwoord = invoer.nextDouble(); 
            controleAntwoord(oppervlakte, gokAntwoord);
            
            doorgaanAntwoord = vraagDoorgaan(invoer); 
        }
        
        System.out.println("Het programma wordt nu gestopt.");
        invoer.close();
    }
    private static void controleAntwoord(double oppervlakte, double gokAntwoord) {
        if (gokAntwoord == oppervlakte) {
            System.out.println("Jouw antwoord is goed!");
        } else {
            System.out.println("Jouw antwoord is fout!");
            System.out.println("Het juiste antwoord is " + oppervlakte);
        }
    }
    private static double oppervlakteBerekenen(int basis, int hoogte) {
        return 0.5 * basis * hoogte;
    }
    private static String vraagDoorgaan(Scanner invoer) {
        String doorgaanAntwoord;
        System.out.print("Wil je de oppervlakte van een driehoek uitrekenen?\nDoorhaam j/n?: ");
        doorgaanAntwoord = invoer.next();
        return doorgaanAntwoord;
    }
    private static int randomAfmeting() {
        return (int)(Math.random() * 8) + 2;
    }
}
