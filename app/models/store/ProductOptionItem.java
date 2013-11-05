package models.store;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.Post;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class ProductOptionItem extends Model  {

    @ManyToOne
    @Required
    public ProductOption productOption;
    
    public String name;
    
    public String desc;
    
    public float surcharge;
}
