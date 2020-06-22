package io.micronaut.issue;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller
public class MultiController {

    @Get("/")
    @Post("/")
    public HttpResponse<String> multiple() {
        return HttpResponse.ok("Hello World");
    }

}
