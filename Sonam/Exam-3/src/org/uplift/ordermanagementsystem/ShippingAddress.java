package org.uplift.ordermanagementsystem;

public class ShippingAddress {
    private String address;
    private String area;
    private String city;
    private long postCode;
    private String zone;

    public ShippingAddress(String address, String area, String city, long postCode, String zone) {
        this.address = address;
        this.area = area;
        this.city = city;
        this.postCode = postCode;
        this.zone = zone;
    }

    public String getAddress() {
        return address;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public long getPostCode() {
        return postCode;
    }

    public String getZone() {
        return zone;
    }

    @Override
    public String toString() {
        return "ShippingAddress{" +"\n"+
                "address= " + address + "\n" +
                "area= " + area + "\n"+
                "city= " + city +"\n" +
                "postCode= " + postCode +"\n"+
                "zone= " + zone + "\n" +
                '}';
    }
}
