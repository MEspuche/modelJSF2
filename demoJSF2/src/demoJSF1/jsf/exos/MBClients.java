package demoJSF1.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name ="mbclients", eager=true)
@SessionScoped
public class MBClients {


	public ArrayList<Client> clients = new ArrayList<Client>();
	public MBClients()
	{
		clients.add(new Client("Dupont", "Jean"));
		clients.add(new Client ("Durand","Paul"));
	}
	public ArrayList<Client> getClients() {
		System.out.println("get mbclients");
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	private String newClientNom;
	private String newClientPrenom;

	
	
	public String getNewClientNom() {
		return newClientNom;
	}
	public void setNewClientNom(String newClientNom) {
		this.newClientNom = newClientNom;
	}
	public String getNewClientPrenom() {
		return newClientPrenom;
	}
	public void setNewClientPrenom(String newClientPrenom) {
		this.newClientPrenom = newClientPrenom;
	}

	private Client clientCourant;
	
	public Client getClientCourant() {
		return clientCourant;
	}
	public void setClientCourant(Client clientCourant) {
		this.clientCourant = clientCourant;
	}
	public String select(Client client)
	{
		this.clientCourant = client;
		System.out.println("select : " + client.getNom());
		return "client";
	}
	
	public String delete()
	{
		clients.remove(clientCourant);
		System.out.println("deleting : " + clientCourant.getNom());
		return "clients";
		
	}
	
	public String ajouter(String a, String b)
	{
		Client nouveauclient = new Client(a,b);
		clients.add(nouveauclient);
		return "clients";
	}
	
	
	
	
}
