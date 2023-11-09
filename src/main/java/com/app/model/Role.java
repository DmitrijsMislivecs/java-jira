package com.app.model;

import java.util.List;

public class Role {
    private long id;
    private String name;
    private List<TicketType> availableTypes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TicketType> getAvailableTypes() {
        return availableTypes;
    }

    public void setAvailableTypes(List<TicketType> availableTypes) {
        this.availableTypes = availableTypes;
    }
}
