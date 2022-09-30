package Homework6;

public class Notebook {
    int id;
    int price;
    int RAM;
    int HDD;
    String brand;
    String OS;
    String color;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + HDD;
        result = prime * result + ((OS == null) ? 0 : OS.hashCode());
        result = prime * result + RAM;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + id;
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (HDD != other.HDD)
            return false;
        if (OS == null) {
            if (other.OS != null)
                return false;
        } else if (!OS.equals(other.OS))
            return false;
        if (RAM != other.RAM)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (id != other.id)
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Notebook [HDD=" + HDD + ", OS=" + OS + ", RAM=" + RAM + ", brand=" + brand + ", color=" + color
                + ", id=" + id + ", price=" + price + "]";
    }
}