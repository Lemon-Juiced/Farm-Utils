package lemon_juice.farm_utils.item;

import lemon_juice.farm_utils.FarmUtils;
import lemon_juice.farm_utils.block.ModBlocks;
import lemon_juice.farm_utils.creative_tab.ModCreativeModeTabs;
import lemon_juice.farm_utils.item.custom_items.consumables.ChocolateMilkItem;
import lemon_juice.farm_utils.item.custom_items.consumables.FreshMilkItem;
import lemon_juice.farm_utils.item.custom_items.consumables.HotCocoaItem;
import lemon_juice.farm_utils.item.custom_items.tools.CraftingToolItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FarmUtils.MOD_ID);

    // Crops
    /* Are Food and Are Seeds*/
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new ItemNameBlockItem(ModBlocks.RICE_PLANT.get(), new Item.Properties().food(ModFoods.RICE).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    /* Are Food and Not Seeds*/
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    /* Not Food and Are Seeds*/
    public static final RegistryObject<Item> ENDER_SPORE_SEEDS = ITEMS.register("ender_spore_seeds", () -> new ItemNameBlockItem(ModBlocks.ENDER_SPORE_PLANT.get(), new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds", () -> new ItemNameBlockItem(ModBlocks.FLAX_PLANT.get(), new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds", () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_PLANT.get(), new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    /* Not Food and Not Seeds*/
    public static final RegistryObject<Item> ENDER_SPORE = ITEMS.register("ender_spore", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> FLAX = ITEMS.register("flax", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    // Food
    /* Basic Foods */
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().food(ModFoods.BUTTER).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoods.CHEESE).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    /* Bread */
    public static final RegistryObject<Item> RICE_BREAD = ITEMS.register("rice_bread", () -> new Item(new Item.Properties().food(ModFoods.RICE_BREAD).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().food(ModFoods.TOAST).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    /* Cheesecakes */
    public static final RegistryObject<Item> CHEESECAKE = ITEMS.register("cheesecake", () -> new Item(new Item.Properties().food(ModFoods.CHEESECAKE).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_CHEESECAKE = ITEMS.register("strawberry_cheesecake", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY_CHEESECAKE).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    /* Chicken Nuggets */
    public static final RegistryObject<Item> COOKED_CHICKEN_NUGGET = ITEMS.register("cooked_chicken_nugget", () -> new Item(new Item.Properties().food(ModFoods.COOKED_CHICKEN_NUGGET).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_CHICKEN_NUGGET = ITEMS.register("raw_chicken_nugget", () -> new Item(new Item.Properties().food(ModFoods.RAW_CHICKEN_NUGGET).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    /* Grilled Cheeses */
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese", () -> new Item(new Item.Properties().food(ModFoods.GRILLED_CHEESE).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> GRILLED_MEAT_AND_CHEESE = ITEMS.register("grilled_meat_and_cheese", () -> new Item(new Item.Properties().food(ModFoods.GRILLED_MEAT_AND_CHEESE).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    /* Ice Cream */
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> NEOPOLITAN_ICE_CREAM = ITEMS.register("neopolitan_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    /* Meat */
    public static final RegistryObject<Item> COOKED_MEAT = ITEMS.register("cooked_meat", () -> new Item(new Item.Properties().food(ModFoods.COOKED_MEAT).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_MEAT = ITEMS.register("raw_meat", () -> new Item(new Item.Properties().food(ModFoods.RAW_MEAT).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    /* Milks */
    public static final RegistryObject<Item> CHOCOLATE_MILK = ITEMS.register("chocolate_milk", () -> new ChocolateMilkItem(new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> FRESH_MILK = ITEMS.register("fresh_milk", () -> new FreshMilkItem(new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hot_cocoa", () -> new HotCocoaItem(new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    /* Yogurt */
    public static final RegistryObject<Item> YOGURT = ITEMS.register("yogurt", () -> new Item(new Item.Properties().food(ModFoods.YOGURT).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    // Generic Items
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> RICE_SLIMEBALL = ITEMS.register("rice_slimeball", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    // Tools
    public static final RegistryObject<Item> MEAT_GRINDER = ITEMS.register("meat_grinder", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> PAN = ITEMS.register("pan", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));
    public static final RegistryObject<Item> POT = ITEMS.register("pot", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.FARM_UTILS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
