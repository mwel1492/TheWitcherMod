package net.mwel.thewitchermod;

import net.fabricmc.api.ModInitializer;
import net.mwel.thewitchermod.block.ModBlocks;
import net.mwel.thewitchermod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TheWitcherMod implements ModInitializer {

	public static final String MOD_ID = "thewitchermod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
