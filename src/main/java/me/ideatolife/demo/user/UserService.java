package me.ideatolife.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
     private final UserRepository userRepository;

     @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> findAll() {
        return userRepository.findAll();
    }

    public AppUser getByid(Long id ){
        return userRepository.findById(id).get();

    }
   public AppUser save (AppUser user){
        return userRepository.save(user);
    }


    public void delete(Long id)
    {
        userRepository.deleteById(id);

    }


    /*public AppUser AddNewUser(AppUser user) {

    }

     */
}
