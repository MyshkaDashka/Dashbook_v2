//Source file: D:\\9 ���\\����\\ClassDiagram\\Provider.java

package by.home.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Provider 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;
   @Column(nullable = false)
   private String name;
   @Column(nullable = false)
   private String company;
   
   /**
    * @roseuid 5669EDEE0026
    */
   public Provider() 
   {
    
   }
}
