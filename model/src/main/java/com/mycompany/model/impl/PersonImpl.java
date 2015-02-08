package com.mycompany.model.impl;

import com.mycompany.model.Person;
import java.util.Date;

/**
 *
 * @author Pajcak
 */
public class PersonImpl implements Person{
    private Date birth;
    private Date death;
    private FamilyRelation familyRelation;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getDeath() {
        return death;
    }

    public void setDeath(Date death) {
        this.death = death;
    }

    public FamilyRelation getFamilyRelation() {
        return familyRelation;
    }

    public void setFamilyRelation(FamilyRelation familyRelation) {
        this.familyRelation = familyRelation;
    }
}
