package com.example.NstCartExample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.NstCartExample.Entity.Cart;
import com.example.NstCartExample.Entity.Item;
import com.example.NstCartExample.Repository.CartRepository;
import com.example.NstCartExample.Repository.ItemRepository;

@RestController
@RequestMapping("/api/v1/")
public class ShoppingController {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/carts")
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping("/cart")
    public Cart addCart(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }

    @PostMapping("/item")
    public Item addItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @PutMapping("/add-item-to-cart")
    public String addItemToCart(@RequestParam Integer cartId, @RequestParam Integer itemId) {
        Optional<Cart> optionalCart = cartRepository.findById(cartId);
        Optional<Item> optionalItem = itemRepository.findById(itemId);
        if (optionalCart.isPresent() && optionalItem.isPresent()) {
            Item item = optionalItem.get();
            Cart cart = optionalCart.get();
            item.setCart(cart);
            itemRepository.save(item);
        }
        return "Cart updated successfully";
    }

}
