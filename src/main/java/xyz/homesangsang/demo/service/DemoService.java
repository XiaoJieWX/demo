package xyz.homesangsang.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.homesangsang.demo.dao.DemoDao;
import xyz.homesangsang.demo.entity.Demo;
import xyz.homesangsang.demo.entity.DemoVO;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoDao demoDao;

    public List<Demo> getAll() {
        return demoDao.findAll();
    }

    public Demo getById(Integer id) {
        return demoDao.findById(id).get();
    }

    public void add(DemoVO vo) {
        Demo demo = new Demo();
        demo.setName(vo.getName());
        demoDao.save(demo);
    }
}
