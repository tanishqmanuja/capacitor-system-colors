package com.tanishqmanuja.plugins.colors;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.util.Objects;

@CapacitorPlugin(name = "SystemColors")
public class SystemColorsPlugin extends Plugin {

    private final SystemColors implementation = new SystemColors();

    @PluginMethod
    public void get(PluginCall call) {
        String colorId = call.getString("id");

        String color = implementation.getResourceColor(this.getContext(), colorId);

        if (Objects.equals(color, implementation.NO_RESOURCE_ID_ERROR)){
            call.reject("No ResourceId Found");
            return;
        }

        JSObject ret = new JSObject();
        ret.put("color", color);
        call.resolve(ret);
    }
}
