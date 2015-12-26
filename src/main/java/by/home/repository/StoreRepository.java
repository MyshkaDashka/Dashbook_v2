//Source file: D:\\9 ���\\����\\ClassDiagram\\StoreRepository.java

package by.home.repository;

import by.home.entity.Gift;
import by.home.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Integer>
{
    public List<Store> findByIdGift(Integer idGift);
}
