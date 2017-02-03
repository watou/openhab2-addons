package org.openhab.binding.nest.handler;

import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.openhab.binding.nest.internal.data.Camera;

public class NestCameraHandler extends BaseThingHandler {

    public NestCameraHandler(Thing thing) {
        super(thing);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
    }

    public void updateCamera(Camera camera) {
    }
}
