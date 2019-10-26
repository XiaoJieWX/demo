package xyz.homesangsang.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.homesangsang.demo.entity.Demo;
import xyz.homesangsang.demo.entity.DemoVO;
import xyz.homesangsang.demo.service.DemoService;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping
    private List<Demo> getAll() {
        return demoService.getAll();
    }

    @GetMapping("/{id}")
    private Demo getById(@PathVariable("id") Integer id) {
        return demoService.getById(id);
    }

    @GetMapping("/id")
    private Demo getById1(@RequestParam("id") Integer id) {
        return demoService.getById(id);
    }

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody DemoVO vo) {
        demoService.add(vo);
        return new ResponseEntity<Object>("success", HttpStatus.OK);
    }

    @PostMapping("/form")
    public ResponseEntity<Object> addByForm(DemoVO vo) {
        demoService.add(vo);
        return new ResponseEntity<Object>("success", HttpStatus.OK);
    }
}
