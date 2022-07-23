package net.mwel.thewitchermod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
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

    // Flower Blocks

    public static final Block arenaria_flower = registerBlock("arenaria_flower", new FlowerBlock(StatusEffects.BLINDNESS, 12, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().sounds(BlockSoundGroup.GRASS)), ModItemGroup.THE_WITCHER);
    public static final Block celandine_flower = registerBlock("celandine_flower", new FlowerBlock(StatusEffects.GLOWING, 8, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().sounds(BlockSoundGroup.GRASS)), ModItemGroup.THE_WITCHER);



    //  Wild Bushes
    public static final Block crows_eye_bush = registerBlock("crows_eye_bush", new CrowsEyeBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);
    public static final Block celandine_bush = registerBlock("celandine_bush", new CelandineBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().nonOpaque().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.THE_WITCHER);


    // Crop Blocks
    public static final Block arenaria_crop = registerBlockWithoutItem("arenaria_crop", new ArenariaCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block crows_eye_crop = registerBlockWithoutItem("crows_eye_crop", new CrowsEyeCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block celandine_crop = registerBlockWithoutItem("celandine_crop", new CelandineCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));




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
