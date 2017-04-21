package demoJSF1.jsf.exos;

import java.util.ArrayList;


public class ClientService {


	public ArrayList<Client> clients = new ArrayList<Client>();

	
	
	
	public ArrayList<Client> getClients() {
		System.out.println("get mbclients");
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	

	public ClientService()
	{
		clients.add(new Client("Dupont", "Jean"));
		clients.add(new Client ("Durand","Paul"));
	}
	
	public void delete(Client client)
	{
		clients.remove(client);
	}
	
	public void ajouter(Client client)
	{
		clients.add(client);
	}
	
	
	
	
}
