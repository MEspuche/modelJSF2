package demoJSF1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="mbeanresult", eager = true)
@SessionScoped // permet de revenir à chaque fois sur le meme get sans nouvelle instanciation sur la meme session !
// @ApplicationScoped //permet de revenir à chaque fois sur le meme get sans nouvelle instanciation sur toutes les sessions !
// @ViewScoped //tant que l'on ne change pas de page
public class MbeanResult {
	
	public MbeanResult()
	{
		System.out.println("MbeanResult constructeur");
	}
	
	String dataResult ="";

	public String getDataResult() {
		return dataResult;
	}

	public void setDataResult(String dataResult) {
		System.out.println("setting dataResult : " + dataResult);
		this.dataResult = dataResult;
	}
	
	
	
}
