package com.example.PropertySearch.controller;

import com.example.PropertySearch.model.Property;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/property_search")
public class PropertySearchController {
    private Property propertySearch;

    @GetMapping
    public List<Property> searchProperties()
    {
        return null;
    }
}
