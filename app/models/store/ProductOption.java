package models.store;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import models.Post;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class ProductOption extends Model  {

    @ManyToOne
    @Required
    public Product product;
    
    public String title;

    public int type;// 0: color 1:size 3:misc
    
    @OneToMany(mappedBy="productOption", cascade=CascadeType.ALL)
    public List<ProductOptionItem> items;
}
