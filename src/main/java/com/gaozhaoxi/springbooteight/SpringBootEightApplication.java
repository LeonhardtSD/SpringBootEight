package com.gaozhaoxi.springbooteight;

import com.gaozhaoxi.springbooteight.dao.PersonRespository;
import com.gaozhaoxi.springbooteight.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class SpringBootEightApplication {
	@Autowired
	PersonRespository personRespository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEightApplication.class, args);
	}


	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public Person save(@RequestBody Person p){
		String name=p.getName();
		Integer age=p.getAge();
		String address=p.getAddress();
		System.out.print(name+age.toString()+address);

		Person person=personRespository.save(new Person(null,name,age,address));
		return person;
	}
}
