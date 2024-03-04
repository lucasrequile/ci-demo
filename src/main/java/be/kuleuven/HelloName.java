package be.kuleuven;

public class HelloName{
    private String naam;

    public static void main(String[] args) {
        HelloName hn = new HelloName("Lucas");
        System.out.println("Hello, "+ hn.getNaam());
    }

    public HelloName(String naam){
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }
}