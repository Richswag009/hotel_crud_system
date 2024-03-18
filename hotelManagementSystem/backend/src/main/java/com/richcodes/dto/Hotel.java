package com.richcodes.dto;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Hotel {
    @Id
    @SequenceGenerator(
            name="hotel_id_sequence",
            sequenceName = "hotel_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hotel_id_sequence"
    )
    private Integer id;
 
    private Integer roomNumber;
    @Column(
            nullable = false
    )
    private String roomType;
    @Column(
            nullable = false
    )
    private double price;


    public Hotel() {
    }

    public Hotel( double price,Integer roomNumber, String roomType) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Double.compare(price, hotel.price) == 0 && Objects.equals(id, hotel.id) && Objects.equals(roomNumber, hotel.roomNumber) && Objects.equals(roomType, hotel.roomType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomNumber, roomType, price);
    }
}
