package me.iiaii.springmvcintro.project.domain.item;

import lombok.Data;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item(String itemA, int i, int i1) {
    }

    public Item(Long id, String itemName, Integer price, Integer quantity) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
