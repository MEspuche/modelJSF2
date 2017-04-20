package demoJSF1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator 
public class MonValideurCivilite implements Validator{

	public void validate(FacesContext facesContext, UIComponent component, Object value ) throws ValidatorException
	{
		String inputData = value.toString();
		if(!(inputData.equals("Mr")|| inputData.equals("Mme") || inputData.equals("Mlle")))
		{
			FacesMessage msg = new FacesMessage("Erreur de civilité(Mr, Mme, Mlle)");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}
	
}
