package com.botbie.badge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import me.leolin.shortcutbadger.ShortcutBadger;
import android.util.Log;

/**
 * Created by dry on 9/23/16.
 */

public class BadgeNumberModule extends ReactContextBaseJavaModule {

    public BadgeNumberModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "BadgeNumberAndroid";
    }

   /* @ReactMethod
    public void setNumber(int badgeCount) {
       // ShortcutBadger.applyCount(context, badgeCount); //for 1.1.4+
        //ShortcutBadger.with(getApplicationContext()).count(badgeCount); //for 1.1.3
        ShortcutBadger.applyCount(this.getReactApplicationContext(), badgeCount);
        //ShortcutBadger.with(this.getApplicationContext()).count(badgeCount); //for 1.1.3
    }*/
    
    
    @ReactMethod
    public String setNumber(int number) {
       // ShortcutBadger.applyCount(this.getReactApplicationContext(), number);
          try {
            int badgeCount = 25;
            ShortcutBadger.applyCountOrThrow(this.getReactApplicationContext().getApplicationContext(), badgeCount);
            Log.d("Create", "showBadge worked!");
            return "showBadge worked!";
        } catch (Exception e) {
            Log.e("Create", "showBadge failed: " + e.getMessage());
             return "showBadge failed: ";
        }
        // return "Badg Exc Finished";
    }
}
