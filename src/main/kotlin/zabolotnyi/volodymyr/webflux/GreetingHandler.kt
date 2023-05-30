package zabolotnyi.volodymyr.webflux

import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Service
class GreetingHandler {

    fun hello(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(BodyInserters.fromValue(Greeting("Hello, Spring!")))
}
