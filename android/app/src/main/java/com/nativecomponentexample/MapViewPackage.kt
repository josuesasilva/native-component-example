package com.nativecomponentexample

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext

open class MapViewPackage : ReactPackage {

    override fun createNativeModules(reactContext: ReactApplicationContext) = mutableListOf<NativeModule>()

    override fun createViewManagers(reactContext: ReactApplicationContext) = mutableListOf(MapViewManager())
}