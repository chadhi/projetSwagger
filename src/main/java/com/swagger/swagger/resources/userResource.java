package com.swagger.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "User Resource REST Endpoint", description = "Shows the user info")
public class userResource {

    @GetMapping
    public List<User> getUsers(){
        return Arrays.asList(
                new User("Alli",1000L),new User("chadhi",2000L)
        );
    }
    @GetMapping("/{userName}")
    public User getUsers(@PathVariable(name = "userName") final  String userName ){
        return new User(userName, 1000L);
    }
    private  class User{
        @ApiModelProperty(notes = "name of the User")
      private String aserName;
        @ApiModelProperty(notes = "salary of the user")
      private Long salary;

        public User() {
        }

        public User(String aserName, Long salary) {
            this.aserName = aserName;
            this.salary = salary;
        }

        public String getAserName() {
            return aserName;
        }

        public void setAserName(String aserName) {
            this.aserName = aserName;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }
    }
}
