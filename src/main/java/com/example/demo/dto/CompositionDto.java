package com.example.demo.dto;

public class CompositionDto {
    private Integer id;
    private Integer furnitureSetId;
    private Integer furnitureId;
    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public Integer getFurnitureSetId() {
        return furnitureSetId;
    }

    public Integer getFurnitureId() {
        return furnitureId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFurnitureSetId(Integer furnitureSetId) {
        this.furnitureSetId = furnitureSetId;
    }

    public void setFurnitureId(Integer furnitureId) {
        this.furnitureId = furnitureId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CompositionDto{" +
                "id=" + id +
                ", furnitureSetId=" + furnitureSetId +
                ", furnitureId=" + furnitureId +
                ", quantity=" + quantity +
                '}';
    }
}
