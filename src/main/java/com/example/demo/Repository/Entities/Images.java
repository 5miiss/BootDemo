package com.example.demo.Repository.Entities;
// default package
// Generated Mar 3, 2023, 8:43:28 PM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import org.hibernate.annotations.*;

/**
 * Images generated by hbm2java
 */
@Entity
@Table(name="images"
    ,catalog="flamingoo"
)
public class Images  implements java.io.Serializable {


     private int productId;
     private Product product;
     private String imageUrl;

    public Images() {
    }

    public Images(Product product, String imageUrl) {
       this.product = product;
       this.imageUrl = imageUrl;
    }
   
    @Id    
    @GenericGenerator(name="ImagesIdGenerator", strategy="foreign", parameters = @Parameter(name = "property", value = "user"))
    @GeneratedValue(generator="ImagesIdGenerator")
    @Column(name="product_id", unique=true, nullable=false)
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    
    @Column(name="image_url", nullable=false, length=45)
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }




}


