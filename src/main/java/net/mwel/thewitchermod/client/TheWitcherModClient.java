package net.mwel.thewitchermod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.mwel.thewitchermod.block.ModBlocks;
import net.mwel.thewitchermod.event.KeyInputHandler;

public class TheWitcherModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        KeyInputHandler.register();

//        Bush Block Renderer
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.celandine_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.crows_eye_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.fools_parsley_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.han_fiber_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.hellebore_petals_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.honeysuckle_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.hop_umbels_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.pringrape_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ranogrin_bush, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.buckthorn_bush, RenderLayer.getCutout());

//        Crop Block Renderer
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.celandine_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.crows_eye_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.fools_parsley_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.han_fiber_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.hellebore_petals_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.honeysuckle_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.hop_umbels_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.pringrape_crop, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ranogrin_crop, RenderLayer.getCutout());

//        Other Renderer
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.cortinarius_mushroom, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.green_mold_wall_plant, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.longrube_mushroom, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.nostrix_wall_plant, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.puffball_mushroom, RenderLayer.getCutout());

    }
}
