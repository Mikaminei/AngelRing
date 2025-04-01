package de.mikaminei.simpleangelring;

import de.mikaminei.simpleangelring.util.AngelRing;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SimpleAngelRing.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FallDamageHandler {

    @SubscribeEvent
    public static void onFall(LivingFallEvent event) {
        if (!(event.getEntity() instanceof Player)) return;

        Player player = (Player) event.getEntity();

        if (player.isCreative()) return;

        if (AngelRing.hasAngelRing(player.getInventory())) {
            event.setCanceled(true);
        }
    }
}
