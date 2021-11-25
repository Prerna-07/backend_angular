package com.consultadd.controller;
import java.util.List;
import com.consultadd.model.Bday;
import com.consultadd.service.BdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("http://localhost:4200")
@RestController
public class BdayController {

    @Autowired
    BdayService bdayService;

    @GetMapping("/get")
    public List<Bday> getBday()
    {
       return bdayService.getBday();

    }
    @PostMapping("/post")
    public String saveBday(@RequestBody Bday bday)
    {
        return bdayService.saveBday(bday);
    }
    @PutMapping("/put")
    public String updateBday(@RequestBody Bday bday)
    {
        return bdayService.updateBday(bday);
    }
    @DeleteMapping("/delete")
    public String deleteBday(@RequestBody Bday bday)
    {
        return bdayService.deleteBday(bday);
    }

}
