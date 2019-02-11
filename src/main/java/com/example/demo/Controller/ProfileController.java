package com.example.demo.Controller;

import com.example.demo.Model.UserProfile;
import com.example.demo.Repository.ProfileRepository;
import com.example.demo.Response.ApiResponse;
import com.example.demo.Response.PostResponse;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
//@RequestMapping("/userProfile")
public class ProfileController {
    @Autowired
    private ProfileRepository repository;
    private String VIN;
    private String color;
    private Integer miles;


    @RequestMapping(value = "/")
    public ResponseEntity<UserProfile> get() {

        UserProfile car = new UserProfile();
        car.setColor("Blue");
        car.setMiles(100);
        car.setVIN("1234");

        return new ResponseEntity<UserProfile>(car, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<UserProfile> update(@RequestBody UserProfile car) {

        if (car != null) {
            car.setMiles(car.getMiles() + 100);
        }

        // TODO: call persistence layer to update
        return new ResponseEntity<UserProfile>(car, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<PostResponse> createPet(@Valid @RequestBody UserProfile userProfile) {

//        ProfileRepository.findBypId(pId);
        repository.save(userProfile);
        return new ResponseEntity<>(new PostResponse("Profile added"), HttpStatus.OK);
    }

    @GetMapping("/")
    public  ResponseEntity<ApiResponse <List<UserProfile>>> getAllProfile() {
       List<UserProfile> userProfile=this.repository.findAll();
        return new ResponseEntity<>(new ApiResponse(userProfile), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse <UserProfile>> getProfileById(@PathVariable String id){
        UserProfile userProfile= this.repository.findBypId(id);
        return new ResponseEntity<>(new ApiResponse(userProfile), HttpStatus.OK);

    }


//    @RequestMapping(value = "/{pId}", method = RequestMethod.GET)
//    public UserProfile getProfileById(@PathVariable("id") String pId) {
//        return repository.findBypId(pId);
//    }

//    @RequestMapping(value = "/{pId}", method = RequestMethod.PUT)
//    public void modifyProfileById(@PathVariable("id") String pId, @Valid @RequestBody UserProfile userProfile) {
//        userProfile.setpId(pId);
//        repository.save(userProfile);
//    }


//    @RequestMapping(value = "/{pId}", method = RequestMethod.DELETE)
//    public void deleteProfile(@PathVariable String pId) {
//        repository.delete(repository.findBypId(pId));
//    }
}



