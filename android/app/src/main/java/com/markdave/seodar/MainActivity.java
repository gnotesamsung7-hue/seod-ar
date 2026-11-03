package com.markdave.seodar;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;

/**
 * SEOD AR launcher. Opens the hosted web app in a Chrome Custom Tab, so the
 * phone's real browser engine runs it: WebXR AR (tap-to-place, measure),
 * camera, downloads and saved designs all work exactly as on the website.
 * The address lives in res/values/strings.xml (app_url).
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri url = Uri.parse(getString(R.string.app_url));
        try {
            CustomTabColorSchemeParams colors = new CustomTabColorSchemeParams.Builder()
                    .setToolbarColor(0xFF000305)
                    .setNavigationBarColor(0xFF000305)
                    .build();
            CustomTabsIntent tab = new CustomTabsIntent.Builder()
                    .setDefaultColorSchemeParams(colors)
                    .setShowTitle(true)
                    .setUrlBarHidingEnabled(true)
                    .build();
            tab.launchUrl(this, url);
        } catch (ActivityNotFoundException e) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, url));
            } catch (ActivityNotFoundException e2) {
                Toast.makeText(this, "Install Chrome to open SEOD AR", Toast.LENGTH_LONG).show();
            }
        }
        finish();
    }
}
