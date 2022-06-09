package lemon_juice.farm_utils.item;

import lemon_juice.farm_utils.FarmUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FarmUtils.MOD_ID);

    // Crops
    /* Are Food and Are Seeds*/
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    /* Are Food and Not Seeds*/
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    /* Not Food and Are Seeds*/
    public static final RegistryObject<Item> ENDER_SPORE_SEEDS = ITEMS.register("ender_spore_seeds", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    /* Not Food and Not Seeds*/
    public static final RegistryObject<Item> ENDER_SPORE = ITEMS.register("ender_spore", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> FLAX = ITEMS.register("flax", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    // Food
    /* Basic Foods */
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    /* Bread */
    public static final RegistryObject<Item> RICE_BREAD = ITEMS.register("rice_bread", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    /* Cheesecakes */
    public static final RegistryObject<Item> CHEESECAKE = ITEMS.register("cheesecake", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> STRAWBERRY_CHEESECAKE = ITEMS.register("strawberry_cheesecake", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    /* Chicken Nuggets */
    public static final RegistryObject<Item> COOKED_CHICKEN_NUGGET = ITEMS.register("cooked_chicken_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> RAW_CHICKEN_NUGGET = ITEMS.register("raw_chicken_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    /* Grilled Cheeses */
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> GRILLED_MEAT_AND_CHEESE = ITEMS.register("grilled_meat_and_cheese", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    /* Ice Cream */
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> NEOPOLITAN_ICE_CREAM = ITEMS.register("neopolitan_ice_cream", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    /* Meat */
    public static final RegistryObject<Item> COOKED_MEAT = ITEMS.register("cooked_meat", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> RAW_MEAT = ITEMS.register("raw_meat", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    /* Milks */
    public static final RegistryObject<Item> CHOCOLATE_MILK = ITEMS.register("chocolate_milk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> FRESH_MILK = ITEMS.register("fresh_milk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hot_cocoa", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    /* Yogurt */
    public static final RegistryObject<Item> YOGURT = ITEMS.register("yogurt", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    // Generic Items
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> RICE_SLIMEBALL = ITEMS.register("rice_slimeball", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    // Tools
    public static final RegistryObject<Item> MEAT_GRINDER = ITEMS.register("meat_grinder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> PAN = ITEMS.register("pan", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> POT = ITEMS.register("pot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
