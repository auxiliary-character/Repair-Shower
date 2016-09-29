package auxchar.mods.repairshower;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.Container;

public class TooltipListener {
    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent e) {
        int cost = e.getItemStack().getRepairCost();
        if (cost > 0) {
            Container anvil = e.getEntityPlayer().openContainer;
            if (anvil != null && anvil instanceof ContainerRepair) {
                e.getToolTip().add(TextFormatting.RED.toString()+"Repair Cost: "+cost);
            }
        }
    }
}
