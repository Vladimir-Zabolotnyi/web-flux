package zabolotnyi.volodymyr.webflux

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class GreetingClient(
    private val client: WebClient,
) {

    fun getMessage(): Mono<String> =
        client.get()
            .uri("/hello")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Greeting::class.java)
            .map(Greeting::message)
}
