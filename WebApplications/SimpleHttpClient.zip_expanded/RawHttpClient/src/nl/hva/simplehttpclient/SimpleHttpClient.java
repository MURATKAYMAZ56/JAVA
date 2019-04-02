/*
 *  Vergeet het doel en de HBO-ICT Codeconventies niet!
 */
package nl.hva.simplehttpclient;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

/**
 * Doel: handmatig oefenen met het http-protcol daarom procedurele opzet zodat
 * het stap voor stap gevolgd kan worden Stuurt een request en print response
 * naar de console Voor meer voorbeelden:
 * http://www.codejava.net/java-se/networking/java-socket-client-examples-tcp-ip
 *
 * @author Remi de Boer <r.d.d.de.boer@hva.nl>
 */
public class SimpleHttpClient {

    private final static int HTTP_PORT = 80;

    // voor de overzichtelijkheid in code alle Exceptions naar boven gegooid (normaal niet de manier natuurlijk)
    public static void main(String[] args) throws Exception {
        simpleRawRequest();  
        postUsingHttpsConnection(); // gebruik voor een HTTPS verbinding
    }

    // gebruik voor een HTTP verbinding, werkt niet voor een HTTPS verbinding
    private static void simpleRawRequest() throws IOException {

        // we hebben socket nodig om met een server te verbinden
        // deze socket zal een adres en een poort moeten krijgen
        // adress gaat met een InetAdress object
        // deze zet naam om naar ip adres (haalt op bij DNS)
        String host = "www.hva.nl"; // sommige host willen https en geven een forbidden of bad request: deze werkt "www.codejava.net"

        InetAddress inetAddress = InetAddress.getByName(host); // throws unknownhostexception, kan ook met URL
        // print IP-adress van de gegeven host
        System.out.println(inetAddress.getHostAddress());

        // gebruik try-with-resources om automatisch de bronnen te sluiten na try block
        try (Socket socket = new Socket(inetAddress, HTTP_PORT); // maak socket aan voor communicatie
                OutputStream out = socket.getOutputStream(); // open stream voor het versturen dataver
                PrintWriter writer = new PrintWriter(out, true); // printwriter handig voor tekst, true sets outflush na elke commando
                InputStream in = socket.getInputStream()) { // open stream voor ontvangen van data

            // sturen van een request geformatteerd volgens HTTP-protocol 1.1
            // REQUEST STUREN
            // use \r\n for CRLF oftewel nieuwe regel
            String request  = String.format(
                    "GET / HTTP/1.1\r\n"
                    + "Host: %s\r\nUser-Agent: Simple HTTP Client\r\n"
                    + "Accept: text/html\r\n"
                    + "Connection: close\r\n" // zeg tegen server dat de verbinding gesloten moet worden na afleveren response, wijzig naar keep-alive en bekijk header
                    + "\r\n", host); // lege regel nodig anders weet de server niet dat de request ophoud, haal maar weg en zie wat het verschil is
             
            writer.println(request); // write request to server

            printServerReponseToConsole(in, System.out);

        }
    }
    
    

    private static void printServerReponseToConsole(InputStream in, PrintStream out) {
        // RESPONSE VAN SERVER LEZEN
        try (Scanner scanner = new Scanner(in, "UTF-8")) {// gebruik scanner om response te lezen, we kijken hier alleen naar de tekst
            scanner.useDelimiter("\r\n"); // set different from 'normal' \n
            // RESPONSE VAN SERVER LEZEN
            out.println("RESPONSE:");
            while (scanner.hasNextLine()) {
                out.println(scanner.nextLine()); //
            }
        }
    }

    /*
     * Method to post to e HTTPS connection, using normal socket won't work
     * See convert_form_post.html in source folder that uses below request 
     * for same functionality but in a html form
     * also a convert_form_get.html to see difference in URL parameters
     */
    private static void postUsingHttpsConnection() throws IOException {
        String url = "https://www.remideboer.com/convert/temperature_post.php";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST"); // get works, but shouldnt
        con.setRequestProperty("User-Agent", "Simple Web Client");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "waarde=15&type=c2f";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();
        printServerReponseToConsole(con.getInputStream(), System.out);
    }

}
