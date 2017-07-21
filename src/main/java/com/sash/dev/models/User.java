package com.sash.dev.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

public class User {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String email;

    public User() {

    }

    public User(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("email", email)
                .toString();
    }
}
