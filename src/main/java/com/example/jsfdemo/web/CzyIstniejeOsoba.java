package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("CzyIstniejeOsoba")
public class CzyIstniejeOsoba implements Validator, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public void validate(FacesContext context, UIComponent compoment, Object value){
			String imie = (String) value;
			Pattern p = Pattern.compile("^(\\w)*(\\d+)(\\w)*");
			Matcher m = p.matcher(imie);
			boolean b = m.matches();
			if (b) {
				FacesMessage message = new FacesMessage();
				message.setDetail("Od kiedy to mamy cyfry w imieniu??");
				message.setSummary("Od kiedy to mamy cyfry w imieniu??");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(message);
			}
			
			
			
			
			
			
			
	}	
}
