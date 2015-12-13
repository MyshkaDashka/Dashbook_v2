//Source file: D:\\9 ���\\����\\ClassDiagram\\Report.java

package by.home.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Report 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;
   @Column(nullable = false)
   private String title;
   @Column(nullable = false)
   private String content;
   @Column(nullable = false)
   private Date date;
   @Column(nullable = false)
   private Integer id_profile;
   
   /**
    * @roseuid 5669EDED01C3
    */
   public Report() 
   {
    
   }
}
