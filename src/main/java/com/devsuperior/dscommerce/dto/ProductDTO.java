package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgURl;


    private List<CategoryDTO> categories = new ArrayList<>();


    public ProductDTO() {

    }

    public ProductDTO(Long id, String name, String description, Double price, String imgURl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgURl = imgURl;
    }


    public ProductDTO(Product entity) {
        id= entity.getId();
        name= entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgURl = entity.getImgUrl();
        for (Object cat: entity.getCategories())
            categories.add(new CategoryDTO((Category) cat));
    }
    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgURl() {
        return imgURl;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }
}