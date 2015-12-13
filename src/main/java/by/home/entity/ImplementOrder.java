//Source file: D:\\9 ���\\����\\ClassDiagram\\ImplementOrder.java

package by.home.entity;

import lombok.Data;

import javax.persistence.*;

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
   private String comments;
   @Column(nullable = false)
   private Integer id_transaction;
   
   /**
    * @roseuid 5669EDF101EC
    */
   public ImplementOrder() 
   {
    
   }
}
