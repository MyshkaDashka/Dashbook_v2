//Source file: D:\\9 ���\\����\\ClassDiagram\\News.java

package by.home.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class News
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;
   @Column(nullable = false)
   private String title;
   @Column(nullable = false)
   private String content;
   @Column
   private String comments;
   @Column(nullable = false)
   private Date date;
   @Column(nullable = false)
   private Integer id_profile;
   
   /**
    * @roseuid 5669EDF0028D
    */
   public News() 
   {
    
   }
}
