package demoJSF1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="mbean1", eager = true)
@SessionScoped // permet de revenir à chaque fois sur le meme get sans nouvelle instanciation sur la meme session !
// @ApplicationScoped //permet de revenir à chaque fois sur le meme get sans nouvelle instanciation sur toutes les sessions !
// @ViewScoped //tant que l'on ne change pas de page
public class Mbean1 {
	
	private String message = "Hello";
	String data ="";
	String data2 = "";
	String lesDeux = "";
	String civilite="";
	
	
	
	
	
	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		System.out.println("setting civilite " + civilite);
		this.civilite = civilite;
	}

	public String getLesDeux() {
		return lesDeux = data + data2;
	}

	public void setLesDeux(String lesDeux) {
		this.lesDeux = lesDeux;
	}

	public String getData2() {
		return data2 ;
	}

	public void setData2(String data2) {
		this.data2 = data2;
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage("laForm:inputData2", new FacesMessage("message InputData2 depuis le bean"));
		ctx.addMessage("laForm:inputData3", new FacesMessage("MESSAGE INPUT DATA 3"));
		ctx.addMessage("laForm:inputData4", new FacesMessage("MESSAGE INPUT DATA 4 !"));
		ctx.addMessage(null, new FacesMessage("message for all depuis le bean"));
		ctx.addMessage("laFormResult:inputData3", new FacesMessage("MESSAGE INPUT DATA 3"));
	}

	private int compteur = 0 ;

	public String getMessage() {
		compteur++;
		return message +" " + compteur + " data = " + data + " data2 = "+ data2 ;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Mbean1()
	{ 
		System.out.println("Mbean1 constructeur");
	}
	


	public String getData() {
		return data;
	}

	public void setData(String data) {
		System.out.println("setting data : " + data);
		this.data = data;
	}
	
	public String goConditionnel(){
		if(data.length()>10) {
			return "jsf3result";		
		}
		else{
			return "jsf3result2";
		}
	}
	
	public String testErreur()
	{
		if(data.length()==0)
		{
		return "erreur";
		}
		else
			return goConditionnel();
		
	}
	
}
