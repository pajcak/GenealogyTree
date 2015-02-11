package com.mycompany.model.impl;

import com.mycompany.model.AbstractRelation;
import com.mycompany.model.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vaclavblazej
 */
public class FamilyRelation extends AbstractRelation {
    
    private Person mother;
    private Person father;
    private List<Person> children;
    
    public FamilyRelation(Person mother, Person father, Person ... children) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<Person>(Arrays.asList(children));
    }
    
    public Person getMother() {
        return mother;
    }
    
    public void setMother(Person mother) {
        this.mother = mother;
    }
    
    public Person getFather() {
        return father;
    }
    
    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }
}
