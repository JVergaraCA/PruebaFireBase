package cl.wower.fireapp;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by JuanCarlos on 28-09-17.
 */

public class CurrentUser {
    //consultando en la base de datos si el usuario esta
    private FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();


    public FirebaseUser getCurrentUser() {
        return currentUser;
    }

    public String userName(){
        return getCurrentUser().getDisplayName();
    }
}
