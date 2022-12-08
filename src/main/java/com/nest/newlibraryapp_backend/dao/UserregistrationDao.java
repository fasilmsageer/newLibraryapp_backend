package com.nest.newlibraryapp_backend.dao;

import com.nest.newlibraryapp_backend.model.Userregistration;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserregistrationDao extends CrudRepository<Userregistration, Integer> {

    @Query(value = "SELECT `id`, `aadharnumber`, `address`, `confirmpassword`, `dob`, `email`, `name`, `password`, `phonenumber`, `pincode`, `username` FROM `userregistration` WHERE `username` LIKE %:username%",nativeQuery = true)
    List<Userregistration> SearchUser(@Param("username") String username);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `userregistration` WHERE `id` =:id",nativeQuery = true)
    void DeleteUser(@Param("id")Integer id);
}
