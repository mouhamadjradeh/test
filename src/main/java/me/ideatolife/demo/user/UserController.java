package me.ideatolife.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("My/first/API")
public class UserController {
    private final UserService userService;

   @Autowired
   public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = {"/",""})
    public List<AppUser> getALLusers(){
        return userService.findAll();}

    @GetMapping("/{id}")
    public AppUser getUserbyid(@PathVariable Long id){
        return userService.getByid(id);}


    @PostMapping
    public  AppUser CreateNewUser(@RequestBody AppUser user){

        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable Long id){
        userService.delete(id);}

}
