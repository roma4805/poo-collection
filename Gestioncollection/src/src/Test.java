import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
     
        Commande cmd1 = new Commande(1, new Date(), "Fournisseur1");
        Commande cmd2 = new Commande(2, new Date(), "Fournisseur2");

        
        Client client1 = new Client("C001", "Client 1", "Adresse 1");
        client1.enregistrerCommande(cmd1);
        client1.enregistrerCommande(cmd2);

        ClientFidel clientFidel = new ClientFidel("C002", "Client 2", "Adresse 2", "F123", 0.1f);

    
        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(clientFidel);

       
        Collections.sort(client1.getListeCommandes());

     
        Set<Commande> commandes = new HashSet<>(client1.getListeCommandes());

       
        Map<String, Client> mapClients = new HashMap<>();
        mapClients.put(client1.toString(), client1);

       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clients.txt"))) {
            for (Client client : clients) {
                writer.write(client.toString());
            }
        }

      
        try (BufferedReader reader = new BufferedReader(new FileReader("clients.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
