package com.example.PropertySearch.model;

public class PropertyFactory {
    public Property createProperty(String location, double price, double sqrFootage, int bedrooms, int bathrooms) {
        Property property = new Property(location, price, sqrFootage, bedrooms, bathrooms);
        return property;
    }
}
