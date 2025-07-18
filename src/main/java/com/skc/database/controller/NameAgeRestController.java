package com.skc.database.controller;

import com.skc.database.model.NameAge;
import com.skc.database.model.Orders;
import com.skc.database.repository.NameAgeRepository;
import com.skc.database.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameAgeRestController {
    @Autowired
    private NameAgeRepository nameAgeRepo;

    @Autowired
    private OrdersRepository ordersRepo;

    //Calling --> http://localhost:8080/users
    @GetMapping("/Names")
    public List<NameAge> getUsers(){
        System.out.println("Get Users Called....");
        return nameAgeRepo.findAll();
   }
    @GetMapping("/users/name/{name}")
    public List<NameAge> getUserByName(@PathVariable String name){
        System.out.println("Get Users by Name Called....");
        return nameAgeRepo.findByName(name);
    }

    // Calling --> http://localhost:8080/users/name/Karthik/age/44
    @GetMapping("/users/name/{name}/age/{age}")
    public List<NameAge> getUserByNameAge(@PathVariable String name, @PathVariable int age) {
        System.out.println("Get Users by Name Called....");
        return nameAgeRepo.findByNameAndAge(name,age);
    }

    @GetMapping("/Orders")
    public List<Orders> getOrdersAll(){
        System.out.println("Get Orders Called....");
        return ordersRepo.findAll();
    }

    // Ideally this should be in a separet Controller Class !!!
    @GetMapping("/Orders/OrderID/{OrderID}")
    public List<Orders> getOrdersByID(@PathVariable ("OrderID") int oid){
        System.out.println("Get Orders Called By ID....");
        return ordersRepo.findByOid(oid);
    }

    @GetMapping("/Orders/OrderID/{OrderID}/CustomerID/{CustID}")
    // Path variable names match with mapping and Method then explict name with PathVariable is not required ex CustID
    public List<Orders> getOrdersByIDandCID(@PathVariable ("OrderID") int oid , @PathVariable String CustID) {
        System.out.println("Get Orders Called By ID....");
        return ordersRepo.findByOidAndCid(oid,CustID);
    }
}
