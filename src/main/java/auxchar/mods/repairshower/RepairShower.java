package auxchar.mods.repairshower;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = RepairShower.MODID, version = RepairShower.VERSION)
public class RepairShower {
    public static final String MODID = "repairshower";
    public static final String VERSION = "1.1.0-1.8-11.14.4.1563";

    @Instance(value = "repairshower")
    public static RepairShower instance;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        TooltipListener listener = new TooltipListener();
        MinecraftForge.EVENT_BUS.register(listener);
        FMLCommonHandler.instance().bus().register(listener);
    }
}
