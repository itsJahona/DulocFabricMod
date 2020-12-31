package com.jahona.dulocmod.registry;

import com.jahona.dulocmod.Dulocmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ONION = new Item(new Item.Settings().group(ItemGroup.FOOD));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Dulocmod.MOD_ID, "onion"), ONION);
    }
}
