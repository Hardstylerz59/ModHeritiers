package fr.minecraftforgefrance.client.custommenu;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "custommenu", name = "Custom Menu", version = "1.1.0")
public class ModCustomMenu
{
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        if(event.getSide().isClient())
        {
            FMLCommonHandler.instance().bus().register(this);
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onTick(TickEvent.ClientTickEvent event)
    {
        Minecraft mc = FMLClientHandler.instance().getClient();
        if(mc.currentScreen != null && mc.currentScreen.getClass().equals(GuiMainMenu.class))
        {
            mc.displayGuiScreen(new GuiCustomMainMenu());
        }
    }
}
