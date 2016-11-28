package main;
import hello.Application;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by nichprud1 on 11/28/2016.
 */
public class testApplication {

    @Test
    public void testMain(){
    Application application = new Application();

    assertEquals(application.home().toString(), "Hello, World!");
    }

}
