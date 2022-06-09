package lemon_juice.farm_utils.util;

import lemon_juice.farm_utils.FarmUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items{
        public static final TagKey<Item> MILK = forgeTag("milk.json");
        public static final TagKey<Item> SLIMEBALLS = forgeTag("slimeballs.json");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(FarmUtils.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
