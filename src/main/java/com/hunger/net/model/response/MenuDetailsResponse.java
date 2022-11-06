package com.hunger.net.model.response;

public class MenuDetailsResponse {

    private String menuId;
    private String menuName;
    private float menuPrice;
    private String menuCategory;

    public String getmenuId() {
        return menuId;
    }

    public void setmenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getmenuName() {
        return menuName;
    }

    public void setmenuName(String menuName) {
        this.menuName = menuName;
    }

    public float getmenuPrice() {
        return menuPrice;
    }

    public void setmenuPrice(float menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getmenuCategory() {
        return menuCategory;
    }

    public void setmenuCategory(String menuCategory) {
        this.menuCategory = menuCategory;
    }

}
