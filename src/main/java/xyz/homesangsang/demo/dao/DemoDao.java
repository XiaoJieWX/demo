package xyz.homesangsang.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.homesangsang.demo.entity.Demo;

import java.util.List;
import java.util.Optional;

@Repository
public interface DemoDao extends CrudRepository<Demo, Integer> {
    List<Demo> findAll();

    Demo save(Demo demo);

    Optional<Demo> findById(Integer id);

}
