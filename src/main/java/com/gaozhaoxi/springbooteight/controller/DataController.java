package com.gaozhaoxi.springbooteight.controller;

import com.gaozhaoxi.springbooteight.dao.PersonRespository;
import com.gaozhaoxi.springbooteight.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Leon
 */
//@RestController
public class DataController {
//    @Autowired
//    PersonRespository personRespository;
    //因为使用了RestController注解，所以方法（函数）返回值都是变成json，注入到responsebody中从而返回到客户端中进行解析，得到对象。
/*
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
*/
/*
    @RequestMapping(value = "/save",method = RequestMethod.POST,consumes = "application/json;charset=UTF-8")
    public Person save(@RequestBody Person p){
        String name=p.getName();
        Integer age=p.getAge();
        String address=p.getAddress();
        System.out.print(name+age.toString()+address);

        Person person=personRespository.save(new Person(null,name,age,address));
        return person;
    }*/


/*
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Person save(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("age") Integer age){
        System.out.print(name+age.toString()+address);
        Person person=personRespository.save(new Person(null,name,age,address));
        return person;
    }

    @RequestMapping("/q1")
    public List<Person> q1(String address){
        List<Person> people=personRespository.findByAddress(address);
        return people;
    }

    @RequestMapping("/q2")
    public Person q2(String name,String address){
        Person p eople=personRespository.findByNameAndAddress(name,address);
        return people;
    }

    @RequestMapping("/q3")
    public Person q3(String name,String address){
        Person person=personRespository.withNameAndAddressQuery(name,address);
        return person;
    }

    @RequestMapping("/q4")
    public Person q4(String name,String address){
        Person person=personRespository.withNameAndAddressNamedQuery(name,address);
        return person;
    }

    @RequestMapping("/sort")
    public List<Person> sort(){
        List<Person> people=personRespository.findAll();
        return people;
    }

    @RequestMapping("/page")
    public Page<Person> page(int page, int size){
        //在spring-data-common2.0.6中，PageRequest的构造方法处于deprecated状态，根据提示使用该类的静态方法of创建实例
        //Page<Person> all=personRespository.findAll(new PageRequest(page,size));
        Page<Person> all=personRespository.findAll(PageRequest.of(page,size));
        return all;
    }

    @RequestMapping("/all")
    public List<Person> all(){
        return personRespository.findAll();
    }
    */
}
