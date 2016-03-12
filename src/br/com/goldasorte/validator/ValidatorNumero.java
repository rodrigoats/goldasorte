package br.com.goldasorte.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.goldasorte.util.StringUtil;


@FacesValidator("br.gov.pb.joaopessoa.validator.ValidatorNumero")
public class ValidatorNumero implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) {
		
		if (!StringUtil.isNumber(value.toString()) && !value.toString().isEmpty()){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite apenas n�meros", null);
			throw new ValidatorException(msg);
		}
	
	
	
	}
}
