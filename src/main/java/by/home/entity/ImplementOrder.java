//Source file: D:\\9 ���\\����\\ClassDiagram\\ImplementOrder.java

package by.home.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class ImplementOrder 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;
   @Column(nullable = false)
   private Integer id_profile;
   @Column(nullable = false)
   private Integer id_store;
   @Column(nullable = false)
   private Integer summa;
   @Column(nullable = false)
   private Integer id_transaction;
   @Column(nullable = false)
   private Date date;
   
   /**
    * @roseuid 5669EDF101EC
    */
   public ImplementOrder() 
   {
    
   }
}
