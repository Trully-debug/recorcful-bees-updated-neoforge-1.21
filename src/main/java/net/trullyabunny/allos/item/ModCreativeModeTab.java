package net.trullyabunny.allos.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trullyabunny.allos.allos;
import net.trullyabunny.allos.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> creative_mode_tab = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, allos.MODID);

    public static final Supplier<CreativeModeTab> allostab = creative_mode_tab.register("allos", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ironhoneycomb_block.get())).title(Component.translatable("creativetab.allos")).displayItems((ItemDisplayParameters, output) -> {
        output.accept(ModBlocks.ironhoneycomb_block);
        output.accept(ModBlocks.goldhoneycomb_block);
        output.accept(ModItems.goldhoneycomb);
        output.accept(ModItems.ironhoneycomb);
    }).build());

    public static void register(IEventBus eventBus){
        creative_mode_tab.register(eventBus);
    }
}
