package com.sang.store.jsf;

import org.primefaces.event.ResizeEvent;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {

    private String selectionType;

    private List<Legend>  weapon = new ArrayList();

    public List<Legend> getWeapon() {
        Legend item1 = new Legend();
        item1.setType("One Hand");
        item1.setPrice(100);
        item1.setDesciption("Make by Tom cuirse");

        Legend item2 = new Legend();
        item2.setType("Two Hand");
        item2.setPrice(150);
        item2.setDesciption("Make by Hilray");
        Legend item3 = new Legend();
        item3.setType("Knife");
        item3.setPrice(80);
        item3.setDesciption("Make by Jason");
        Legend item4 = new Legend();
        item4.setType("Staff");
        item4.setPrice(100);
        item4.setDesciption("Make by Aladin");

        weapon = new ArrayList();
        weapon.add(item1);
        weapon.add(item2);
        weapon.add(item3);
        weapon.add(item4);
        return weapon;
    }

    public void setWeapon(List<Legend> weapon) {
        this.weapon = weapon;
    }

    public MainViewController() {
    }
    public String legendary(){
        selectionType ="legendary";
        return "automobile";
    }

    public String rare(){
        selectionType ="rare";
        return "automobile";
    }

    public String common(){
        selectionType = "common";
        return "automobile";
    }


    public void layoutResizeEvent(ResizeEvent event){
    System.out.println("Layout has been sized" + event.getComponent()); }

    public String getSelectionType() {
        return selectionType;
    }

    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }
}