package dev.hiitsdevin.pastelwonderland.Client;

import dev.hiitsdevin.pastelwonderland.Base.DevDisclaimer;
import dev.hiitsdevin.pastelwonderland.Entities.Mallards.MallardRenderer;
import dev.hiitsdevin.pastelwonderland.PastelWonderland;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.options.StickyKeyBinding;
import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class PastelWonderlandClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(PastelWonderland.MALLARD, (dispatcher, context) ->
                new MallardRenderer(dispatcher)
        );

        MinecraftClient.getInstance().execute(this::updateTitle);
        KeyBinding DevelopmentKeybind = KeyBindingHelper.registerKeyBinding(new StickyKeyBinding("key.pastelwonderland.development", GLFW.GLFW_KEY_F3, "key.category.pastelwonderland", () -> true));
        ClientTickCallback.EVENT.register(client -> {
            if (DevelopmentKeybind.isPressed()) {
                PastelWonderland.PastelWonderlandVersion = "";
                PastelWonderland.PastelWonderlandDistribution = "";
                PastelWonderland.PastelWonderlandViewDisclaimer = "";
                PastelWonderland.PastelWonderlandFPSDevelopment = "";
            } else {
                PastelWonderland.PastelWonderlandVersion = "Pastel Wonderland - Dev Build: " + PastelWonderland.VERSION;
                PastelWonderland.PastelWonderlandDistribution = "If this build is not public, please do not redistribute it!";
                PastelWonderland.PastelWonderlandViewDisclaimer = "What you see here may not be representative of the final build!";
                PastelWonderland.PastelWonderlandFPSDevelopment = "Game FPS: " + MinecraftClient.getInstance().fpsDebugString;
            }
        });
    }

    private void updateTitle() {
        if (FabricLoader.INSTANCE.isDevelopmentEnvironment()) {
            final Window window = MinecraftClient.getInstance().getWindow();
            window.setTitle("Pastel Wonderland " + PastelWonderland.VERSION + " Development Environment");
        }
    }

    ;
}