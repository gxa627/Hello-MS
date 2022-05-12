package com.springdemo.helloms;

import com.springdemo.helloms.entity.WorkOrderHdr;
import com.springdemo.helloms.repository.WorkOrderHdrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloMSController {
    @Autowired
    WorkOrderHdrRepository whRepository;

    @RequestMapping
    public String helloMicroService() {
        return "Hello Microservice from Spring Boot";
    }

    @RequestMapping("/getWorkOrders")
    public ResponseEntity<List<WorkOrderHdr>> getWorkOrders(@RequestParam(required = false) String storNum) {

        try {
            List<WorkOrderHdr> workOrderHdrList = new ArrayList<WorkOrderHdr>();
            System.out.println("Called Get WOrkOrders");
            whRepository.findAll().forEach(workOrderHdrList::add);
            if (workOrderHdrList.isEmpty()) {
                System.out.println("Empty WOrkOrders");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            System.out.println("Non-Empty WOrkOrders");
            return new ResponseEntity<>(workOrderHdrList, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Exception  Get WOrkOrders" + e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
//        return "Listing Work Orders for PCG Workbench";
    }
}
