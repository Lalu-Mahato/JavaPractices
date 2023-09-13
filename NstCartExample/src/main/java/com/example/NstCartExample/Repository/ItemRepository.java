package com.example.NstCartExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NstCartExample.Entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
