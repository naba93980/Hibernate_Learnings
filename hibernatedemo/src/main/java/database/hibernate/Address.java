package database.hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String rasta;
    private String para;

    public String getRasta() {
        return rasta;
    }
    public void setRasta(String rasta) {
        this.rasta = rasta;
    }
    public String getPara() {
        return para;
    }
    public void setPara(String para) {
        this.para = para;
    }
}
