package com.sang.ministore.beans;

import org.primefaces.event.ResizeEvent;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by Sang on 11/10/2016.
 */
@Named(value = "beanManager")
@RequestScoped
public class BeanManager {



    public BeanManager() {
    }

    public void layoutResizeEvent(ResizeEvent event){
    System.out.println("Layout has been sized" + event.getComponent());
}

}