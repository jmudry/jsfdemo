package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.Locale;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean 
@SessionScoped
public class Language implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(Language.class.getName());

	    private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	
	    public Locale getLocale() {
	        return locale;
	    }
	
	    public String getLanguage() {
	        return locale.getLanguage();
	    }
	
	    public void changeLanguage(String language) {
	        locale = new Locale(language);
	        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }
	

	}

