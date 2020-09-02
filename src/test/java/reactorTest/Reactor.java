package reactorTest;

import org.junit.Test;
import reactor.core.publisher.Mono;

public class Reactor {

    @Test
    public void test(){
        Mono.just("1").map(a -> a + "1").subscribe(System.out::println);
    }
}
