//Source file: D:\\9 ���\\����\\ClassDiagram\\Gift.java

package by.home.entity;

import lombok.Data;


import javax.persistence.*;
import javax.persistence.GeneratedValue;


@Data
@Entity
public class Gift 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;
   @Column(nullable = false)
   private Integer id_store;
   @Column(nullable = false)
   private Integer id_provider;
   @Column(nullable = false)
   private String name;
   @Column(nullable = false)
   private String description;
   
   /**
    * @roseuid 5669EDEE0361
    */
   public Gift() 
   {
    
   }
}
