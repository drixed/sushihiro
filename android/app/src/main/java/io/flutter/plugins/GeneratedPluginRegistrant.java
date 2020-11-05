package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.shatsy.admobflutter.AdmobFlutterPlugin;
import dev.gilder.tom.apple_sign_in.AppleSignInPlugin;
import com.deligence.braintree_payment.BraintreePaymentPlugin;
import io.flutter.plugins.connectivity.ConnectivityPlugin;
import io.flutter.plugins.firebaseauth.FirebaseAuthPlugin;
import io.flutter.plugins.firebase.core.FirebaseCorePlugin;
import io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin;
import com.roughike.facebooklogin.facebooklogin.FacebookLoginPlugin;
import com.example.flutternativeimage.FlutterNativeImagePlugin;
import com.flutter_webview_plugin.FlutterWebviewPlugin;
import io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin;
import com.aloisdeniel.geocoder.GeocoderPlugin;
import com.baseflow.geolocator.GeolocatorPlugin;
import com.baseflow.googleapiavailability.GoogleApiAvailabilityPlugin;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import com.iyaffle.launchreview.LaunchReviewPlugin;
import com.baseflow.location_permissions.LocationPermissionsPlugin;
import com.vitanov.multiimagepicker.MultiImagePickerPlugin;
import io.flutter.plugins.packageinfo.PackageInfoPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import com.baseflow.permissionhandler.PermissionHandlerPlugin;
import com.razorpay.razorpay_flutter.RazorpayFlutterPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import com.tekartik.sqflite.SqflitePlugin;
import de.jonasbark.stripepayment.StripePaymentPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import creativecreatorormaybenot.wakelock.WakelockPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    AdmobFlutterPlugin.registerWith(registry.registrarFor("com.shatsy.admobflutter.AdmobFlutterPlugin"));
    AppleSignInPlugin.registerWith(registry.registrarFor("dev.gilder.tom.apple_sign_in.AppleSignInPlugin"));
    BraintreePaymentPlugin.registerWith(registry.registrarFor("com.deligence.braintree_payment.BraintreePaymentPlugin"));
    ConnectivityPlugin.registerWith(registry.registrarFor("io.flutter.plugins.connectivity.ConnectivityPlugin"));
    FirebaseAuthPlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebaseauth.FirebaseAuthPlugin"));
    FirebaseCorePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.core.FirebaseCorePlugin"));
    FirebaseMessagingPlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin"));
    FacebookLoginPlugin.registerWith(registry.registrarFor("com.roughike.facebooklogin.facebooklogin.FacebookLoginPlugin"));
    FlutterNativeImagePlugin.registerWith(registry.registrarFor("com.example.flutternativeimage.FlutterNativeImagePlugin"));
    FlutterWebviewPlugin.registerWith(registry.registrarFor("com.flutter_webview_plugin.FlutterWebviewPlugin"));
    FluttertoastPlugin.registerWith(registry.registrarFor("io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin"));
    GeocoderPlugin.registerWith(registry.registrarFor("com.aloisdeniel.geocoder.GeocoderPlugin"));
    GeolocatorPlugin.registerWith(registry.registrarFor("com.baseflow.geolocator.GeolocatorPlugin"));
    GoogleApiAvailabilityPlugin.registerWith(registry.registrarFor("com.baseflow.googleapiavailability.GoogleApiAvailabilityPlugin"));
    GoogleSignInPlugin.registerWith(registry.registrarFor("io.flutter.plugins.googlesignin.GoogleSignInPlugin"));
    LaunchReviewPlugin.registerWith(registry.registrarFor("com.iyaffle.launchreview.LaunchReviewPlugin"));
    LocationPermissionsPlugin.registerWith(registry.registrarFor("com.baseflow.location_permissions.LocationPermissionsPlugin"));
    MultiImagePickerPlugin.registerWith(registry.registrarFor("com.vitanov.multiimagepicker.MultiImagePickerPlugin"));
    PackageInfoPlugin.registerWith(registry.registrarFor("io.flutter.plugins.packageinfo.PackageInfoPlugin"));
    PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));
    PermissionHandlerPlugin.registerWith(registry.registrarFor("com.baseflow.permissionhandler.PermissionHandlerPlugin"));
    RazorpayFlutterPlugin.registerWith(registry.registrarFor("com.razorpay.razorpay_flutter.RazorpayFlutterPlugin"));
    SharedPreferencesPlugin.registerWith(registry.registrarFor("io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"));
    SqflitePlugin.registerWith(registry.registrarFor("com.tekartik.sqflite.SqflitePlugin"));
    StripePaymentPlugin.registerWith(registry.registrarFor("de.jonasbark.stripepayment.StripePaymentPlugin"));
    UrlLauncherPlugin.registerWith(registry.registrarFor("io.flutter.plugins.urllauncher.UrlLauncherPlugin"));
    VideoPlayerPlugin.registerWith(registry.registrarFor("io.flutter.plugins.videoplayer.VideoPlayerPlugin"));
    WakelockPlugin.registerWith(registry.registrarFor("creativecreatorormaybenot.wakelock.WakelockPlugin"));
    WebViewFlutterPlugin.registerWith(registry.registrarFor("io.flutter.plugins.webviewflutter.WebViewFlutterPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
