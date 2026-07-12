package net.trullyabunny.recorcfulbees.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.IModBusEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trullyabunny.recorcfulbees.RecorcfulBees;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RecorcfulBees.MODID);

    public static final DeferredItem<Item> ironhoneycomb = ITEMS.register("ironhoneycomb",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> goldhoneycomb = ITEMS.register("goldhoneycomb",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
