package com.example.NstCartExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NstCartExample.Entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
