//Source file: D:\\9 ���\\����\\ClassDiagram\\INewsService.java

package by.home.service;

import by.home.entity.News;

import java.util.ArrayList;

/**
 * @author Darya Kosik
 */
public interface INewsService 
{
   
   /**
    * @return java.util.ArrayList
    * @roseuid 565C6619026F
    */
   public ArrayList getListNews();
   
   /**
    * @return ClassDiagram.News
    * @roseuid 565C66190281
    */
   public News getNews();
   
   /**
    * @return ClassDiagram.News
    * @roseuid 565C66190290
    */
   public News save();
   
   /**
    * @return ClassDiagram.News
    * @roseuid 565C6619029C
    */
   public News update();
}
