package net.mwel.thewitchermod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.mwel.thewitchermod.block.ModBlocks;

public class TheWitcherModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

//        Bush Block Renderer
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.crows_eye_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.celandine_bush, RenderLayer.getCutout());


//        Crop Block Renderer
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.crows_eye_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.celandine_crop, RenderLayer.getCutout());

//        Flower Block Renderer
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.arenaria_flower, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.celandine_flower, RenderLayer.getCutout());


    }
}
