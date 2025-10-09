package src.models;

public enum CarBrand {
    CITROEN,
    PORSCHE,
    BMW,
    MERCEDES,
    TOYOTA,;


    public String getBrandName() {

        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}