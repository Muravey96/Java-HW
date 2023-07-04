package LaptopLib;

import java.util.Objects;

public class Laptops {
// Задаем поля классов
    private String model; // модель
    private double size; // Размер экрана
    private int ram; // Оперативная память
    private String os; // Операционная система
    private int ssd; // Накопитель

    public Laptops(String model, double size, String os, int ram, int ssd) {
        this.model = model;
        this.size = size;
        this.os = os;
        this.ram = ram;
        this.ssd = ssd;
    }

// Задаем методы классов


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean workingLaptop(){
        return true;
    }

    public boolean solded(){
        return true;
    }

    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptops laptops = (Laptops) o;
        return model == laptops.model && size == laptops.size && os == laptops.os && ram == laptops.ram && ssd == laptops.ssd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, size, os, ram, ssd);
    }

    @Override
    public String toString() {
        return "Notebook : " + "model = '" +model+ ", size = " +size+ ", os ='" + os + ", ram = " + ram + "Gb" + ", ssd = " + ssd + "Gb";

    }
}