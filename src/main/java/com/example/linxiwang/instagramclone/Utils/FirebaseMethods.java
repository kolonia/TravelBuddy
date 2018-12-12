package com.example.linxiwang.instagramclone.Utils;

import android.content.Context;
import com.example.linxiwang.instagramclone.R;
import com.example.linxiwang.instagramclone.models.User;
import com.example.linxiwang.instagramclone.models.UserAccountSettings;
import com.example.linxiwang.instagramclone.models.UserSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseMethods {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference myRef;
    private  String userID;

    private Context mContext;

    public FirebaseMethods(Context context){

        mAuth = FirebaseAuth.getInstance();
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        myRef = mFirebaseDatabase.getReference();
        mContext = context;

        if(mAuth.getCurrentUser() != null){
            userID = mAuth.getCurrentUser().getUid();
        }
    }

    public UserSettings getUserSettings(DataSnapshot dataSnapshot){
        UserAccountSettings settings = new UserAccountSettings();
        User user = new User();

        for(DataSnapshot ds: dataSnapshot.getChildren()){
            if(ds.getKey().equals(mContext.getString(R.string.dbname_user_account_settings))){
                settings.setAge(
                    ds.child(userID)
                            .getValue(UserAccountSettings.class)
                            .getAge()
                );
                settings.setBio(
                        ds.child(userID)
                                .getValue(UserAccountSettings.class)
                                .getBio()
                );
                settings.setFavorite_places(
                        ds.child(userID)
                                .getValue(UserAccountSettings.class)
                                .getFavorite_places()
                );
                settings.setInterests(
                        ds.child(userID)
                                .getValue(UserAccountSettings.class)
                                .getInterests()
                );
                settings.setName(
                        ds.child(userID)
                                .getValue(UserAccountSettings.class)
                                .getName()
                );
                settings.setPhoto(
                        ds.child(userID)
                                .getValue(UserAccountSettings.class)
                                .getPhoto()
                );
            }
            if(ds.getKey().equals(mContext.getString(R.string.dbname_users))){
                user.setEmail(
                        ds.child(userID)
                        .getValue(User.class)
                        .getEmail()
                );
            }
        }
        return  new UserSettings(user, settings);
    }

}
