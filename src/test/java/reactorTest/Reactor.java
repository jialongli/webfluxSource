package reactorTest;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Reactor {

    @Test
    public void test(){
        Mono.just("1").map(a -> a + "1").subscribe(System.out::println);
        Mono.just("1").flatMap(a -> Mono.just(a + "1")).subscribe(System.out::println);
        Flux.just("1").map(a -> a + "1").subscribe(System.out::println);
        Flux.just("1").flatMap(a -> Flux.just(a + "1")).subscribe(System.out::println);
    }
}
