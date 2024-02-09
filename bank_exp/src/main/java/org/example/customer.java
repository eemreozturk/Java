package org.example;

public class customer {
    private int Id;



    public customer() {
    }

    /*public customer(String first_name, String last_name, int national_identtiy) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.national_identtiy = national_identtiy;
    }*/

    public int getId() {
        return Id;
    }
}

class company extends customer{
    private int tax_number;
    private String company_name;

    public company() {
    }

    public company(int tax_number, String company_name) {
        this.tax_number = tax_number;
        this.company_name = company_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getTax_number() {
        return tax_number;
    }

    public void setTax_number(int tax_number) {
        this.tax_number = tax_number;
    }
}
class person extends customer{
    private String first_name;
    private String last_name;

    public person(String first_name, String last_name, int national_identtiy) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.national_identtiy = national_identtiy;
    }

    public person() {
    }

    public String getFirst_name() {
        return first_name;
    }


    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getLast_name() {
        return last_name;
    }


    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getNational_identtiy() {
        return national_identtiy;
    }

    public void setNational_identtiy(int national_identtiy) {
        this.national_identtiy = national_identtiy;
    }

    private int national_identtiy;

}

