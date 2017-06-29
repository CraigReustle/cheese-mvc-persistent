package org.launchcode.models;

import org.launchcode.models.Cheese;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Craig on 6/28/2017.
 */

@Entity
public class Menu {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3,max=15)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    //constructors
    public Menu() { }

    public Menu(String name) { this.name = name; }

    //getters and setters
    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Cheese> getCheeses() { return cheeses; }

    //additional methods
    public void addItem(Cheese item){
        cheeses.add(item);
    }

}
