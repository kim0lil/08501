import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import dummy.HelloMaven;

public class HelloMavenTest {

    @Test
    public void logTest() throws Exception{
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        HelloMaven.main(null);
        
        String output = out.toString();

        assertThat(output, is("name : justin-hanry, version : 1.0.0, skill-lv : 3.1"));
    }
}