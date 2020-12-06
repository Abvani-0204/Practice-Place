package com.ab.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.ab.repo.model.User;

@Repository
public class RegistrationRepository {

  @Autowired
  public HibernateTemplate hibernateTemplate;
  
  public void registerUser(User user) {
    System.out.println("I AM INSIDE OF REPOSITORY CLASS");
    hibernateTemplate.save(user);
  }
}
