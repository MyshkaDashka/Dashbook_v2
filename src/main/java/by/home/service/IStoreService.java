//Source file: D:\\9 ���\\����\\ClassDiagram\\IStoreService.java

package by.home.service;

import by.home.entity.Store;
import by.home.entity.Transaction;

import java.util.ArrayList;

public interface IStoreService 
{
   
   /**
    * @return ClassDiagram.Store
    * @roseuid 565C6CD202EB
    */
   public Store save();
   
   /**
    * @return ClassDiagram.Store
    * @roseuid 565C6CD20300
    */
   public Store update();
   
   /**
    * @return java.util.ArrayList
    * @roseuid 565C6CD20313
    */
   public ArrayList getListAllStore();

   public Store getOneStore(Integer idGift);

   public Transaction addTransaction(Integer sum);

   public void addImplementsOrder(Integer idProfile, Integer idStore, Integer idTransaction, Integer summa);
}
