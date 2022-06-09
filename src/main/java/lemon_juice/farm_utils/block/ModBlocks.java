package lemon_juice.farm_utils.block;

import lemon_juice.farm_utils.FarmUtils;
import lemon_juice.farm_utils.block.crops.EnderSporePlantBlock;
import lemon_juice.farm_utils.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FarmUtils.MOD_ID);

    //Crops
    public static final RegistryObject<Block> ENDER_SPORE_PLANT = registerBlockWithoutBlockItem("ender_spore_plant", () -> new EnderSporePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> FLAX_PLANT = registerBlockWithoutBlockItem("flax_plant", () -> new EnderSporePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RICE_PLANT = registerBlockWithoutBlockItem("rice_plant", () -> new EnderSporePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> STRAWBERRY_PLANT = registerBlockWithoutBlockItem("strawberry_plant", () -> new EnderSporePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    //Flowers
    public static final RegistryObject<Block> BLACK_LOTUS = registerBlock("black_lotus", () -> new FlowerBlock(MobEffects.GLOWING, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> POTTED_BLACK_LOTUS = registerBlockWithoutBlockItem("potted_black_lotus", () -> new FlowerPotBlock(null, ModBlocks.BLACK_LOTUS, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));


    //Meat Blocks
    public static final RegistryObject<Block> COOKED_MEAT_BLOCK = registerBlock("cooked_meat_block", () -> new Block(BlockBehaviour.Properties.of(Material.VEGETABLE).strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAW_MEAT_BLOCK = registerBlock("raw_meat_block", () -> new Block(BlockBehaviour.Properties.of(Material.VEGETABLE).strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    /* Registry Methods */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
