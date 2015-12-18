package auxchar.mods.repairshower;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraft.util.EnumChatFormatting;

public class TooltipListener {
    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent e) {
        int cost = e.itemStack.getRepairCost();
        if (cost > 0) {
            e.toolTip.add(EnumChatFormatting.RED.toString()+"Repair Cost: "+cost);
        }
    }
}
