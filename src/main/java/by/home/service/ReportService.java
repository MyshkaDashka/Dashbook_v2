//Source file: D:\\9 ���\\����\\ClassDiagram\\ReportService.java

package by.home.service;

import by.home.entity.Report;
import by.home.repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReportService implements IReportService
{
   private ReportRepository reportRepository;
   public IReportService theIReportService;
   public Report theReport;
   public ReportRepository theReportRepository;
   
   /**
    * @roseuid 5669EDED012B
    */
   public ReportService() 
   {
    
   }
   
   /**
    * @return java.util.ArrayList
    * @roseuid 565C6C1100A5
    */
   public ArrayList getReportList() 
   {
    return null;
   }
   
   /**
    * @return ClassDiagram.Report
    * @roseuid 565C6C1100B7
    */
   public Report update() 
   {
    return null;
   }
   
   /**
    * @return ClassDiagram.Report
    * @roseuid 565C6C1100C8
    */
   public Report save() 
   {
    return null;
   }
}
