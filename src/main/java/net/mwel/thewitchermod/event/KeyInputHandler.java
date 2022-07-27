package net.mwel.thewitchermod.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY = "key.category.thewitchermod.category";
    public static final String KEY_OPEN_GUI = "key.thewitchermod.opengui";

    public static KeyBinding openguikey;


    public static void registerKeyInputs(){
                   ClientTickEvents.END_CLIENT_TICK.register(client -> {
                       if(openguikey.wasPressed()){
                           client.player.sendChatMessage("R key was pressed");
           }
        });
    }

    public static void register(){
        openguikey = KeyBindingHelper.registerKeyBinding(new KeyBinding(KEY_OPEN_GUI,InputUtil.Type.KEYSYM,GLFW.GLFW_KEY_R,KEY_CATEGORY));
        registerKeyInputs();
    }

}
