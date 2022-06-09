package lemon_juice.farm_utils.creative_tab;

import lemon_juice.farm_utils.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static CreativeModeTab FARM_UTILS_TAB = new CreativeModeTab("farm_utils_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLAX.get());
        }
    };
}
