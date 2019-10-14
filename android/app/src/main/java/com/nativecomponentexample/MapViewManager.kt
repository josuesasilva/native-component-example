package com.nativecomponentexample

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

open class MapViewManager : SimpleViewManager<MapView>() {

    @ReactProp(name = "zoomEnabled", defaultBoolean = false)
    fun setZoomEnabled(view: MapView, zoomEnabled: Boolean) {

    }

    override fun getName(): String {
        return "MapView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): MapView {
        return MapView(reactContext)
    }
}

class MapView @JvmOverloads constructor(context: Context,
                                        attrs: AttributeSet? = null,
                                        defStyleAttr: Int = 0)
    : FrameLayout(context, attrs, defStyleAttr) {


    init {
        setBackgroundColor(ContextCompat.getColor(context, R.color.grey))
    }
}