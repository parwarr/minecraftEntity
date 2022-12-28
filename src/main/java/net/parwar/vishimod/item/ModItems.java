package net.parwar.vishimod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.parwar.vishimod.VishiMod;
import net.parwar.vishimod.entity.ModEntities;

public class ModItems {

    public static final Item RUBY_INGOT = registerItem("ruby_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SARI_KOPF = registerItem("sari_kopf",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item ALBION_KOPF = registerItem("albion_kopf",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RACCOON_SPAWN_EGG = registerItem("raccoon_spawn_egg",
        new SpawnEggItem(ModEntities.RACCOON, 0x948e8d, 0x3b3635, new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VishiMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VishiMod.LOGGER.info("Registering Mod Items for " + VishiMod.MOD_ID);
    }

}
