//Source file: D:\\9 ���\\����\\ClassDiagram\\Message.java

package by.home.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Darya Kosik
 */
@Entity

public class Message 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column
   private Integer id;
   @Column(nullable = false)
   private Integer idTo;
   @Column(nullable = false)
   private Integer idFrom;
   @Column(nullable = false)
   private Date date;
   @Column(nullable = false)
   private String text;
   @Column(nullable = false)
   private String title;
   @Column(nullable = false)
   private Boolean status;
   
   /**
    * @roseuid 5669EDEA00F6
    */
   public Message() 
   {
    
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getIdTo() {
      return idTo;
   }

   public void setIdTo(Integer idTo) {
      this.idTo = idTo;
   }

   public Integer getIdFrom() {
      return idFrom;
   }

   public void setIdFrom(Integer idFrom) {
      this.idFrom = idFrom;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public String getText() {
      return text;
   }

   public void setText(String text) {
      this.text = text;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Boolean getStatus() {
      return status;
   }

   public void setStatus(Boolean status) {
      this.status = status;
   }
}
