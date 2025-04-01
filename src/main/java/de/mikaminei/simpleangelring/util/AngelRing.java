package de.mikaminei.simpleangelring.util;

import de.mikaminei.simpleangelring.item.custom.AngelRingItem;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;

public class AngelRing {

    public static boolean hasAngelRing(Inventory playerInventory) {
        // main inventory
        for (ItemStack itemStack : playerInventory.items) {
            if (itemStack.getItem() instanceof AngelRingItem) {
                return true;
            }
        }

        // armor
        for (ItemStack itemStack : playerInventory.armor) {
            if (itemStack.getItem() instanceof AngelRingItem) {
                return true;
            }
        }

        // off-hand
        if (playerInventory.offhand.get(0).getItem() instanceof AngelRingItem) {
            return true;
        }

        return false;
    }
}
