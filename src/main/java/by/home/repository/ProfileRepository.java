//Source file: D:\\9 ���\\����\\ClassDiagram\\ProfileRepository.java

package by.home.repository;

import by.home.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.ArrayList;

public interface ProfileRepository extends JpaRepository<Profile, Integer>, JpaSpecificationExecutor<Profile>
{

}
