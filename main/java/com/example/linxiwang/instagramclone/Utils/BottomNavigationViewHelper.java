package com.example.linxiwang.instagramclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import com.example.linxiwang.instagramclone.Add.AddActivity;
import com.example.linxiwang.instagramclone.Home.HomeActivity;
import com.example.linxiwang.instagramclone.Profile.ProfileActivity;
import com.example.linxiwang.instagramclone.R;


public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationView bottomNavigationView){
     //   bottomNavigationView.enableAnimation(false);
      //  bottomNavigationView.enableItemShiftingMode(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationView view){

        view.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_add:
                        Intent intent2 = new Intent(context, AddActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_profile:
                        Intent intent3 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent3);
                        break;
                }
            }
        });
    }

}
