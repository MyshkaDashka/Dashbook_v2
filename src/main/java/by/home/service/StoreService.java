//Source file: D:\\9 ���\\����\\ClassDiagram\\StoreService.java

package by.home.service;

import by.home.entity.ImplementOrder;
import by.home.entity.Store;
import by.home.entity.Transaction;
import by.home.repository.ImplementOrderRepository;
import by.home.repository.PaymentRepository;
import by.home.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Darya Kosik
 */
@Service
public class StoreService implements  IStoreService
{
   private StoreRepository storeRepository;
   private ImplementOrderRepository implementOrderRepository;
   public IStoreService theIStoreService;
   public Store theStore;
   public ImplementOrder theImplementOrder;
   public Transaction theTransaction;
   public PaymentRepository thePaymentRepository;
   public StoreRepository theStoreRepository;
   public ImplementOrderRepository theImplementOrderRepository;
   
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
}
