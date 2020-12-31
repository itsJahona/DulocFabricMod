package com.jahona.dulocmod;

import com.jahona.dulocmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Dulocmod implements ModInitializer {

    public static final String MOD_ID="dulocmod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();

    }
}
