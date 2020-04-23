/**
 * 
 */
package com.devglan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devglan.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
