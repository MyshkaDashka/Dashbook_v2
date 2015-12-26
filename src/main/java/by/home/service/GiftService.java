//Source file: D:\\9 ���\\����\\ClassDiagram\\GiftService.java

package by.home.service;


import by.home.entity.Gift;
import by.home.entity.Profile;
import by.home.entity.Profile_Friend;
import by.home.entity.Provider;
import by.home.repository.GiftRepository;
import by.home.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class GiftService implements IGiftService
{

   @Autowired
   private GiftRepository giftRepository;
   @Autowired
   private ProviderRepository providerRepository;

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
   public Set<Gift> getGift()
   {
      List<Gift> gifts = giftRepository.findAll();
      Set<Gift> giftSet = new HashSet<Gift>();
      for (Gift cf : gifts) {
         giftSet.add(cf);
      }
    return giftSet;
   }

   public Gift getOneGift(Integer id){
      Gift gift = new Gift();
      gift = giftRepository.findOne(id);
      return  gift;
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
