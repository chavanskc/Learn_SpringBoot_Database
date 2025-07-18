package com.skc.database.repository;

import com.skc.database.model.NameAge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NameAgeRepository extends JpaRepository<NameAge,String> {
    List<NameAge> findByName(String Name);
    /*@Query("SELECT n FROM NameAge n WHERE n.name = :name AND n.age = :age")
    List<NameAge> findByNameAndAge(@Param("name") String name, @Param("age") int age);*/

    List<NameAge> findByNameAndAge(String Name,  int Age);


    /*List<NameAge> findByAge(int Age);
    List<NameAge> findByNameAge(String Name, int Age);*/
}
