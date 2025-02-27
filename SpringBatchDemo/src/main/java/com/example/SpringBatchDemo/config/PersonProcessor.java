package com.example.SpringBatchDemo.config;

import com.example.SpringBatchDemo.model.Person;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.orm.ObjectOptimisticLockingFailureException;


// We Use Item processor because if my data has been read but i  need to chanhge the format of the data so then we use it
public class PersonProcessor implements ItemProcessor<Person,Person> {
    @Override
    public Person process(Person item) throws Exception {
        return item;
    }
//    @Override
//    public Person process(Person item) throws Exception {
//
//        try {
//            item.setFirstName(item.getFirstName().toUpperCase());
//            item.setLastName(item.getLastName().toUpperCase());
//            return item;
//    } catch (ObjectOptimisticLockingFailureException e) {
//            System.out.println("Optimistic Locking Failure for person with ID: " + item.getId() + " - Skipping update.");
//        return null;  // Skip the problematic person
//    }
//    }
}
