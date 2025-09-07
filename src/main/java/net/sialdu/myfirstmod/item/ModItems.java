package net.sialdu.myfirstmod.item;

import net.sialdu.myfirstmod.MyFirstMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MyFirstMod.MODID);

    /*START REGISTERING ITEMS LIKE THIS HERE*/

    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    /*STOP REGISTERING ITEMS HERE*/

     public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
     }
}
