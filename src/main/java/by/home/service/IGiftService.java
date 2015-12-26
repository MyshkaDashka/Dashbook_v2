//Source file: D:\\9 ���\\����\\ClassDiagram\\IGiftService.java

package by.home.service;


import by.home.entity.Gift;
import by.home.entity.Profile;

import java.util.Set;

public interface IGiftService
{
   
   /**
    * @return ClassDiagram.Gift
    * @roseuid 565C644E004C
    */
   public Gift save();
   
   /**
    * @return ClassDiagram.Gift
    * @roseuid 565C645A027F
    */
   public Set<Gift> getGift();

   /**
    * @return ClassDiagram.Gift
    * @roseuid 565C646403D8
    */
   public Gift update();

   public Gift getOneGift(Integer id);
}
