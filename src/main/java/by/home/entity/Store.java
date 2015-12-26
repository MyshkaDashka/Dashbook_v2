//Source file: D:\\9 ���\\����\\ClassDiagram\\Store.java

package by.home.entity;


import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Entity
@Data
public class Store
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;
   @Column(nullable = false)
   private Integer price;
   @Column(nullable = false)
   private Integer count;
   @Column(nullable = false)
   private Date date;
   @Column(nullable = false)
   private Integer idGift;
   
   /**
    * @roseuid 5669EDF003E7
    */
   public Store() 
   {
    
   }
}
