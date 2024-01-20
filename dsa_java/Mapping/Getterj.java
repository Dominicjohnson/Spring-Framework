/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Springj;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author m
 */
public class Getterj {
    private String name;
    private String place;
    private Map<usergetter,uusergetter> map;
    
    public void show(){
        System.out.println(getName()+getPlace());
        Set<Entry<usergetter,uusergetter>> s=getMap().entrySet();
        Iterator<Entry<usergetter,uusergetter>> it=s.iterator();
        while(it.hasNext()){
            Entry<usergetter,uusergetter> ent=it.next();
            System.out.println(ent.getKey());
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the map
     */
    public Map<usergetter,uusergetter> getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(Map<usergetter,uusergetter> map) {
        this.map = map;
    }

}
