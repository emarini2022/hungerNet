package com.hunger.net.entity;


import com.hunger.net.enums.OrderStatusEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false, unique = true)
    private Integer id;

    @Column
    private String name;

    @Column
    private String address;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "order status", nullable = false)
    private OrderStatusEnum orderStatus;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "restaurant_menu",
            joinColumns = @JoinColumn(name = "restaurant_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "id")
    )
    private Set<Restaurant> menu_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

}
