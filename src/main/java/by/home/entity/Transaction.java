//Source file: D:\\9 ���\\����\\ClassDiagram\\Transaction.java

package by.home.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Transaction 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;

   @Column(nullable = false)
   private Date date;
   @Column(nullable = false)
   private Integer sum;
   @Column(nullable = false)
   private Integer checkingAccount;
   
   /**
    * @roseuid 5669EDF00367
    */
   public Transaction() 
   {
    
   }
}
