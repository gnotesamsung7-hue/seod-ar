# SEOD AR – safety enclosure wizard

Design a clear acrylic safety enclosure with a hinged lid or door, open and close it, and see it at real size through the phone camera.

- **Web app:** https://gnotesamsung7-hue.github.io/seod-ar/
- **Android app:** https://github.com/gnotesamsung7-hue/seod-ar/releases/latest (download `SEOD-AR.apk`)

## Set up (one time, from the GitHub website)

1. Create a new **public** repo named **`seod-ar`**.
2. **Add file → Upload files** and drag in everything from this folder, including the `.github` folder. If the `.github` folder doesn't come across, use **Add file → Create new file**, type the name `.github/workflows/build-apk.yml` and paste the file's contents.
3. **Settings → Pages →** Source: *Deploy from a branch*, Branch: `main`, folder `/ (root)` → Save. After about a minute the web app is live at the address above.
4. **Actions** tab → *Build APK* runs on its own (or press *Run workflow*). When it goes green (about 3–5 minutes), the APK is on the **Releases** page.

## Install the APK on Android

Open the Releases link on the phone (or scan `qr-android-apk.png`), download `SEOD-AR.apk`, open it and allow "Install unknown apps" for Chrome or Files when asked.

The app opens the web app inside Chrome (a Chrome Custom Tab). That way the full Android AR works – tap-to-place at 1:1 and **Measure W / D** – plus the camera, downloads and saved designs. It needs an internet connection and Chrome. Updating `index.html` updates the app too, with no new APK needed.

To point the app at a different address, change `app_url` in `android/app/src/main/res/values/strings.xml`.

## QR codes

- `qr-web-app.png` – opens the web app (print it, or stick it on the work bench).
- `qr-android-apk.png` – opens the APK download page.
- In the app, **QR** shows a live code. *Web app* can carry the current design (size, hinge, parts) so another phone opens the same box. *Android app* points at the APK.
