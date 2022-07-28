package net.mwel.thewitchermod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mwel.thewitchermod.TheWitcherMod;
import net.mwel.thewitchermod.block.custom.*;
import net.mwel.thewitchermod.item.ModItemGroup;

public class ModBlocks {

    //  Wild Bushes
    public static final Block arenaria_bush = registerBlock("arenaria_bush", new ArenariaBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);
    public static final Block crows_eye_bush = registerBlock("crows_eye_bush", new CrowsEyeBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);
    public static final Block celandine_bush = registerBlock("celandine_bush", new CelandineBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);
    public static final Block fools_parsley_bush = registerBlock("fools_parsley_bush", new FoolsParsleyBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);
    public static final Block hop_umbels_bush = registerBlock("hop_umbels_bush", new HopUmbelsBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);
    public static final Block han_fiber_bush = registerBlock("han_fiber_bush", new HanFiberBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);
    public static final Block hellebore_petals_bush = registerBlock("hellebore_petals_bush", new HelleborePetalsBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);


    // Crop Blocks
    public static final Block arenaria_crop = registerBlockWithoutItem("arenaria_crop", new ArenariaCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block crows_eye_crop = registerBlockWithoutItem("crows_eye_crop", new CrowsEyeCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block celandine_crop = registerBlockWithoutItem("celandine_crop", new CelandineCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block fools_parsley_crop = registerBlockWithoutItem("fools_parsley_crop", new FoolsParsleyCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block hop_umbels_crop = registerBlockWithoutItem("hop_umbels_crop", new HopUmbelsCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block han_fiber_crop = registerBlockWithoutItem("han_fiber_crop", new HanFiberCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block hellebore_petals_crop = registerBlockWithoutItem("hellebore_petals_crop", new HelleborePetalsCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));


//    Other
    public static final Block cortinarius_mushroom = registerBlockWithoutItem("cortinarius_mushroom", new CortinariusMushroomPlant(AbstractBlock.Settings.of(Material.PLANT, MapColor.BROWN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)));
    public static final Block nostrix_wall_plant = registerBlock("nostrix_wall_plant", new NostrixWallPlant(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().nonOpaque().strength(0.2f)), ModItemGroup.THE_WITCHER);



    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(TheWitcherMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TheWitcherMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TheWitcherMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        TheWitcherMod.LOGGER.debug("Registering ModBlocks for " + TheWitcherMod.MOD_ID);
    }

}
