import be.kuleuven.HelloName;
import org.junit.jupiter.api.Test;

public class HelloNameTests {
    @Test
    public void gegevenHelloNameLucas_whenGetNaam_thenLucas(){
        HelloName test = new HelloName("Lucas");
        String result = test.getNaam();
        assert(result.equals("Lucas"));
    }
}
