package auxchar.mods.repairshower;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = RepairShower.MODID, version = RepairShower.VERSION)
public class RepairShower {
    public static final String MODID = "repairshower";
    public static final String VERSION = "2.0.0-1.10.2-12.18.1.2094";

    @Instance(value = "repairshower")
    public static RepairShower instance;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        TooltipListener listener = new TooltipListener();
        MinecraftForge.EVENT_BUS.register(listener);
        FMLCommonHandler.instance().bus().register(listener);
    }
}
