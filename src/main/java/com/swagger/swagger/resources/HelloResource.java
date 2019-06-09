package com.swagger.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/user")
@Api(value = "HelloWorld Resource", description = "shows hello world")
public class HelloResource {

    @ApiOperation(value = "Returns Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Hello World"),
                    /*@ApiResponse(code = 404, message = "wata noood"),
                    @ApiResponse(code = 403, message = "Aji lehna"),
                    @ApiResponse(code = 401, message = "Sir lhih")*/
            }
    )
    @GetMapping
    public String hello() {
        return "hello word";
    }

    @PostMapping("/post")
    @ApiOperation(value = "Returns Hello World")
    public String postHello(@RequestBody final String hello) {
        return hello;
    }

    @PutMapping("/put")
    @ApiOperation(value = "Returns Hello World")
    public String putHello(@RequestBody final String hello) {
        return hello;
    }
}
