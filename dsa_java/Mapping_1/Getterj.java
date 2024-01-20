/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring;

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
    private String city;
    private Map<String,String> entry;

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
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the entry
     */
    public Map<String,String> getEntry() {
        return entry;
    }

    /**
     * @param entry the entry to set
     */
    public void setEntry(Map<String,String> entry) {
        this.entry = entry;
    }
    public void show(){
        System.out.println(name+city);
        Set<Map.Entry<String,String>> s=entry.entrySet();
        Iterator<Map.Entry<String,String>> it=s.iterator();
        while(it.hasNext()){
            Entry<String, String> ent = it.next();
            System.out.println(ent.getKey()+ent.getValue());
        }
    }
}
