package net.trullyabunny.allos.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trullyabunny.allos.allos;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(allos.MODID);

    public static final DeferredItem<Item> ironhoneycomb = ITEMS.register("ironhoneycomb",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> goldhoneycomb = ITEMS.register("goldhoneycomb",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
