package net.parwar.vishimod;

import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import net.parwar.vishimod.entity.ModEntities;
import net.parwar.vishimod.entity.client.RaccoonRenderer;

public class VishiModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);

    }
}
