//Source file: D:\\9 ���\\����\\ClassDiagram\\IReportService.java

package by.home.service;

import by.home.entity.Report;

import java.util.ArrayList;

public interface IReportService 
{
   
   /**
    * @return java.util.ArrayList
    * @roseuid 565C6BB000A4
    */
   public ArrayList getReportList();
   
   /**
    * @return ClassDiagram.Report
    * @roseuid 565C6BCF0358
    */
   public Report update();
   
   /**
    * @return ClassDiagram.Report
    * @roseuid 565C6BD601B4
    */
   public Report save();
}
