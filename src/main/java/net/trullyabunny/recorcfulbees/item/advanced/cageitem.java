package net.trullyabunny.recorcfulbees.item.advanced;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class cageitem extends Item {
    public cageitem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Entity clickedentity = level.getEntity();

        return super.useOn(context);
    }
}
