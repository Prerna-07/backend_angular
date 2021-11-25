package com.consultadd.service;

import com.consultadd.model.Bday;
import com.consultadd.repository.BdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BdayService {

    @Autowired
    BdayRepository bdayRepository;

    public List<Bday> getBday()
    {
        return bdayRepository.findAll();
    }



    public String saveBday(Bday bday)
    {
        if(bdayRepository.existsById(bday.getId()))
        {
            return "Couldn't save data Id Already Exist";
        }
        else {
            bdayRepository.save(bday);
            return "Bday data saved successfully";
        }

    }
    public String updateBday(Bday bday)
    {
        if(bdayRepository.existsById(bday.getId()))
        {
//           BdayRepository.delete(bday);
            bdayRepository.save(bday);
            return "Id updated";
        }
        else {

            return "Employee data does not exits";
        }

    }
    public String deleteBday(Bday bday)
    {
        if(bdayRepository.existsById(bday.getId()))
        {
            bdayRepository.delete(bday);

            return "Id deleted";
        }
        else {

            return "Bday data does not exits";
        }

    }



}
