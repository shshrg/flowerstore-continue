package flower.store.controller;

import java.util.List;
import java.util.ArrayList;
import flower.store.AppUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flower.store.Flower;
import flower.store.service.FlowerService;

@RestController
public class AppUserController {
    List<AppUser> getUsers() {
        return new ArrayList<AppUser>();
    }
    void addAppUser(AppUser user){};
}