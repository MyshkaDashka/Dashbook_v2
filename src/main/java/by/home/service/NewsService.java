//Source file: D:\\9 ���\\����\\ClassDiagram\\NewsService.java

package by.home.service;

import by.home.entity.News;
import by.home.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Darya Kosik
 */
@Service
public class NewsService implements INewsService
{
   private NewsRepository newsRepository;
   public INewsService theINewsService;
   public News theNews;
   public NewsRepository theNewsRepository;
   
   /**
    * @roseuid 5669EDF0018C
    */
   public NewsService() 
   {
    
   }
   
   /**
    * @return ClassDiagram.News
    * @roseuid 565C65C50350
    */
   public News getNews() 
   {
    return null;
   }
   
   /**
    * @return java.util.ArrayList
    * @roseuid 565C65CD00A8
    */
   public ArrayList getListNews() 
   {
    return null;
   }
   
   /**
    * @return ClassDiagram.News
    * @roseuid 565C65D60313
    */
   public News update() 
   {
    return null;
   }
   
   /**
    * @return ClassDiagram.News
    * @roseuid 565C65DF01F8
    */
   public News save() 
   {
    return null;
   }
}
