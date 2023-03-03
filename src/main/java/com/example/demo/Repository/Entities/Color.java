package com.example.demo.Repository.Entities;
// default package
// Generated Mar 3, 2023, 8:43:28 PM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.HashSet;
import java.util.Set;

/**
 * Color generated by hbm2java
 */
@Entity
@Table(name="color"
    ,catalog="flamingoo"
    , uniqueConstraints = @UniqueConstraint(columnNames="title") 
)
public class Color  implements java.io.Serializable {


     private int id;
     private String title;
     private Set<Product> products = new HashSet<Product>(0);

    public Color() {
    }

	
    public Color(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public Color(int id, String title, Set<Product> products) {
       this.id = id;
       this.title = title;
       this.products = products;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="title", unique=true, nullable=false, length=45)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="color_has_product", catalog="flamingoo", joinColumns = { 
        @JoinColumn(name="color_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="product_id", nullable=false, updatable=false) })
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }




}


