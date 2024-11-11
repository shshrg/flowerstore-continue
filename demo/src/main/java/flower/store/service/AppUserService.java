package flower.store.service;

import flower.store.AppUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    List<AppUser> getAppUsers() {
        return new ArrayList<AppUser>();
    }
    void addAppUser(AppUser user) {};
}
