package com;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;


public class Customer implements Serializable {

    private static final long serialVersionUID = -8926113054805074879L;

    private String id;

    private String firstName;

    private String lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(id, customer.id)
                .append(firstName, customer.firstName)
                .append(lastName, customer.lastName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(firstName)
                .append(lastName)
                .toHashCode();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
