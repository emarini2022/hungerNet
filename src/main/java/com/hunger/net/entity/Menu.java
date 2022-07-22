package com.hunger.net.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column
    private String title;

    @Column
    private String content;

    @ManyToMany(mappedBy = menu_id)
    private Set<Menu> menus ;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
