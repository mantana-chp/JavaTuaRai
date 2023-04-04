package org.example;

//การใส่ final = ไม่ต้องการให้คลาสอื่นมาสืบทอดต่อ
public final class ExchangeStudent extends Student{
    private String partnerUniversity;

    public String getPartnerUniversity() {
        return partnerUniversity;
    }

    public void setPartnerUniversity(String partnerUniversity) {
        this.partnerUniversity = partnerUniversity;
    }
}
