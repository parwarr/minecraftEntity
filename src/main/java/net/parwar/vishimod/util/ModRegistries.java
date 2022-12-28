package net.parwar.vishimod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.parwar.vishimod.entity.ModEntities;
import net.parwar.vishimod.entity.custom.RaccoonEntity;

public class ModRegistries {
    public static void registerModStuffs() {

        registerAttributes();
    }


    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, RaccoonEntity.setAttributes());
    }
}
