//Source file: D:\\9 ���\\����\\ClassDiagram\\PaymentRepository.java

package by.home.repository;

import by.home.entity.News;
import by.home.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PaymentRepository extends JpaRepository<Transaction, Integer>
{

}
