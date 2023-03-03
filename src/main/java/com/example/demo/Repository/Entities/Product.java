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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name="product"
    ,catalog="flamingoo"
)
public class Product  implements java.io.Serializable {


     private int id;
     private Category category;
     private String name;
     private String description;
     private int price;
     private int quantity;
     private Set<User> users = new HashSet<User>(0);
     private Set<Color> colors = new HashSet<Color>(0);
     private Images images;
     private Set<OrderItems> orderItemses = new HashSet<OrderItems>(0);

    public Product() {
    }

	
    public Product(int id, Category category, String name, String description, int price, int quantity) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(int id, Category category, String name, String description, int price, int quantity, Set<User> users, Set<Color> colors, Images images, Set<OrderItems> orderItemses) {
       this.id = id;
       this.category = category;
       this.name = name;
       this.description = description;
       this.price = price;
       this.quantity = quantity;
       this.users = users;
       this.colors = colors;
       this.images = images;
       this.orderItemses = orderItemses;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id", nullable=false)
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", nullable=false, length=45)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="price", nullable=false)
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    
    @Column(name="quantity", nullable=false)
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="user_review_product", catalog="flamingoo", joinColumns = { 
        @JoinColumn(name="product_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="user_id", nullable=false, updatable=false) })
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="color_has_product", catalog="flamingoo", joinColumns = { 
        @JoinColumn(name="product_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="color_id", nullable=false, updatable=false) })
    public Set<Color> getColors() {
        return this.colors;
    }
    
    public void setColors(Set<Color> colors) {
        this.colors = colors;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="product")
    public Images getImages() {
        return this.images;
    }
    
    public void setImages(Images images) {
        this.images = images;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="order_items_has_product", catalog="flamingoo", joinColumns = { 
        @JoinColumn(name="product_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="order_items_id", nullable=false, updatable=false), 
        @JoinColumn(name="order_items_order_details_id", nullable=false, updatable=false), 
        @JoinColumn(name="order_items_order_details_user_id", nullable=false, updatable=false) })
    public Set<OrderItems> getOrderItemses() {
        return this.orderItemses;
    }
    
    public void setOrderItemses(Set<OrderItems> orderItemses) {
        this.orderItemses = orderItemses;
    }




}

