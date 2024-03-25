package domain;

public class Image {
    private String address;

    public Image() {
    }
    public Image(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Image{" +
                "address='" + address + '\'' +
                '}';
    }
}
