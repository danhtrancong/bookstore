package com.bookstore.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
    private List<ProductEntity> products = new ArrayList<>();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

//    @Override
//    public boolean equals(Object o) {
//        // If the object is compared with itself then return true
//        if (o == this) {
//            return true;
//        }
//
//        /* Check if o is an instance of Complex or not
//          "null instanceof [type]" also returns false */
//        if (!(o instanceof CategoryEntity)) {
//            return false;
//        }
//
//        // typecast o to Complex so that we can compare data members
//        CategoryEntity c = (CategoryEntity) o;
//
//        // Compare the data members and return accordingly
//        return this.name.equals(c.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return this.name.hashCode();
//    }
}
