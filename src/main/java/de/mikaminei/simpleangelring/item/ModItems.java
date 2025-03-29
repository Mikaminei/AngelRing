package de.mikaminei.simpleangelring.item;

import de.mikaminei.simpleangelring.SimpleAngelRing;
import de.mikaminei.simpleangelring.item.custom.AngelRingItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleAngelRing.MOD_ID);

    public static final RegistryObject<Item> RING = ITEMS.register("ring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENERGY_CORE = ITEMS.register("energy_core",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ANGEL_RING = ITEMS.register("angel_ring",
            () -> new AngelRingItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
