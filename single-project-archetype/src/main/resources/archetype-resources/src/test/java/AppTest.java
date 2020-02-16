#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit ${artifactId} for simple App.
 */
public class AppTest {

    @Test
    void ${artifactId}App() {
        App.main(null);
        assertTrue(true);
    }
}
