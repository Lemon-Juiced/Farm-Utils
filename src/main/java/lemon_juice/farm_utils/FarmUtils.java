package lemon_juice.farm_utils;

import lemon_juice.farm_utils.block.ModBlocks;
import lemon_juice.farm_utils.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FarmUtils.MOD_ID)
public class FarmUtils
{
    public static final String MOD_ID = "farm_utils";

    public FarmUtils(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLACK_LOTUS.getId(), ModBlocks.POTTED_BLACK_LOTUS);});
    }

    private void clientSetup(final FMLCommonSetupEvent event) {
        //Crops
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENDER_SPORE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLAX_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RICE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRAWBERRY_PLANT.get(), RenderType.cutout());

        //Flowers
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LOTUS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_BLACK_LOTUS.get(), RenderType.cutout());
    }

}
