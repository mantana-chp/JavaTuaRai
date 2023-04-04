package MapCountry;

public class Country {
    private String nameTh, nameEn;

    public Country(String nameTh, String nameEn) {
        this.nameTh = nameTh;
        this.nameEn = nameEn;
    }

    public String getNameTh() {
        return nameTh;
    }

    public void setNameTh(String nameTh) {
        this.nameTh = nameTh;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}
