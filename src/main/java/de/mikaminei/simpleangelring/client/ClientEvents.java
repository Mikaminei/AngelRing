package de.mikaminei.simpleangelring.client;

import de.mikaminei.simpleangelring.SimpleAngelRing;
import de.mikaminei.simpleangelring.util.AngelRing;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SimpleAngelRing.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        LocalPlayer player = Minecraft.getInstance().player;

        if (player == null) return;

        if (player.isCreative()) return;

        Inventory playerInventory = player.getInventory();
        boolean hasRing = AngelRing.hasAngelRing(playerInventory);

        if (hasRing) {
            player.getAbilities().mayfly = true;
        } else {
            player.getAbilities().mayfly = false;
            player.getAbilities().flying = false;
        }
    }
}
