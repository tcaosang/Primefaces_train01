package com.sang.store.jsf;

import org.primefaces.event.TabChangeEvent;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "aboutViewController")
@RequestScoped
public class AboutViewController  {
    public AboutViewController() {
    }

    //Tạo Message khi table thay đổi giá trị
    public void tabChangeHandler(TabChangeEvent changeEvent){
        FacesMessage message = new FacesMessage("Tab Changed ! OK","Active Tab"+ changeEvent.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
