package dev.hiitsdevin.pastelwonderland.Base;

import dev.hiitsdevin.pastelwonderland.PastelWonderland;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;

public class DevDisclaimer {
    public static void init() {
        // renders version text [pls try to keep this to dev environment, comment this out if you're using in production/release. thank you ♥
        HudRenderCallback.EVENT.register((matrices, delta) -> { // i literally have no idea what a matrices and why delta is here but fuck it whatever
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, PastelWonderland.PrototypePastelVersion, 100, 1, 0xFFFFFFFF); // shoot me where it hurts most please.
        });

        // renders Distribution text
        HudRenderCallback.EVENT.register((matrices, delta) -> {
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, PastelWonderland.PrototypePastelDistribution, 100, 11, 0xFFFFFFFF);
        });

    }
}
