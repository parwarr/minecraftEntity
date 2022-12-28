package net.parwar.vishimod;

import net.fabricmc.api.ModInitializer;
import net.parwar.vishimod.item.ModItems;
import net.parwar.vishimod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class VishiMod implements ModInitializer {

	public static final String MOD_ID = "vishimod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModRegistries.registerModStuffs();
		ModItems.registerModItems();


		GeckoLib.initialize();
	}
}
