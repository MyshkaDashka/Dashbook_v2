//Source file: D:\\9 ���\\����\\ClassDiagram\\GiftService.java

package by.home.service;


import by.home.entity.Gift;
import by.home.entity.Provider;
import by.home.repository.GiftRepository;
import by.home.repository.ProviderRepository;
import org.springframework.stereotype.Service;

@Service
public class GiftService implements IGiftService
{
   private GiftRepository giftRepository;
   private ProviderRepository providerRepository;
   public IGiftService theIGiftService;
   public Gift theGift;
   public Provider theProvider;
   public ProviderRepository theProviderRepository;
   public GiftRepository theGiftRepository;
   
   /**
    * @roseuid 5669EDEE02D5
    */
   public GiftService() 
   {
    
   }
   
   /**
    * @return ClassDiagram.Gift
    * @roseuid 565C648A02D2
    */
   public Gift save() 
   {
    return null;
   }
   
   /**
    * @return ClassDiagram.Gift
    * @roseuid 565C648A02E3
    */
   public Gift getGift() 
   {
    return null;
   }
   
   /**
    * @return ClassDiagram.Gift
    * @roseuid 565C648A02F4
    */
   public Gift update() 
   {
    return null;
   }
}
