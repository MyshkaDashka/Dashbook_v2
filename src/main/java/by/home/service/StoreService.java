//Source file: D:\\9 ���\\����\\ClassDiagram\\StoreService.java

package by.home.service;

import by.home.entity.ImplementOrder;
import by.home.entity.Store;
import by.home.entity.Transaction;
import by.home.repository.ImplementOrderRepository;
import by.home.repository.PaymentRepository;
import by.home.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Darya Kosik
 */
@Service
public class StoreService implements  IStoreService
{
   @Autowired
   private StoreRepository storeRepository;
   @Autowired
   private ImplementOrderRepository implementOrderRepository;
   @Autowired
   private PaymentRepository paymentRepository;

   
   /**
    * @roseuid 5669EDF100EC
    */
   public StoreService() 
   {
    
   }
   
   /**
    * @return ClassDiagram.Store
    * @roseuid 565C6C700377
    */
   public Store save() 
   {
    return null;
   }
   
   /**
    * @return ClassDiagram.Store
    * @roseuid 565C6C76008C
    */
   public Store update() 
   {
    return null;
   }
   
   /**
    * @return java.util.ArrayList
    * @roseuid 565C6C8C012F
    */
   public ArrayList getListAllStore() 
   {
    return null;
   }

   public Store getOneStore(Integer idGift){
      List<Store> storeList = storeRepository.findByIdGift(idGift);
      Store store = storeList.get(0);
      return store;
   }

   public Transaction addTransaction(Integer sum){
      long curTime = System.currentTimeMillis();
      Date curDate = new Date(curTime);
      Transaction transaction = new Transaction();
      transaction.setDate(curDate);
      transaction.setSum(sum);
      transaction.setCheckingAccount(123456789);
      return paymentRepository.save(transaction);
   }

   public void addImplementsOrder(Integer idProfile, Integer idStore, Integer idTransaction, Integer summa){
      ImplementOrder implementOrder = new ImplementOrder();
      long curTime = System.currentTimeMillis();
      Date curDate = new Date(curTime);
      implementOrder.setDate(curDate);
      implementOrder.setId_profile(idProfile);
      implementOrder.setId_store(idStore);
      implementOrder.setId_transaction(idTransaction);
      implementOrder.setSumma(summa);
      implementOrderRepository.save(implementOrder);
   }
}
