package com.jahona.dulocmod.registry;

import com.jahona.dulocmod.Dulocmod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ONION = new Item(
            new Item.Settings()
                    .group(ItemGroup.FOOD)
                    .food(new FoodComponent.Builder()
                            .hunger(3)
                            .saturationModifier(3.6f)
                            .snack()
                            .statusEffect(
                                    new StatusEffectInstance(StatusEffects.HASTE, 60*20),
                                    0.5f
                            )
                            .build()
                    )
    );

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Dulocmod.MOD_ID, "onion"), ONION);
    }
}
