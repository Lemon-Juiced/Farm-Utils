package lemon_juice.farm_utils.event;

import lemon_juice.farm_utils.FarmUtils;
import lemon_juice.farm_utils.event.loot.EnderSporeSeedsFromGrassAdditionModifier;
import lemon_juice.farm_utils.event.loot.SeedsFromGrassAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.NewRegistryEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = FarmUtils.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    /*
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(

                //Seeds
                new EnderSporeSeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(FarmUtils.MOD_ID, "ender_spore_seeds_from_grass")),
                new SeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(FarmUtils.MOD_ID, "flax_seeds_from_grass")),
                new SeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(FarmUtils.MOD_ID, "rice_seeds_from_grass")),
                new SeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(FarmUtils.MOD_ID, "strawberry_seeds_from_grass"))
        );
    }
    */
}
